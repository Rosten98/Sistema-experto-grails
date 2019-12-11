<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Sistema experto</title>
</head>
<body>
  <!-- Page Content -->
  <div class="container">

    <!-- Heading Row -->
    <div class="row align-items-center my-5">
      <div class="col-lg-7">
        <g:img dir="images" file="mentalh.jpg" width="500" height="300"/>
      </div>
      <!-- /.col-lg-8 -->
      <div class="col-lg-5">
        <h1 class="font-weight-light mb-3">¡Tu salud mental es importante!</h1>
        <hr>
        <p>La Organización Mundial de la Salud (OMS) reconoce la importancia de la salud mental. “La salud es un estado de completo bienestar físico, mental y social, y no solamente la ausencia de afecciones o enfermedades”.</p>
        <br>
        <p>La salud mental incluye nuestro bienestar emocional, psicológico y social. Afecta la forma en que pensamos, sentimos y actuamos cuando enfrentamos la vida. También ayuda a determinar cómo manejamos el estrés, nos relacionamos con los demás y tomamos decisiones.</p>
        <a class="btn btn-primary mt-3" href="#">Más información</a>
      </div>
      <!-- /.col-md-4 -->
    </div>
    <!-- /.row -->

    <!-- Call to Action Well -->
    <div class="card text-white my-5 py-4 text-center bg-green">
      <div class="card-body">
        <p class="text-white m-0">This call to action card is a great place to showcase some important information or display a clever tagline!</p>
      </div>
    </div>

    <!-- Content Row -->
    <div class="row">
      <div class="col-md-4 mb-5">
        <div class="card h-100">
          <div class="card-body">
            <h2 class="card-title">¿Tienes TDHA?</h2>
            <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Rem magni quas ex numquam, maxime minus quam molestias corporis quod, ea minima accusamus.</p>
          </div>
          <div class="card-footer">
            <g:link class="btn btn-primary btn-sm" action="create" controller="forwardChaining" params="[trastorno: 'TDHA']">Comenzar prueba</g:link>
          </div>
        </div>
      </div>
      <!-- /.col-md-4 -->
      <div class="col-md-4 mb-5">
        <div class="card h-100">
          <div class="card-body">
            <h2 class="card-title">¿Tienes Insomnio</h2>
            <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quod tenetur ex natus at dolorem enim! Nesciunt pariatur voluptatem sunt quam eaque, vel, non in id dolore voluptates quos eligendi labore.</p>
          </div>
          <div class="card-footer">
            <g:link class="btn btn-primary btn-sm" action="create" controller="forwardChaining" params="[trastorno: 'Inmo']">Comenzar prueba</g:link>
          </div>
        </div>
      </div>
      <!-- /.col-md-4 -->
      <div class="col-md-4 mb-5">
        <div class="card h-100">
          <div class="card-body">
            <h2 class="card-title">Card Three</h2>
            <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Rem magni quas ex numquam, maxime minus quam molestias corporis quod, ea minima accusamus.</p>
          </div>
          <div class="card-footer">
            <a href="#" class="btn btn-primary btn-sm">More Info</a>
          </div>
        </div>
      </div>
      <!-- /.col-md-4 -->

    </div>
    <!-- /.row -->

  </div>
  <!-- /.container -->
</body>
</html>
