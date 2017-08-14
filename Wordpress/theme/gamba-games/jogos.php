<?php get_header(); ?>
	<section id="main-content">
    	<div class="container game-list">
        	<div class="col-lg-12">
                <div class="game-header">
            		<h2>Conheça nossos jogos</h2>
                </div>
            </div>

            <?php
				$mypost = array( 'post_type' => 'jogos', );
			    $loop = new WP_Query( $mypost );
            ?>
            <?php while (  $loop->have_posts() ) : $loop->the_post();?>
				<div class="row">
		        	<div class="col-md-4 col-md-offset-1 col-xs-12 game-preview">
	                    <?php
	                        if ( has_post_thumbnail() ) {
	                	?>
	                            <a href="<?php the_permalink() ?>">
	                                <?php the_post_thumbnail() ?>
	                            </a>
	                    <?php   
	                        }
	                    ?>
	                </div>
		        	<div class="col-md-5 col-xs-12 game-preview">
		                <h3><?php the_title(); ?></h3>
		                <p style="text-align: justify;">
		                	<?php the_excerpt(); ?>
		                </p>
	              		<a href="<?php the_permalink() ?>" class="btn btn-secondary">Ver Jogo</a>
	              		<button type="button" class="btn btn-secondary btn-lg" data-toggle="modal" data-target="#jogo">
						  	<i class="fa fa-share-alt fa-inverse"></i>
						</button>
	                </div>
	            </div>
  			<?php endwhile?>
		        <div class="row">
		            <div class="col-xs-6">
		                <a class="btn btn-link btn-icon more-posts">
		                    <i class="fa fa-arrow-left"></i>
		                    Mais recentes
		                </a>
		            </div>
		            <div class="col-xs-6">
		                <a class="btn btn-link btn-icon more-posts" style="float: right;">
		                    Mais antigos
		                    <i class="fa fa-arrow-right"></i>
		                </a>
		            </div> 
		        </div>
	        </div>
	<?php get_footer(); ?>