package demo

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(DemoService)
class DemoServiceSpec extends Specification {

    void "test addition"() {
        expect:
        service.add(2000, 112) == 2112
    }
}
