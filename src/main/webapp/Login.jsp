<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
    <head>
        <link rel="shortcut icon" href="images/gamba.ico" >
        
        <meta charset="UTF-8">
        <title>Login | Laboratório de Computação Física</title>
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
            <section id="banner">
                <p>Faça seu login</p><br>
                    <table>
                        <tr>
                            <td>
                                Login
                            </td>
                            <td>
                                <input type="text" name="login" value="" />
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
            </section>
        </form>
    </body>
</html>