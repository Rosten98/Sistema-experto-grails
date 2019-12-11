<g:set var="statement" bean="statementService"/>

<h3>Pequeña descripción sobre el desarrollo de la encuesta</h3>
<br>
<g:form class="form-group" name="test" action="save">
  <g:each in="${statement.listByTag(params.trastorno)}" var="question">
  <p>¿${question.descripcion}?</p>
  <g:select class="custom-select" name="${question.literal}" value="${value}" from="${['SI','NO']}"/>
  </g:each>
  <g:submitButton name="create" class="btn btn-primary btn-block" value="${message(code: 'default.button.create.label', default: 'Create')}" />
</g:form>
