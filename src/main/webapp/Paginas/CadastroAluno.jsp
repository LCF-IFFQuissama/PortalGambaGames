<%-- 
    Document   : Cadastro
    Created on : 24/05/2016, 16:42:34
    Author     : Lucas Craveiro Paes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Cadastro</title>
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
        <!--[if lte IE 8]><link rel="stylesheet" href="css/ie/v8.css" /><![endif]-->
    </head>
    <body class="landing">

        <!-- Header -->
        <header id="header">
            <a href="index.html">
                <img src="images\gamba.png" alt="Gambá" height="120" width="120">
            </a>
            <nav id="nav">
                <ul>
                    <li><a href="Index.jsp">Página Incial</a></li>
                    <li><a href="ListarNoticias">Notícias</a></li>
                    <li><a href="generic.html">Sobre</a></li>
                    <li class="active"><a href="login.html">Login</a></li>
                </ul>
            </nav>
        </header>
        <form method="post" action="Login">
            <!-- Banner -->
            <section id="banner">
                <p>Faça seu Cadastro</p>
                <ul class="actions">
                    <table>
                        <tr>
                            <td>
                                Nome
                            </td>
                            <td>
                                <input type="text" name="nome" value="" />
                            </td>
                        </tr>
                        <tr>
                            <td>
                                Email
                            </td>
                            <td>
                                <input type="text" name="email" value="" />
                            </td>
                        </tr>
                        <tr>
                            <td>
                                Senha
                            </td>
                            <td>
                                <input type="password" name="senha" value="" />
                            </td>
                        </tr>

                        <tr>
                            <td>
                                Telefone
                            </td>
                            <td>
                                <input type="text" name="telefone" value="" />
                            </td>
                        </tr>
                    </table>
                    <input type="submit" value="Entrar" name="entrar" />
                </ul>
            </section>
        </form>
    </body>
</html>