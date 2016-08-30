<%-- 
    Document   : AtualizarInformacoes
    Created on : 06/06/2016, 13:18:50
    Author     : Lucas Craveiro Paes
--%>
<%@page import="EntidadesBolsista.Bolsista"%>
<%@page import="EntidadesNoticias.Noticia"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="shortcut icon" href="images/gamba.ico" >
        
        <meta charset="UTF-8">
        <title>Atualizar Informações | Laboratório de Computação Física</title>
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
            Bolsista bolsista = (Bolsista)session.getAttribute("User2");
            
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
        <form action="AtualizarInformacoes" method="get" id="formulario" autocomplete="off">
            <!-- Banner -->
            <section id="banner">
                <fieldset>
                    <h3>Nome Completo</h3>
                        <input name="nome_completo" type="text" value="<%=bolsista.getNome_completo()%>"><br><br>

                    <h3>e-Mail</h3>
                        <input name="email" type="text" value="<%=bolsista.getEmail()%>"><br><br>

                    <h3>Senha</h3><br>
                        <input name="senha" type="text" value=""><br><br>
                       <br><br>
                                              
                   <input class="button big" value="Atualizar" type="submit">
                </fieldset>
            </section>
        </form>
    </body>
</html>