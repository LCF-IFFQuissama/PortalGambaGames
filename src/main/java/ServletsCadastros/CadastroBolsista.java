package ServletsCadastros;

import EntidadesBolsista.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CadastroBolsista extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            Bolsista bolsista = new Bolsista();
            BolsistaDAO bolsistaDAO = new BolsistaDAO();

            bolsista.setPrimeiro_nome(request.getParameter("primeiro_nome"));
            
            String nomeCompleto = "";
            nomeCompleto += request.getParameter("primeiro_nome") + request.getParameter("sobrenome");
            
            bolsista.setNome_completo(nomeCompleto);
            bolsista.setEmail(request.getParameter("email"));
            bolsista.setSenha(request.getParameter("senha"));
            
            response.sendRedirect("Paginas/OpcoesUser.jsp");
            
            bolsistaDAO.addBolsista(bolsista);
            
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
