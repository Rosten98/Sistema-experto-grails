<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'forwardChaining.label', default: 'ForwardChaining')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        
        <g:link action="create" params="[trastorno: 'TDHA']">Diagnosticar TDHA</g:link>
        <br>
        <g:link action="create" params="[trastorno: 'Inmo']">Diagnosticar Insomnio</g:link>
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
