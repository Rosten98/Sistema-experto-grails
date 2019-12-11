<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'forwardChaining.label', default: 'ForwardChaining')}" />
        <title><g:message code="default.create.label" args="[entityName]" /></title>
    </head>
    <body>
        <h1>Diagnóstico de ${params.trastorno}</h1>
        <hr>
        <br>
        <g:render template="form"/>
    </body>
</html>
