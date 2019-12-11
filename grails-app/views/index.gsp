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
            <p class="card-text">¿Qué es? Se trata de un trastorno de carácter neurobiológico originado en la infancia que implica un patrón
de déficit de atención, hiperactividad y/o impulsividad, y que en muchas ocasiones está asociado
con otros trastornos comórbidos.</p>
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
            <p class="card-text">El insomnio o la agripnia es un trastorno que consiste en la incapacidad para conciliar el sueño o permanecer dormido. En los pacientes que lo sufren, la duración y la calidad del sueño son bajas e interfiere en su vida cotidiana. Este trastorno se manifiesta con una dificultad para iniciar el sueño, para mantenerlo o mediante un despertar final adelantado.</p>
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
            <h2 class="card-title">¿Tienes algún Tic?</h2>
            <p class="card-text">Los tics son contracciones nerviosas involuntarias que puede implicar cualquier grupo de músculos voluntarios. Los tics pueden ser parcialmente controlados, por lo general por corta duración durante la cual la persona hace un gran esfuerzo para controlarlos.</p>
          </div>
          <div class="card-footer">
            <g:link class="btn btn-primary btn-sm" action="create" controller="forwardChaining" params="[trastorno: 'Tics']">Comenzar prueba</g:link>
          </div>
        </div>
      </div>
      <!-- /.col-md-4 -->
    </div>
    <!-- /.row -->
    <div class="row">
      <div class="col-md-6">
        <div class="card h-100">
          <div class="card-body">
            <h2 class="card-title">¿Tienes trastorno de hipersomnia?</h2>
            <p class="card-text">La hipersomnia idiopática (HI) es un trastorno del sueño en el que la persona está excesivamente somnolienta (hipersomnia) durante el día y tiene una gran dificultad para despertar del sueño. La HI es similar a la narcolepsia en el hecho de que usted siente un sueño extremo.</p>
          </div>
          <div class="card-footer">
            <g:link class="btn btn-primary btn-sm" action="create" controller="forwardChaining" params="[trastorno: 'Hiper']">Comenzar prueba</g:link>
          </div>
        </div>
      </div>
      <div class="col-md-6">
        <div class="card h-100">
          <div class="card-body">
            <h2 class="card-title">¿Tienes trastorno de conducta?</h2>
            <p class="card-text">Un trastorno de conducta es una serie de problemas conductuales y emocionales que se presentan en niños y adolescentes. Los problemas pueden involucrar comportamiento desafiante o impulsivo, consumo de drogas o actividad delictiva.</p>
          </div>
          <div class="card-footer">
            <g:link class="btn btn-primary btn-sm" action="create" controller="forwardChaining" params="[trastorno: 'Con']">Comenzar prueba</g:link>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!-- /.container -->
</body>
</html>
