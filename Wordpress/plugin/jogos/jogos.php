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

	function criando_avaliacao_filmes() {
		register_post_type( 'avaliacao_filmes',
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
			'menu_position' => 3,
			'rewrite' => false,
			'supports' => array( 'title', 'editor', 'comentários', 'thumbnail', 'custom-fields', 'thumbnail' ),
			'taxonomies' => array( '' ),
			'menu_icon' => 'dashicons-lightbulb', //Icone adicionado do Developer Resources: Dashicons
			'has_archive' => true,

			)

		);

	}

	add_action( 'init', 'adicionando_jogo');
?>