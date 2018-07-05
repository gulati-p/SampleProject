
import spock.lang.*
import vars.testHelper.PipelineSpockTestBase

class AbcSpec extends PipelineSpockTestBase {
    def shellMock = Mock(Closure)
    def listShellCmds
    def setup() {
        listShellCmds = []
        helper.registerAllowedMethod('sh', [String.class], shellMock)
    }

    def "test "() {
        when:
        def script = loadScript('src/abc.groovy')
        script.call()

        then:
        1 * shellMock.call(_) >> { List args ->
            listShellCmds << args[0][0]
        }
        assert listShellCmds[0] == 'man grep'
    }
}


