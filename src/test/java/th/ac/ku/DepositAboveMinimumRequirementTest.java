package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositAboveMinimumRequirementTest {

    @Test
    void deposit_More_Than_100_Total_Result_Should_Be_True(){
        //Arrange
        \
        boolean expectedResult = true;
        float cash = 250f;
        Agent agent = new Agent();
        //Act
        boolean actualResult = agent.checkDepositPerTransaction(cash);
        //Assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void deposit_Equal_100_Total_Result_Should_Be_True(){
        //Arrange
        boolean expectedResult = true;
        float cash = 100f;
        Agent agent = new Agent();
        //Act
        boolean actualResult = agent.checkDepositPerTransaction(cash);
        //Assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void deposit_Less_Than_100_Total_Result_Should_Be_False(){
        //Arrange
        boolean expectedResult = false;
        float cash = 50;
        Agent agent = new Agent();
        //Act
        boolean actualResult = agent.checkDepositPerTransaction(cash);
        //Assert
        assertEquals(expectedResult,actualResult);
    }
}
