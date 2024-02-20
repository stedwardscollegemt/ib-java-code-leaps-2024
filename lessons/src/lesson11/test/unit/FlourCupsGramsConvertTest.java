package lesson11.test.unit;

import lesson11.FlourCupsGramsConvert;

public class FlourCupsGramsConvertTest {

    private FlourCupsGramsConvert mock;

    public void runTestSuite() {
        this.testConversionHappyPath();
    }
    
    private void setUp() {
        this.mock = new FlourCupsGramsConvert(3);
    }

    private void tearDown() {
        // we did not need this, but it is here anyway because standards
    }

    // Unit tests
    private void testConversionHappyPath() {
        setUp();
        
        double expected = 360;
        double actual = mock.getGrams();

        if (actual == expected) {
            System.out.println("P ");
        } else {
            System.out.println("F ");
        }

        tearDown(); // does nothing, not hurting anyone
    }
}
