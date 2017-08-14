<?php get_header(); ?>
	<section id="main-content">
		<div class="container" style="margin-bottom: 30px">
			<div class="col-lg-8 post">
				<div class="bs-component">
					<?php if ( have_posts() ) : while ( have_posts() ) : the_post(); ?>
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
		  			<?php else: endif; ?>
				</div>
			</div>
		<?php get_sidebar(); ?>
	<?php get_footer(); ?>