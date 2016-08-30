<%-- 
    Document   : SemAcesso
    Created on : 28/05/2016, 18:33:49
    Author     : Lucas Craveiro Paes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>        
            <link rel="shortcut icon" href="images/gamba.ico">
            
            <meta charset="UTF-8">
            <title>Laboratório de Computação Física</title>
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
                    <li><a href="#">Sobre</a></li>
                    <li><a href="Login.jsp">Login</a></li>
                </ul>
            </nav>
        </header>

    <!-- Banner -->
        <section id="banner">
            <h2>Senha ou Login incorretos</h2>
            <p>Por Favor, tente novamente</p>
            <ul class="actions">
                <li>
                    <a href="Login.jsp" class="button alt">Login</a>
                </li>
                <li>
                    <a href="Index.jsp" class="button alt">Início</a>
                </li>
            </ul>
        </section>
    </body>
</html>