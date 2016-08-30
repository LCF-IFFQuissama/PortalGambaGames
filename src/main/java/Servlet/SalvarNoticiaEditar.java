package Servlet;

import EntidadesNoticias.Noticia;
import EntidadesNoticias.NoticiaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SalvarNoticiaEditar extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            Noticia noticiaVelha = null;
            noticiaVelha = (Noticia)request.getAttribute("NoticiaAtualizar");
            
            if(noticiaVelha != null)
            {
                Noticia noticiaNova = new Noticia();
                NoticiaDAO noticiaDAO = new NoticiaDAO();

                System.out.println("\n\nTá funcionando!\n");

                noticiaNova.setTitulo_noticia(request.getParameter("titulo_noticia"));
                noticiaNova.setSubtitulo_noticia(request.getParameter("subtitulo_noticia"));
                noticiaNova.setTexto_noticia(request.getParameter("texto_noticia"));
                
                noticiaDAO.updateNoticia(noticiaVelha.getPk_noticia(), noticiaNova);
                
                response.sendRedirect("Opcoes.jsp");
            }
            else
            {
                System.out.println("\n\nO ID tá buggado :/\n");
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
