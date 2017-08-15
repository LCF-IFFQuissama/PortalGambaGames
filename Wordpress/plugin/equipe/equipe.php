<?php 
	/*
		Plugin Name: Equipe
		Plugin URI: http://www.lucascraveiropaes.com/
		Description: Plugin de cadastro da equipe
		Version: 1.0
		Author: Lucas Craveiro Paes
		Author URI: https://www.lucascraveiropaes.com/
		License: GPLv2
	*/

	function adicionando_voluntario() {
		register_post_type( 'voluntario',
			array(
			'labels' => array(
			'name' => 'Equipe',
			'all_items' => 'Todos os Voluntários',
			'singular_name' => 'Equipe',
			'add_new' => 'Adicionar Voluntário',
			'add_new_item' => 'Adicionar Novo Voluntário',
			'edit' => 'Editar',
			'edit_item' => 'Editar Voluntário',
			'new_item' => 'Novo Voluntário',
			'view' => 'Ver',
			'view_item' => 'Ver Voluntário',
			'search_items' => 'Buscar Por Voluntário',
			'not_found' => 'Não Foi Encontrado Nenhum Voluntário',
			'not_found_in_trash' => 'Não Foi Encontrado Nenhum Voluntário no lixo',
			'parent' => 'Pai - Voluntários'
			),

			'public' => true,
			'menu_position' => 16,
			'rewrite' => array( 'slug' => 'equipe' ),
			'supports' => array( 'title', 'editor', 'thumbnail', 'custom-fields', 'excerpt' ),
			'taxonomies' => array( '' ),
			'menu_icon' => 'dashicons-groups',
			'has_archive' => true,

			)

		);

	}

	function include_template_equipe( $template_path ) {
	    
	    if ( get_post_type() == 'voluntario' ) {
	        if ( is_single() ) {
	            if ( $theme_file = locate_template( array ( '/archive-equipe.php' ) ) ) {
	                $template_path = $theme_file;
	            } else {
	                $template_path = plugin_dir_path( __FILE__ ) . '/archive-equipe.php';
	            }
	        }
	 
	    }
	    return $template_path;
	  
	}

	add_action( 'init', 'adicionando_voluntario');

	add_filter( 'template_include', 'include_template_equipe', 1 );
?>