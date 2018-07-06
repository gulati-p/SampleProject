package test.groovy

import test.groovy.testHelper.PipelineSpockTestBase

class AbcSpec extends PipelineSpockTestBase {
    def shellMock = Mock(Closure)
    def listShellCmds
    def setup() {
        listShellCmds = []
        helper.registerAllowedMethod('sh', [String.class], shellMock)
    }

    def "test "() {
        when:
        def script = loadScript('src/main/groovy/abc.groovy')
        script.call()

        then:
        1 * shellMock.call(_) >> { List args ->
            listShellCmds << args[0][0]
        }
        assert listShellCmds[0] == 'man grep'
    }
}


