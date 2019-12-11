package sistema_experto

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class StatementController {

    StatementService statementService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        // respond statementService.list(params), model:[statementCount: statementService.count()]
        respond statementService.list()
    }

    def show(Long id) {
        respond Statement.get(id)
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
