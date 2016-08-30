<%-- 
    Document   : CadastroNoticia
    Created on : 24/05/2016, 16:46:17
    Author     : Lucas Craveiro Paes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="shortcut icon" href="images/gamba.ico" >
        
        <meta charset="UTF-8">
        <title>Adicionar Noticia | Laboratório de Computação Física</title>
        <meta http-equiv="content-type" content="text/html; charset=utf-8" />
        <meta name="description" content="" />
        <meta name="keywords" content="" />
        <!--[if lte IE 8]><script src="css/ie/html5shiv.js"></script><![endif]-->
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
        <!--[if lte IE 8]><link rel="stylesheet" href="css/ie/v8.css" /><![endif]-->
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
        <form action="CadastroNoticia" method="post" id="formulario" autocomplete="off">
            <!-- Banner -->
            <section id="banner">
                <fieldset>
                    <h3>Título</h3>
                        <input name="titulo_noticia" type="text" placeholder="Digite o TÍTULO da notícia"><br><br>

                    <h3>Subtítulo</h3>
                        <input name="subtitulo_noticia" type="text" placeholder="Digite o SUBTÍTULO da notícia"><br><br>

                    <h3>Corpo da Notícia</h3><br>
                        <textarea name="texto_noticia" id="corpo_noticia"></textarea>
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