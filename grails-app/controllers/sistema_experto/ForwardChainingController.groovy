package sistema_experto

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*
import analizador.*

class ForwardChainingController {

    ForwardChainingService forwardChainingService
    StatementService statementService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond forwardChainingService.list(params), model:[forwardChainingCount: forwardChainingService.count()]
    }

    def show() {
        respond forwardChainingService.get(id)
    }

    def create() {
        respond new ForwardChaining(params)
    }

    def save(ForwardChaining forwardChaining) {
        String hechos = "";
        ArrayList<String> hechosList = new ArrayList<>();
        Lector lector;

        for (key in params.keySet()) {
          if(params.get(key) == 'SI'){
            hechos += ',' + key
            hechosList.add(key)
          }
        }
        lector = new Lector(hechos.substring(1))
        println "Hechos recolectados: ${hechosList}"
        println "Hechos inferidos   : ${lector.forwardChaining.getHechos()}"
        redirect (action: "resultados")
    }

    def resultados(){}

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
