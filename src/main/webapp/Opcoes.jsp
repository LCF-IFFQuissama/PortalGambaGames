<%@page import="EntidadesUser.User"%>
<%@page import="EntidadesBolsista.Bolsista"%>
        
<%    
    User usuario = (User) session.getAttribute("User2");
%>
        
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
            <form method="post" action="Login">
                <!-- Banner -->
                <section id="banner">
                    <p>Seja bem vindo, <%=usuario.getPrimeiro_nome()%>!</p>
                    <p>Escolha a opção desejada!</p>
                    <ul class="actions">
                        <li><a href="AtualizarInformacoes.jsp" class="button">Atualizar Informações</a></li>
                        <li><a href="CadastroNoticia.jsp" class="button">Adicionar Notícia</a></li>
                        <li><a href="ListarNoticiasAtualizar" class="button">Atualizar Notícia</a></li>
                        <li><a href="ListarNoticiasDeletar.jsp" class="button">Excluir Notícia</a></li>
                        <%
                            if(usuario.getTipo() == "P")
                            {
                        %>
                                <li><a href="#" class="button">Adicionar Bolsista</a></li>
                                <li><a href="#" class="button">Excluir Bolsista</a></li>
                                <li><a href="#" class="button">Adicionar Professor</a></li>
                        <%  }
                        %>
                    </ul>
                </section>
            </form>
        </body>
    </html>