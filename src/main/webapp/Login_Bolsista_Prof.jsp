<%-- 
    Document   : Login_Bolsista_Prof
    Created on : 26/05/2016, 14:18:20
    Author     : Lucas Craveiro Paes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <link rel="shortcut icon" href="images/gamba.ico" >
        
        <meta charset="UTF-8">
        <title>Laboratório de Computação Física</title>
        <meta http-equiv="content-type" content="text/html; charset=utf-8" />
        <meta name="description" content="" />
        <meta name="keywords" content="" />
        <!--[if lte IE 8]><script src="css/ie/html5shiv.js"></script><![endif]-->
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
        <form method="post" action="Login">
            <!-- Banner -->
            <section id="banner">
                <p>Escolha a sua opção de login!</p>                
                <ul class="actions">
                    <li>
                        <a href="Login.jsp" class="button">Bolsista</a>
                    </li>
                    <li>
                        <a href="#" class="button">Professor</a>
                    </li>
                </ul>
            </section>
        </form>
    </body>
</html>