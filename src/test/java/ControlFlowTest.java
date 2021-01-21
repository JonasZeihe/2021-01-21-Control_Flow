import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ControlFlowTest {
    @ParameterizedTest
    @CsvSource(
            {
                    "5, red, Maximum number of persons is exceeded",
                    "0, red, Maximum number of persons is not exceeded",
                    "40, yellow, Maximum number of persons is exceeded",
                    "20, yellow, Maximum number of persons is not exceeded",
                    "65, green, Maximum number of persons is exceeded",
                    "55, green, Maximum number of persons is not exceeded"})
        public void personCapacityAlarmTest(int personNum, String alarmLevel, String expectedResult){

            //When
            String result = ControlFlowApp.personCapacityAlarm(personNum, alarmLevel);

            //Then
            assertEquals(expectedResult, result);
        }


/*


    @Test
    public void personCapacityLow(){

        //Given
        int personNum = 20;

        //When
        String result = ControlFlowApp.personCapacityTest(personNum);

        //Then
        assertEquals("Maximum number of persons not exceeded", result);
    }
    @Test
    public void personCapacityEqual(){

        //Input
        int personNum = 30;

        //Actual method
        String result = ControlFlowApp.personCapacityTest(personNum);

        //Comparison
        assertEquals("Maximum number of persons is reached", result);
    }
    @Test
    public void personCapacityHigh(){

        //Input
        int personNum = 30;

        //Actual method
        String result = ControlFlowApp.personCapacityTest(personNum);

        //Comparison
        assertEquals("Maximum number of persons is exceeded", result);
    }
*/

}
