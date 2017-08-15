
<div class="col-lg-4 visible-lg sidebar">
	<div class="row">
  		<div class="col-sm-6 col-md-12 col-xs-12">
			<div class="bs-component">
    			<div class="panel panel-default">
                    <div class="panel-body">
						<form class="search-form form-group" role="search" action="http://exemplo.com/" id="searchform"  method="get">
                        	<div class="input-group">
		                        <input type="text" class="form-control" placeholder="Pesquise no site" name='s' id='s'>
		                        <span class="input-group-btn">
		                          	<button class="btn btn-default btn-icon" type="button">
		                          		<i class="fa fa-search"></i>
	                          		</button>
		                        </span>
	                        </div>
                        </form>
                    </div>
              	</div>
      		</div>
      	</div>
		<div class="col-lg-12">
          	<div class="panel panel-default widget">
                <div class="panel-heading">
                	<h3>Veja também</h3>
                </div>
                <hr>
                <div class="row">
            	<?php
					$i = 0;
            		$query = new WP_Query( 'post_type=jogos' ); 

            		while($query->have_posts()) : $query->the_post();
            	?>
	                    <div class="col-lg-12">
					  		<?php
					  			if($i > 0)
					  				echo '<hr class="hr-simple">';
					  		?>
		                    <a href="<?php the_permalink() ?>">
			                    <div class="panel-body">
			                    	<div class="col-md-4">
				                        <?php
				                            if ( has_post_thumbnail() ) {
			                        	?>
				                                <a href="<?php the_permalink() ?>" class="widget-link">
				                                    <?php the_post_thumbnail() ?>
				                                </a>
				                        <?php   
			                                }
				                        ?>
			                    	</div>
			                    	<div class="col-md-8">
		                                <a href="<?php the_permalink() ?>" style="text-decoration: none">
		                                    <h4>Jogo: <?php the_title(); ?></h4>
		                                </a>
			                    	</div>
			                    </div>
		                    </a>
	                	</div>
	                	<?php $i++; ?>
            	<?php
            		endwhile;
					wp_reset_postdata();
            	?>
                </div>
      		</div>
  		</div>
  		<div class="col-sm-6 col-md-12 col-xs-12">
			<div class="bs-component">
    			<div class="panel panel-default">
                    <div class="panel-heading" style="margin-bottom: 0px">
                    	<h6>Deseja saber das nossas novidades? Deixe seu email e te avisaremos quando lançarmos algo novo</h6>
                    </div>
                    <div class="panel-body">
                        <form class="search-form form-group" role="search">
                        	<div class="input-group">
		                        <input type="text" class="form-control" placeholder="Digite seu email">
		                        <span class="input-group-btn">
		                          	<button class="btn btn-default btn-icon" type="button">
		                          		<i class="fa fa-envelope"></i>
	                          		</button>
		                        </span>
	                        </div>
                        </form>
                    </div>
              	</div>
  			</div>
  		</div>
		</div>
</div>