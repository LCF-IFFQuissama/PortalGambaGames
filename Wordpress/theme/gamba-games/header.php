<?php
    $address = home_url();

    $size = strlen($address);

    $url = substr($address, 0, $size-4);

    function UrlAtual(){
        $dominio= $_SERVER['HTTP_HOST'];
        $url = "http://" . $dominio. $_SERVER['REQUEST_URI'];
        return $url;
    }
?>

<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="author" content="Lucas Craveiro Paes">
        <meta name="description" content="<?php bloginfo('description'); ?>">

        <title>
            <?php
                wp_title('-', 'true', 'right');  bloginfo( 'name' );
            ?> 
        </title>

        <link href="<?php bloginfo( 'template_url' ); ?>/css/bootstrap.min.css" rel="stylesheet">
        <link href="<?php bloginfo( 'template_url' ); ?>/css/gamba.css" rel="stylesheet">

        <link href="<?php bloginfo( 'stylesheet_url' ); ?>" rel="stylesheet">


        <!-- Fonte de Ícones -->
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    </head>
    <body cz-shortcut-listen="true">

        <!-- Menu -->
        <div class="bs-component">
            <nav class="navbar navbar-default">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a href="<?php echo get_home_url(); ?>">
                            <img src="<?php bloginfo( 'template_url' ); ?>/imagens/brand.png" class="navbar-brand img-responsive">
                        </a>
                    </div>

                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav navbar-right">
                            <li>
                                <a href="<?php echo get_home_url(); ?>">
                                    Início
                                </a>
                            </li>
                            <li>
                                <a href="<?php echo get_home_url(); ?>/sobre">
                                	Sobre
                                </a>
                            </li>
                            <li>
                                <a href="<?php echo get_home_url(); ?>/equipe">
                                	Equipe
                                </a>
                            </li>
                            <li>
                                <a href="<?php echo get_home_url(); ?>/jogos">
                                	Jogos
                                </a>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
                                	Tutoriais
                                	<span class="caret"></span>
                            	</a>

                                <ul class="dropdown-menu" role="menu">
                                    <?php 
                                        wp_list_categories( array(
                                                'orderby' => 'name',
                                                'title_li' => ''
                                            ) 
                                        );
                                    ?>                                    
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </div>