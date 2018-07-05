package vars.testHelper

import com.lesfurets.jenkins.unit.RegressionTest
import spock.lang.*

class PipelineSpockTestBase extends Specification  implements RegressionTest {

    @Delegate PipelineTestHelper pipelineTestHelper
    def setup() {
        def cwd = System.getProperty("user.dir")
        pipelineTestHelper = new PipelineTestHelper()
        pipelineTestHelper.setUp()
    }
    
}