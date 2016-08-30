<%-- 
    Document   : Inicio
    Created on : 21/05/2016, 22:13:17
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
        <script src="js/jquery.min.js"></script>
        <script src="js/skel.min.js"></script>
        <script src="js/skel-layers.min.js"></script>
        <script src="js/init.js"></script>
        <noscript>
                <link rel="stylesheet" href="css/skel.css" />
                <link rel="stylesheet" href="css/style.css" />
                <link rel="stylesheet" href="css/style-xlarge.css" />
        </noscript>
        <%
            EditorDAO eDAO = new EditorDAO();
            
            Editor user = eDAO.getEditor();
        %>
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
                        <li><a href="#">Sobre</a></li>
                        <%
                            if(user.getEditor().equals("batata"))
                            {%>
                                <li><a href="Login.jsp">Login</a></li>
                            <%}
                            else
                            {%>
                                <li><a href="Opcoes.jsp">Opções</a></li>
                                <li><a href="Logout">Logout</a></li>
                            <%}
                        %>
                        
                    </ul>
                </nav>
            </header>

    <!-- Banner -->
            <section id="banner">
                    <h2>Laboratório de Computação Física</h2>
                    <p>Veja e explore nossos projetos</p>
                    <ul class="actions">
                            <li>
                                    <a href="#" class="button big">Galeria</a>
                            </li>
                    </ul>
            </section>

    <!-- One -->
            <section id="one" class="wrapper style1 align-center">
                    <div class="container">
                            <header>
                                    <h2>Projetos em desenvolvimento</h2>
                                    <p>Possuímos diversos projetos em desenvolvimento, saiba mais sobre alguns deles</p>
                            </header>
                            <div class="row 200%">
                                    <section class="4u 12u (small)">
                                            <img src="Paginas/images/games.png" alt="Gambá" height="120" width="120">
                                            <p>Projeto de games envolvendo Patrimonio cultural, coordenado pelo professor Daniel Vasconcelos</p>
                                            <!--<i class="icon big rounded fa-clock-o"></i>-->
                                    </section>
                                    <section class="4u 12u (small)">
                                            <img src="Paginas/images/openhardware2.png" alt="Gambá" height="120" width="120">
                                            <p>Projeto de monitoramento de parâmetros geoquímicos de sistemas lagunares, coordenado pelo professor Renato Gomes</p>
                                    </section>
                                    <section class="4u  12u (small)">
                                            <img src="Paginas/images/games.png" alt="Gambá" height="120" width="120">
                                            <p>Projeto de games envolvendo, patrimonio natural, coordenado pelo professor Luiz Cesar Ali novaes Faria</p>
                                    </section>
                            </div>
                    </div>
            </section>

            <!-- Footer -->
            <footer id="footer" class="noticias">
                    <div class="container">
                            <div class="row">
                                    <section class="4u 12u(medium) 12u(small)">
                                            <h3>Contatos</h3>
                                            <ul class="icons">
                                                    <li><a href="#" class="icon rounded fa-twitter"><span class="label">Twitter</span></a></li>
                                                    <li><a href="#" class="icon rounded fa-facebook"><span class="label">Facebook</span></a></li>
                                                    <li><a href="#" class="icon rounded fa-pinterest"><span class="label">Pinterest</span></a></li>
                                                    <li><a href="#" class="icon rounded fa-google-plus"><span class="label">Google+</span></a></li>
                                                    <li><a href="#" class="icon rounded fa-linkedin"><span class="label">LinkedIn</span></a></li>
                                            </ul>
                                            <ul class="tabular">
                                                    <li>
                                                            <h3>Endereço</h3>
                                                            Av. Amilcar Pereira da Silva, 727, Piteiras<br>
                                                            CEP: 28735 970
                                                    </li>
                                                    <li>
                                                            <h3>Mail</h3>
                                                            <a href="#">blablabla@blablabla.com</a>
                                                    </li>
                                                    <li>
                                                            <h3>Telefone</h3>
                                                            (22) 2768-9200
                                                    </li>
                                            </ul>
                                    </section>
                            </div>
                            <ul class="copyright">
                                    <li>&copy; LCF. Todos os direitos reservados.</li>
                                    <li>Design by Lucas Paes e Caio Faria</li>
                                    <li>Imagens by <a href="http://unsplash.com">Unsplash</a></li>
                            </ul>
                    </div>
            </footer>
    </body>
