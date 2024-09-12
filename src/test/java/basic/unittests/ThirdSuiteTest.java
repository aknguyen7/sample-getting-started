package basic.unittests;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class ThirdSuiteTest {
    @Disabled
    @Test
    public void skippedTest1() {
        System.out.println("thirdTest1 successful!");
    }

    @Test
    public void failedTest2() throws Exception {
        fail("Forcing a test failure");
    }

    @Test
    public void errorTest3() throws Exception {
        throw new Exception("Throwing an error");
    }
}
