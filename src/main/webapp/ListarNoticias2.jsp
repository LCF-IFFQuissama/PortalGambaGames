    <%-- 
    Document   : ListaNoticias
    Created on : 21/05/2016, 21:37:36
    Author     : Lucas Craveiro Paes
--%>

<%@page import="EntidadesNoticias.Noticia"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="en">
    <head>
        <link rel="shortcut icon" href="images/gamba.ico" >
        
        <title>Noticías</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="description" content="" />
        <meta name="keywords" content="" />
        <script src="js/jquery.min.js"></script>
        <script src="js/skel.min.js"></script>
        <script src="js/skel-layers.min.js"></script>
        <script src="js/init.js"></script>
        <noscript>
            <link rel="stylesheet" href="css/skel.css" />
            <link rel="stylesheet" href="css/style.css" />
            <link rel="stylesheet" href="css/style-xlarge.css" />
        </noscript>
        <style>
            .row{
                text-decoration: underline !important;
                color: #cee8d8;
            }
        </style>
        <%
            List<Noticia> noticias = (List<Noticia>) request.getAttribute("noticias");
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
                    <li><a href="Index2.jsp">Página Incial</a></li>
                    <li><a href="ListarNoticias">Notícias</a></li>
                    <li><a href="Opcoes.jsp">Opções</a></li>
                    <li><a href="Logout">Logout</a></li>
                </ul>
            </nav>
        </header>
    <!-- Two -->

        <section id="banner" id="two" class="wrapper style2 align-center">
        <!--section id="two" class="wrapper style2 align-center"-->
            <div class="container" style="margin-top:-3em">
                <header>
                        <h2>Notícias e Tutoriais</h2>
                        <p>Todas as notícias do laboratório junto com tutoriais relacionados aos nossos projetos</p>
                </header>
                <div class="row">
                    <%for (Noticia noticia : noticias)
                        {%>
                            <section class="feature 6u 12u (small)">
                                <form method="post" action="NoticiaEscolhida" id="<%=noticia.getPk_noticia()%>">
                                    <a onClick="document.getElementById(<%=noticia.getPk_noticia()%>).submit();">
                                        <img class="image fit" src="images/pic01.jpg" alt="<%=noticia.getTitulo_noticia()%>"/>
                                        <h3 class="title"><%=noticia.getTitulo_noticia()%></h3>
                                        <h4><%=noticia.getSubtitulo_noticia()%></h4>
                                    </a>
                                    <input type="hidden" name="id" value="<%=noticia.getPk_noticia()%>"/>
                                </form>
                            </section>
                        <%}
                    %>
                </div>
            </div>
        </section>
    </body>
</html>