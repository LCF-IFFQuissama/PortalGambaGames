<%-- 
    Document   : ListarNoticiasDeletar
    Created on : 27/05/2016, 01:03:06
    Author     : Lucas Craveiro Paes
--%>

<%@page import="EntidadesNoticias.NoticiaDAO"%>
<%@page import="EntidadesNoticias.Noticia"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="pt-br">
    <head>
        <link rel="shortcut icon" href="images/gamba.ico" >
        
        <title>Deletar</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="js/jquery.min.js"></script>
        <script src="js/skel.min.js"></script>
        <script src="js/skel-layers.min.js"></script>
        <script src="js/init.js"></script>
        <noscript>
            <link rel="stylesheet" href="css/skel.css" />
            <link rel="stylesheet" href="css/style.css" />
            <link rel="stylesheet" href="css/style-xlarge.css" />
        </noscript>
        <%
            NoticiaDAO nDAO = new NoticiaDAO();
            
            List<Noticia> noticias = (List<Noticia>)nDAO.listNoticias();
        %>
    </head>
    <body class="landing">

    <!-- Header -->
        <header id="header">
            <a href="Index2.jsp">
                <img src="images/gamba.png" alt="Gambá" height="120" width="120">
            </a>
            <nav id="nav">
                <ul>
                    <li class="active"><a href="Index2.jsp">Página Incial</a></li>
                    <li><a href="ListarNoticias">Galeria</a></li>
                    <li><a href="Opcoes.jsp">Opções</a></li>
                    <li><a href="Logout">Logout</a></li>
                </ul>
            </nav>
        </header>

    <!-- Two -->
        <form action="DeletarNoticia">
            <section id="banner" class="wrapper style2 align-center" style="padding-bottom: 13em">
                <div class="container">
                    <p>Escolha uma notícia para deletar</p><br>
                        <select name="noticia">
                            <option style="color:black" value="-">Escolha uma notícia para deletar</option>
                            <%for (Noticia noticia : noticias)
                            {
                                String option = "";
                                option += "<option style=\"color:black\" value=\""+noticia.getPk_noticia()+"\">"+noticia.getTitulo_noticia()+"</option>";
                            %>
                                <%=option%>
                            <%}%>
                        </select>
                        <br>
                        <input class="button alt" type="submit" value="Deletar"/>
                </div>
            </section>
        </form>
    </body>
</html>