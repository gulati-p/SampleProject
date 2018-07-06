package test.groovy.testHelper

import com.lesfurets.jenkins.unit.BasePipelineTest

class PipelineTestHelper extends BasePipelineTest {
    @Override
    void setUp() {
        helper.scriptRoots = ['']
        helper.scriptExtension = ''
        Object.setUp()
    }
}