<?php
/* Template Name: Equipe */
?>
<?php get_header(); ?>
    <section id="main-content">
    	<div class="container-fluid">
    		<div class="col-lg-10 col-lg-offset-1 col-xs-12 team">
				<h1>Equipe do Laboratório</h1>
				<hr>
				<h3>Equipe formada por Bolsistas, Voluntários e Professores</h3>
    			<div class="bs-component">
                  	<div class="row">

		            <?php
						$mypost = array( 'post_type' => 'voluntario', );
					    $loop = new WP_Query( $mypost );
					    $i = 1;
		            ?>
		            <?php while (  $loop->have_posts() ) : $loop->the_post();?>

                  		<div class="col-sm-4">
		                    <?php
		                        if ( has_post_thumbnail() ) {
		                	?>
		                            <a href="<?php the_permalink() ?>">
		                                <?php the_post_thumbnail() ?>
		                            </a>
		                    <?php   
		                        }
		                    ?>
                  			<h5><?php the_title(); ?></h5>
                  			<p>Função (Artista, Programador, etc)</p>
                  		</div>
              		<?php endwhile?>
                  	</div>
          		</div>
    		</div>
		<?php get_footer(); ?>