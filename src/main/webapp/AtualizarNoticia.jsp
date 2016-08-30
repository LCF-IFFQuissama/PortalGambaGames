<%-- 
    Document   : AtualizarNoticia
    Created on : 27/05/2016, 00:58:54
    Author     : Lucas Craveiro Paes
--%>

<%@page import="EntidadesNoticias.Noticia"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="shortcut icon" href="images/gamba.ico" >
        
        <meta charset="UTF-8">
        <title>Atualizar Noticia</title>
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
            Noticia noticia = new Noticia();
            noticia = (Noticia)request.getAttribute("Noticia");
            
            Integer ID = null;
            ID = noticia.getPk_noticia();
            
            request.setAttribute("IDNoticia", ID);
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
                    <li><a href="#">Sobre</a></li>
                    <li><a href="Logout">Logout</a></li>
                </ul>
            </nav>
        </header>
        <form action="CadastroNoticia" method="post" id="formulario" autocomplete="off">
            <!-- Banner -->
            <section id="banner">
                <fieldset>
                    <h3>Título</h3>
                    <input name="titulo_noticia" type="text" value="<%=noticia.getTitulo_noticia()%>"><br><br>

                    <h3>Subtítulo</h3>
                        <input name="subtitulo_noticia" type="text" value="<%=noticia.getSubtitulo_noticia()%>"><br><br>

                    <h3>Corpo da Notícia</h3><br>
                    <textarea name="texto_noticia" id="corpo_noticia" value="<%=noticia.getTexto_noticia()%>"></textarea>
                       <br><br>
                       
                   <input class="button big" type="submit" value="Entrar"/>
                </fieldset>
                    <script>
                        CKEDITOR.replace( 'corpo_noticia' );
                    </script>
                </section>
            </form>
        </body>
</html>