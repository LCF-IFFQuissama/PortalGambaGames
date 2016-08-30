package Servlet;

import EntidadesBolsista.Bolsista;
import EntidadesBolsista.BolsistaDAO;
import EntidadesProfessores.Professor;
import EntidadesProfessores.ProfessorDAO;
import EntidadesUser.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            HttpSession session = request.getSession();
            
            Bolsista bolsistaLogado = null;                        
            Professor professorLogado = null;
            User usuario = new User();
            
            BolsistaDAO bDAO = new BolsistaDAO();
            ProfessorDAO pDAO = new ProfessorDAO();
            
            List<Bolsista> bolsistas = (List<Bolsista>) bDAO.listBolsistas();
            List<Professor> professores = (List<Professor>) pDAO.listProfessor();
            
            String login = request.getParameter("login");
            String senha = request.getParameter("senha");
            
            for (Bolsista bolsista : bolsistas)
            {
                if(senha.equals(bolsista.getSenha()) && login.equals(bolsista.getEmail()))
                {                    
                    usuario.setNome_completo(bolsista.getNome_completo());
                    usuario.setEmail(bolsista.getEmail());
                    usuario.setPrimeiro_nome(bolsista.getPrimeiro_nome());
                    usuario.setSenha(bolsista.getSenha());
                    usuario.setTipo("B");
                    usuario.setPk_user(bolsista.getPk_bolsista());
                }
            }
            
            for (Professor professor : professores)
            {
                if(senha.equals(professor.getSenha()) && login.equals(professor.getEmail()))
                {      
                    usuario.setNome_completo(professor.getNome_completo());
                    usuario.setEmail(professor.getEmail());
                    usuario.setPrimeiro_nome(professor.getPrimeiro_nome());
                    usuario.setSenha(professor.getSenha());
                    usuario.setTipo("P");
                    usuario.setPk_user(professor.getPk_professor());
                }
            }
            
            if(usuario.getNome_completo() != null)
            {
                session.setAttribute("User2", usuario);
                
                RequestDispatcher view = request.getRequestDispatcher("Opcoes.jsp");
                view.forward(request,response);
            }
            else if(usuario != null)
            {
                session.setAttribute("User2", null);
                
                RequestDispatcher view = request.getRequestDispatcher("Opcoes.jsp");
                view.forward(request,response);   
            }
            else
            {
                RequestDispatcher view = request.getRequestDispatcher("LoginErrado.jsp");
                view.forward(request,response);                
            }
            
            
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
