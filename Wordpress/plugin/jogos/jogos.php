<?php 
	/*
		Plugin Name: Jogos
		Plugin URI: http://www.lucascraveiropaes.com/
		Description: Plugin de cadastro de jogos
		Version: 1.0
		Author: Lucas Craveiro Paes
		Author URI: https://www.lucascraveiropaes.com/
		License: GPLv2
	*/

	function adicionando_jogos() {
		register_post_type( 'jogos',
			array(
			'labels' => array(
			'name' => 'Jogos',
			'all_items' => 'Todos os jogos',
			'singular_name' => 'Jogo',
			'add_new' => 'Adicionar Jogo',
			'add_new_item' => 'Adicionar Novo Jogo',
			'edit' => 'Editar',
			'edit_item' => 'Editar Jogo',
			'new_item' => 'Novo Jogo',
			'view' => 'Ver',
			'view_item' => 'Ver Jogo',
			'search_items' => 'Buscar Por Jogo',
			'not_found' => 'Não Foi Encontrado Nenhum Jogo',
			'not_found_in_trash' => 'Não Foi Encontrado Nenhum Jogo no lixo',
			'parent' => 'Pai - Jogos'
			),

			'public' => true,
			'menu_position' => 15,
			'rewrite' => false,
			'supports' => array( 'title', 'editor', 'thumbnail', 'custom-fields', 'excerpt' ),
			'taxonomies' => array( '' ),
			'menu_icon' => 'dashicons-lightbulb', //Icone adicionado do Developer Resources: Dashicons
			'has_archive' => true,

			)

		);

	}

	function include_template_function( $template_path ) {
	    
	    if ( get_post_type() == 'jogos' ) {
	        if ( is_single() ) {
	            // verifica se o modelo de página existe no thema,
	            // senão utiliza o arquivo do plugin
	            if ( $theme_file = locate_template( array ( '/jogos.php' ) ) ) {
	                $template_path = $theme_file;
	            } else {
	                $template_path = plugin_dir_path( __FILE__ ) . '/single-jogos.php';
	            }
	        }
	 
	    }
	    return $template_path;
	  
	}

	add_action( 'init', 'adicionando_jogos');

	add_filter( 'template_include', 'include_template_function', 1 );
?>