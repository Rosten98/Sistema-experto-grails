<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'forwardChaining.label', default: 'ForwardChaining')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        <h1>Diagnósticos</h1>
        <hr>
        <br>
        <div class="row">
          <div class="mb-5 col-12">
            <div class="card h-100">
              <div class="card-body">
                <h2 class="card-title">Diagnostico de TDHA</h2>
                <p class="card-text">Descripción sobre la prueba e información util antes de contestar</p>
              </div>
              <div class="card-footer">
                <g:link class="btn btn-primary btn-sm" action="create" controller="forwardChaining" params="[trastorno: 'TDHA']">Comenzar prueba</g:link>
              </div>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="mb-5 col-12">
            <div class="card h-100">
              <div class="card-body">
                <h2 class="card-title">Diagnostico de Insomnio</h2>
                <p class="card-text">Descripción sobre la prueba e información util antes de contestar</p>
              </div>
              <div class="card-footer">
                <g:link class="btn btn-primary btn-sm" action="create" controller="forwardChaining" params="[trastorno: 'Inmo']">Comenzar prueba</g:link>
              </div>
            </div>
          </div>
        </div>
        <!-- <g:form name="name" action="action">
          <div class="form-check">
            <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios1" value="option1" checked>
            <label class="form-check-label" for="exampleRadios1">
              Default radio
            </label>
          </div>
          <div class="form-check">
            <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios2" value="option2">
            <label class="form-check-label" for="exampleRadios2">
              Second default radio
            </label>
          </div>
        </g:form> -->
    </body>
</html>
