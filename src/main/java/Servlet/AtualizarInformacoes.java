package Servlet;

import EntidadesBolsista.Bolsista;
import EntidadesBolsista.BolsistaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AtualizarInformacoes extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            HttpSession session = request.getSession();
            
            Bolsista bolsista = (Bolsista)session.getAttribute("User2");
            
            BolsistaDAO bDAO = new BolsistaDAO();

            System.out.println("\n\n\n"+request.getParameter("nome_completo"));
            System.out.println(request.getParameter("email"));
            System.out.println(request.getParameter("senha")+"\n\n\n");
            
            bolsista.setEmail(request.getParameter("email"));
            bolsista.setNome_completo(request.getParameter("nome_completo"));
            bolsista.setSenha(request.getParameter("senha"));
            
            response.sendRedirect("Opcoes.jsp");
            
            bDAO.updateBolsista(bolsista.getPk_bolsista(), bolsista);

            out.println("Did work!");
            
            
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
