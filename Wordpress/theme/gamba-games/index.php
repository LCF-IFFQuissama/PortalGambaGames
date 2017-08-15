<?php get_header(); ?>
	<section id="main-content">
		<div class="container" style="margin-bottom: 30px">
			<div class="col-lg-8 post">
				<div class="bs-component">
					<?php 
						$args = array(
							'post_type' => array( 'post', 'jogos')
						);
						$query = new WP_Query( $args );

						while($query->have_posts()) : $query->the_post();
					?>
				      	<div class="panel panel-default preview">
	                        <?php
	                            if ( has_post_thumbnail() ) {
                        	?>
	                                <a href="<?php the_permalink() ?>">
	                                    <?php the_post_thumbnail() ?>
	                                </a>
	                        <?php   
                                }
	                        ?>
				            <div class="panel-heading">
				              	<h3><?php the_title(); ?></h3>
			                        
		                        <div class="post-meta">
		                            <i class="fa fa-user-o"></i>
		                            <span><?php the_author(); ?></span>
		                            <i class="fa fa-calendar-o"></i>
		                            <span><?php the_time('d \d\e F, Y') ?></span>
		                        </div>
				            </div>
				            <div class="panel-body">
				            	<p>
				              		<?php the_excerpt(); ?>.
				          		</p>
				          		<a href="<?php the_permalink() ?>" class="btn btn-secondary">Continuar Lendo</a>
				            </div>
				  		</div>
				  		<hr>
		  			<?php 
	            		endwhile;
						wp_reset_postdata();
		  			?>
			        <div class="row">
			            <div class="col-xs-6">
			                <span class="btn btn-link btn-icon more-posts">
			                    <?php previous_posts_link('<i class="fa fa-arrow-left"></i> Mais Novos') ?>
			                </span>
			            </div>
			            <div class="col-xs-6">
			                <span class="btn btn-link btn-icon more-posts" style="float: right;">
			                    <?php next_posts_link('Mais Antigos <i class="fa fa-arrow-right"></i>') ?>
			                </span>
			            </div> 
			        </div>
				</div>
			</div>
		<?php get_sidebar(); ?>
	<?php get_footer(); ?>