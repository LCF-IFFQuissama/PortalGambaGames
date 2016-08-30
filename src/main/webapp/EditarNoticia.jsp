<%-- 
    Document   : EditarNoticia
    Created on : 28/05/2016, 16:57:13
    Author     : Lucas Craveiro Paes
--%>

<%@page import="EntidadesNoticias.Noticia"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="shortcut icon" href="images/gamba.ico" >
        
        <meta charset="UTF-8">
        <title>Editar Notícia | Laboratório de Computação Física</title>
        <meta http-equiv="content-type" content="text/html; charset=utf-8" />
        <meta name="description" content="" />
        <meta name="keywords" content="" />
        <script src="js/jquery.min.js"></script>
        <script src="js/skel.min.js"></script>
        <script src="js/skel-layers.min.js"></script>
        <script src="js/init.js"></script>
        <script src="ckeditor/ckeditor.js"></script>
        <noscript>
            <link rel="stylesheet" href="css/skel.css" />
            <link rel="stylesheet" href="css/style.css" />
            <link rel="stylesheet" href="css/style-xlarge.css" />
        </noscript>
        <%
            Noticia noticia = (Noticia)session.getAttribute("NoticiaEscolhida");
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
                    <li><a href="Opcoes.jsp">Opcoes</a></li>
                    <li><a href="Logout">Logout</a></li>
                </ul>
            </nav>
        </header><!--action="EditarNoticia"-->
        <form action="SalvarNoticiaEditada" method="get" id="formulario" autocomplete="off">
            <!-- Banner -->
            <section id="banner">
                <fieldset style="margin-left: 6em; margin-right: 6em">
                    <h3>Título</h3>
                        <input name="titulo_noticia" type="text" value="<%=noticia.getTitulo_noticia()%>"><br><br>

                    <h3>Subtítulo</h3>
                        <input name="subtitulo_noticia" type="text" value="<%=noticia.getSubtitulo_noticia()%>"><br><br>

                    <h3>Corpo da Notícia</h3><br>
                        <textarea name="texto_noticia" id="corpo_noticia"><%=noticia.getTexto_noticia()%></textarea>
                       <br><br>
                                              
                   <input class="button big" value="Atualizar" type="submit">
                </fieldset>
                    <script>
                        CKEDITOR.replace( 'corpo_noticia' );
                    </script>
                </section>
            </form>
        </body>
</html>