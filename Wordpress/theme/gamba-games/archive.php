<?php get_header(); ?>

	<?php 
		$post = $posts[0];
		$title = "Arquivo";
		$posts = "0";

		if (is_category()) {
        	$title =  single_cat_title();
        	$ctg = get_term_by( $title );
        	$posts = $wpdb->get_var("SELECT count FROM wp_term_taxonomy WHERE term_taxonomy_id = " . $ctg->term_id);
    	} elseif (is_day()) {
        	$title = the_time('j de F de Y');
        	$ctg = get_term_by( $title );
        	$posts = $wpdb->get_var("SELECT count FROM wp_term_taxonomy WHERE term_taxonomy_id = " . $ctg->term_id);
    	} elseif (is_month()) {
        	$title = the_time('F de Y');
        	$ctg = get_term_by( $title );
        	$posts = $wpdb->get_var("SELECT count FROM wp_term_taxonomy WHERE term_taxonomy_id = " . $ctg->term_id);
    	} elseif (is_year()) {
        	$title = the_time('Y');
        	$ctg = get_term_by( $title );
        	$posts = $wpdb->get_var("SELECT count FROM wp_term_taxonomy WHERE term_taxonomy_id = " . $ctg->term_id);
    	} elseif (is_author()) {
        	$title = "Arquivo do Autor";
        	$ctg = get_term_by( $title );
        	$posts = $wpdb->get_var("SELECT count FROM wp_term_taxonomy WHERE term_taxonomy_id = " . $ctg->term_id);
    	} elseif (isset($_GET['paged']) && !empty($_GET['paged'])) {
        	$title = "Arquivo do Blog";
        	$ctg = get_term_by( $title );
        	$posts = $wpdb->get_var("SELECT count FROM wp_term_taxonomy WHERE term_taxonomy_id = " . $ctg->term_id);
    } ?>

		<section id="main-content">
			<div class="container">
				<?php if ( have_posts() ) : while ( have_posts() ) : the_post(); ?>

			    	<div class="col-lg-12">
			            <div class="category-header" style="margin-bottom: 30px;">
						    <h2><?php echo $title?></h2>
			        		<div class="post-meta">
			        			<i class="fa fa-folder"></i>&nbsp;
			        			<span><?php echo $posts . "posts" ?></span>
			        		</div>	
			            </div>
			        </div>
			    	<div class="col-lg-8 col-lg-offset-2 post" style="margin-bottom: 20px;">
			            <div class="bs-component">
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
			                            <span><?php the_author_firstname(); the_author_lastname();?></span>
			                            <i class="fa fa-calendar-o"></i>
			                            <span><?php the_time('d \d\e F, Y') ?></span>

			                        </div>
			                    </div>
			                    <div class="panel-body">
			                        <p>
			                            <?php the_excerpt(); ?>
			                        </p>
			                        <a href="<?php the_permalink() ?>" class="btn btn-secondary">Continuar Lendo</a>
			                    </div>
			                </div>

			                <hr>

                		<?php endwhile?>

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
                <?php else: endif; ?>
			</div>
		</section>    
<?php get_footer(); ?>