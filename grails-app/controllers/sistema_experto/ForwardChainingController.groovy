package sistema_experto

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class ForwardChainingController {

    ForwardChainingService forwardChainingService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond forwardChainingService.list(params), model:[forwardChainingCount: forwardChainingService.count()]
    }

    def show(Long id) {
        respond forwardChainingService.get(id)
    }

    def create() {
        respond new ForwardChaining(params)
    }

    def save(ForwardChaining forwardChaining) {
        if (forwardChaining == null) {
            notFound()
            return
        }

        try {
            forwardChainingService.save(forwardChaining)
        } catch (ValidationException e) {
            respond forwardChaining.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'forwardChaining.label', default: 'ForwardChaining'), forwardChaining.id])
                redirect forwardChaining
            }
            '*' { respond forwardChaining, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond forwardChainingService.get(id)
    }

    def update(ForwardChaining forwardChaining) {
        if (forwardChaining == null) {
            notFound()
            return
        }

        try {
            forwardChainingService.save(forwardChaining)
        } catch (ValidationException e) {
            respond forwardChaining.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'forwardChaining.label', default: 'ForwardChaining'), forwardChaining.id])
                redirect forwardChaining
            }
            '*'{ respond forwardChaining, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        forwardChainingService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'forwardChaining.label', default: 'ForwardChaining'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'forwardChaining.label', default: 'ForwardChaining'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
