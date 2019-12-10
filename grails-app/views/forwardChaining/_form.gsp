<g:set var="statement" bean="statementService"/>

<g:form class="form-group" name="test" action="save">
  <g:each in="${statement.list(fetch: [tag: params.trastorno])}" var="question">
    <g:if test="${question.literal != 'H' && question.literal != 'I' && question.literal != 'TDHA'}">
      <p>¿${question.descripcion}?</p>
      <g:select class="custom-select" name="${question.literal}" value="${value}" from="${['SI','NO']}"/>
    </g:if>
  </g:each>

  <g:submitButton name="create" class="btn btn-primary btn-block" value="${message(code: 'default.button.create.label', default: 'Create')}" />
</g:form>
