<%-- 
    Document   : Noticia
    Created on : 07/06/2016, 11:38:34
    Author     : Lucas Craveiro Paes
--%>

<%@page import="EntidadesNoticias.Noticia"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Noticia noticia = (Noticia)request.getAttribute("NoticiaEscolhida123");
%>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
            <link rel="shortcut icon" href="images/gamba.ico" >

            <meta charset="UTF-8">
            <title><%=noticia.getTitulo_noticia()%></title>
            <meta http-equiv="content-type" content="text/html; charset=utf-8" />
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
	</head>
	<body class="landing">

	<!-- Header -->
        <header id="header">
            <a href="Index.jsp">
                <img src="images/gamba.png" alt="Gambá" height="120" width="120">
            </a>
            <nav id="nav">
                <ul>
                    <li><a href="Index.jsp">Página Incial</a></li>
                    <li><a href="ListarNoticias">Notícias</a></li>
                    <li><a href="Login.jsp">Login</a></li>
                </ul>
            </nav>
        </header>

	<!-- Two -->

        <section id="banner" id="two" class="wrapper style2 align-center">
            <div id="noticia" style="margin-top: -3em">
                <h2><%=noticia.getTitulo_noticia()%></h2>
                <h3><strong><%=noticia.getSubtitulo_noticia()%></strong></h3><br>
                <p><%=noticia.getTexto_noticia()%></p><br>
                <p><strong>Autor(es): <%=noticia.getAutor()%></strong></p>
                <p><strong>Escrito às <%=noticia.getHora()%> do dia <%=noticia.getData()%></strong></p>
            </div>
        </section>
    </body>
</html>