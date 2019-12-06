package sistema_experto

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ForwardChainingServiceSpec extends Specification {

    ForwardChainingService forwardChainingService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new ForwardChaining(...).save(flush: true, failOnError: true)
        //new ForwardChaining(...).save(flush: true, failOnError: true)
        //ForwardChaining forwardChaining = new ForwardChaining(...).save(flush: true, failOnError: true)
        //new ForwardChaining(...).save(flush: true, failOnError: true)
        //new ForwardChaining(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //forwardChaining.id
    }

    void "test get"() {
        setupData()

        expect:
        forwardChainingService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<ForwardChaining> forwardChainingList = forwardChainingService.list(max: 2, offset: 2)

        then:
        forwardChainingList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        forwardChainingService.count() == 5
    }

    void "test delete"() {
        Long forwardChainingId = setupData()

        expect:
        forwardChainingService.count() == 5

        when:
        forwardChainingService.delete(forwardChainingId)
        sessionFactory.currentSession.flush()

        then:
        forwardChainingService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        ForwardChaining forwardChaining = new ForwardChaining()
        forwardChainingService.save(forwardChaining)

        then:
        forwardChaining.id != null
    }
}
