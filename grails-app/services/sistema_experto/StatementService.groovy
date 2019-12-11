package sistema_experto

import grails.gorm.services.Service

@Service(Statement)
class StatementService {

    // Statement get(Serializable id)
    //
    // List<Statement> list(Map args)
    //
    // Long count()
    //
    // void delete(Serializable id)
    //
    // Statement save(Statement statement)

    List<Statement> listByTag(String tag){
      Statement.findAllWhere(tipo: Tipo.ANTECEDENTE, tag: tag)
    }

}
