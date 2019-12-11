<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'statement.label', default: 'Statement')}" />
        <title><g:message code="default.show.label" args="[entityName]" /></title>
    </head>
    <body>
        <div class="nav" role="navigation">
            <ul>
                <li><g:link class="list" action="index">Regresar al diccionario</g:link></li>
            </ul>
        </div>
        <div id="show-statement" class="content scaffold-show" role="main">
            <h1><g:message code="default.show.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
            </g:if>
            <f:display bean="statement" />
        </div>
    </body>
</html>
