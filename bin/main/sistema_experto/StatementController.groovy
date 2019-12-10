package sistema_experto

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class StatementController {

    StatementService statementService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond statementService.list(params), model:[statementCount: statementService.count()]
    }

    def show(Long id) {
        respond statementService.get(id)
    }

    def create() {
        respond new Statement(params)
    }

    def save(Statement statement) {
        if (statement == null) {
            notFound()
            return
        }

        try {
            statementService.save(statement)
        } catch (ValidationException e) {
            respond statement.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'statement.label', default: 'Statement'), statement.id])
                redirect statement
            }
            '*' { respond statement, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond statementService.get(id)
    }

    def update(Statement statement) {
        if (statement == null) {
            notFound()
            return
        }

        try {
            statementService.save(statement)
        } catch (ValidationException e) {
            respond statement.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'statement.label', default: 'Statement'), statement.id])
                redirect statement
            }
            '*'{ respond statement, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        statementService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'statement.label', default: 'Statement'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'statement.label', default: 'Statement'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
