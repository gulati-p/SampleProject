package test.groovy

import main.groovy.HelloWorld
import org.junit.Before
import org.junit.Test

class HelloWorldTest {

    def subject;

    @Before
    void setup() {
        subject = new HelloWorld();
    }

    @Test
    void testGetMessage() {
        org.junit.Assert.assertEquals("Hello World!", subject.getMessage(false));
    }

}
