package ServletsCadastros;

import EntidadesBolsista.Bolsista;
import EntidadesNoticias.NoticiaDAO;
import EntidadesNoticias.Noticia;
import Testes.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CadastroNoticia extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {                      
            HttpSession session = request.getSession();
            
            Bolsista bolsista = (Bolsista)request.getAttribute("Bolsista");
            
            request.setAttribute("bolsista", bolsista);
            
            Noticia noticia = new Noticia();
            NoticiaDAO noticiaDAO = new NoticiaDAO();
            
            noticia.setTitulo_noticia(request.getParameter("titulo_noticia"));
            noticia.setSubtitulo_noticia(request.getParameter("subtitulo_noticia"));
            noticia.setTexto_noticia(request.getParameter("texto_noticia"));
            
            Bolsista user = (Bolsista)session.getAttribute("User2");
            
            noticia.setAutor(user.getNome_completo());
                
            String data = "dd/MM/yyyy";
            String hora = "h:mm - a";
            String data1, hora1;
            
            java.util.Date agora = new java.util.Date();;
            SimpleDateFormat Formatos = new SimpleDateFormat(data);
            data = Formatos.format(agora);
            Formatos = new SimpleDateFormat(hora);
            hora = Formatos.format(agora);
            
            noticia.setData(data);
            noticia.setHora(hora);
            
            response.sendRedirect("Opcoes.jsp");
            
            noticiaDAO.addNoticia(noticia);

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