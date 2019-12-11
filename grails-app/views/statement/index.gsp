<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'statement.label', default: 'Statement')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        <h1>Diccionario</h1>
        <hr>
        <br>
        <div id="list-statement" class="content scaffold-list" role="main">
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            <f:table collection="${statementList}" />

            <div class="pagination">
                <g:paginate total="${statementCount ?: 0}" />
            </div>
        </div>
    </body>
</html>
