<?php get_header(); ?>
    <section id="main-content">
    	<div class="container-fluid">
    		<div class="col-lg-8 col-lg-offset-2 post">
    			<?php if ( have_posts() ) : while ( have_posts() ) : the_post(); ?>
	    			<div class="bs-component">

		                <div class="post-title">
		            		<h2><?php the_title(); ?></h2>
		                </div>

                        <?php
                            if ( has_post_thumbnail() ) {
                        ?>
                                <a href="<?php the_permalink() ?>">
                                    <?php the_post_thumbnail() ?>
                                </a>
                        <?php   
                            }
                        ?>
                        
	                    <div class="panel-body post-text">
	                      	<p>
	                      		<?php the_content(); ?>
	                      	</p>
	                    </div>
	          		</div>
                <?php endwhile; else: endif;?>
    		</div>
<?php get_footer(); ?>