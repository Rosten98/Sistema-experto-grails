package sistema_experto

import grails.gorm.services.Service

@Service(ForwardChaining)
interface ForwardChainingService {

    ForwardChaining get(Serializable id)

    List<ForwardChaining> list(Map args)

    Long count()

    void delete(Serializable id)

    ForwardChaining save(ForwardChaining forwardChaining)

}