</html>

<!--DOCTYPE html>
<html lang="en">
	<head>
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

		<header id="header">
			<a href="index.html">
				<img src="images\gamba.png" alt="Gambá" height="120" width="120">
			</a>
			<nav id="nav">
				<ul>
					<li class="active"><a href="index.html">Página Incial</a></li>
					<li><a href="noticias.html">Notícias</a></li>
					<li><a href="generic.html">Sobre</a></li>
					<li><a href="elements.html">Login</a></li>
				</ul>
			</nav>
		</header>

		<section id="banner">
			<h2>Laboratório de Computação Física</h2>
			<p>Veja e explore nossos projetos</p>
			<ul class="actions">
				<li>
					<a href="#" class="button big">Galeria</a>
				</li>
			</ul>
		</section>

		<section id="one" class="wrapper style1 align-center">
			<div class="container">
				<header>
					<h2>Projetos em desenvolvimento</h2>
					<p>Possuímos diversos projetos em desenvolvimento, saiba mais sobre alguns deles</p>
				</header>
				<div class="row 200%">
					<section class="4u 12u (small)">
						<img src="images\games.png" alt="Gambá" height="120" width="120">
						<p>Projeto de games envolvendo Patrimonio cultural, coordenado pelo professor Daniel Vasconcelos</p>
                                        </section>
					<section class="4u 12u (small)">
						<img src="images\openhardware2.png" alt="Gambá" height="120" width="120">
						<p>Projeto de monitoramento de parâmetros geoquímicos de sistemas lagunares, coordenado pelo professor Renato Gomes</p>
					</section>
					<section class="4u  12u (small)">
						<img src="images\games.png" alt="Gambá" height="120" width="120">
						<p>Projeto de games envolvendo, patrimonio natural, coordenado pelo professor Luiz Cesar Ali novaes Faria</p>
					</section>
				</div>
			</div>
		</section>

		<footer id="footer" class="noticias">
			<div class="container">
				<div class="row">
					<section class="4u 12u(medium) 12u(small)">
						<h3>Contatos</h3>
						<ul class="icons">
							<li><a href="#" class="icon rounded fa-twitter"><span class="label">Twitter</span></a></li>
							<li><a href="#" class="icon rounded fa-facebook"><span class="label">Facebook</span></a></li>
							<li><a href="#" class="icon rounded fa-pinterest"><span class="label">Pinterest</span></a></li>
							<li><a href="#" class="icon rounded fa-google-plus"><span class="label">Google+</span></a></li>
							<li><a href="#" class="icon rounded fa-linkedin"><span class="label">LinkedIn</span></a></li>
						</ul>
						<ul class="tabular">
							<li>
								<h3>Endereço</h3>
								Av. Amilcar Pereira da Silva, 727, Piteiras<br>
								CEP: 28735 970
							</li>
							<li>
								<h3>Mail</h3>
								<a href="#">blablabla@blablabla.com</a>
							</li>
							<li>
								<h3>Telefone</h3>
								(22) 2768-9200
							</li>
						</ul>
					</section>
				</div>
				<ul class="copyright">
					<li>&copy; LCF. Todos os direitos reservados.</li>
					<li>Design by Lucas Paes e Caio Faria</li>
					<li>Imagens by <a href="http://unsplash.com">Unsplash</a></li>
				</ul>
			</div>
		</footer>
	</body>
</html-->
