<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
    <head>
        <link rel="shortcut icon" href="images/gamba.ico" >
        
        <meta charset="UTF-8">
        <title>Cadastro de Professores</title>
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
        <header id="header">
            <a href="Index2.jsp">
                <img src="images\gamba.png" alt="Gambá" height="120" width="120">
            </a>
            <nav id="nav">
                <ul>
                    <li><a href="Index2.jsp">Página Incial</a></li>
                    <li><a href="ListarNoticias">Notícias</a></li>
                    <li><a href="Login.jsp">Login</a></li>
                </ul>
            </nav>
        </header>
        <form method="post" action="CadastroProfessor">
            <section id="banner">
                <p>Cadastre o Professor</p>
                <ul class="actions">
                    <table>
                        <tr>
                            <td>
                                Nome
                            </td>
                            <td>
                                <input type="text" name="primeiro_nome" value="" />
                            </td>
                        </tr>
                         <tr>
                            <td>
                                Sobrenome
                            </td>
                            <td>
                                <input type="text" name="segundo_nome" value="" />
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
                    </table>
                    <input type="submit" value="Entrar" name="entrar" />
                </ul>
            </section>
        </form>
    </body>
</html>