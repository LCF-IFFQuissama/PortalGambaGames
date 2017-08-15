<?php
	/* Template Name: Jogos */
?>
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
			    $i = 1;
            ?>
            <?php while (  $loop->have_posts() ) : $loop->the_post();?>
				<div class="row" style="padding-bottom: 20px; margin-bottom: 30px">
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

	                	<?php the_excerpt(); ?>

	              		<a href="<?php the_permalink() ?>" class="btn btn-secondary">Ver Jogo</a>
	              		<button type="button" class="btn btn-secondary btn-lg" data-toggle="modal" data-target="#jogo<?php echo $i ?>">
						  	<i class="fa fa-share-alt fa-inverse"></i>
						</button>
	                </div>
	            </div>

				<!-- Modal -->
				<div class="modal fade" id="jogo<?php echo $i ?>" tabindex="-1" role="dialog">
				  	<div class="modal-dialog" role="document">
				    	<div class="modal-content">
				      		<div class="modal-header">
				        		<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				        		<h4 class="modal-title" style="margin-top: 20px">Compartilhe <i><b><?php the_title(); ?></b></i> nas suas redes sociais</h4>
				      		</div>

				      		<div class="modal-body">
				      			<div class="social-share">
						        	<a href="http://www.facebook.com/share.php?u=<?php echo the_permalink() ?>&t=Venha%20jogar%20<?php the_title(); ?>%20comigo" class="btn btn-facebook" target="_blank">
						        		<i class="fa fa-facebook fa-2x"></i>
					        		</a>
						        	<a href="https://twitter.com/intent/tweet?text=Venha%20jogar%20<?php the_title(); ?>%20comigo%20em%20<?php echo the_permalink()?>%20&hashtags=GambaGames,GG&via=geleiadejogos"" class="btn btn-twitter" target="_blank">
						        		<i class="fa fa-twitter fa-2x"></i>
					        		</a>
						        	<a href="https://plus.google.com/share?url=<?php echo the_permalink() ?>" class="btn btn-google-plus" target="_blank">
						        		<i class="fa fa-google-plus fa-2x"></i>
					        		</a>
						        	<a href="https://www.linkedin.com/cws/share?url=<?php echo the_permalink()?>?name=<?php the_title(); ?>" class="btn btn-linkedin" target="_blank">
						        		<i class="fa fa-linkedin fa-2x"></i>
					        		</a>
				        		</div>
					      	</div>
				      		<div class="modal-footer" style="text-align: center;">
						        <button type="button" class="btn btn-danger" data-dismiss="modal">Cancelar</button>
				      		</div>
						</div>
				  	</div>
				</div>

				<?php $i++ ?>
  			<?php endwhile?>
        </div>

	<style type="text/css">
		p {
			text-align: justify;
		}
	</style>
<?php get_footer(); ?>