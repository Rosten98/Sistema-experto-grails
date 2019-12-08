package sistema_experto

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class StatementServiceSpec extends Specification {

    StatementService statementService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Statement(...).save(flush: true, failOnError: true)
        //new Statement(...).save(flush: true, failOnError: true)
        //Statement statement = new Statement(...).save(flush: true, failOnError: true)
        //new Statement(...).save(flush: true, failOnError: true)
        //new Statement(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //statement.id
    }

    void "test get"() {
        setupData()

        expect:
        statementService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Statement> statementList = statementService.list(max: 2, offset: 2)

        then:
        statementList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        statementService.count() == 5
    }

    void "test delete"() {
        Long statementId = setupData()

        expect:
        statementService.count() == 5

        when:
        statementService.delete(statementId)
        sessionFactory.currentSession.flush()

        then:
        statementService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Statement statement = new Statement()
        statementService.save(statement)

        then:
        statement.id != null
    }
}
