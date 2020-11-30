package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositCashTotalTest {

    @Test
    void deposit_Less_Than_50000_Total_Result_Should_Be_True(){
        //Arrange
        boolean expectedResult = true;
        float cash = 5000.00f;
        float previousCash = 40000.00f;
        Agent agent = new Agent();
        //Act
        boolean actualResult = agent.checkDepositTotalTransaction(cash,previousCash);
        //Assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void deposit_Equal_50000_Total_Result_Should_Be_True(){
        //Arrange
        boolean expectedResult = true;
        float cash = 10000.00f;
        float previousCash = 40000.00f;
        Agent agent = new Agent();
        //Act
        boolean actualResult = agent.checkDepositTotalTransaction(cash,previousCash);
        //Assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void deposit_More_Than_50000_Total_Result_Should_Be_False(){
        //Arrange
        boolean expectedResult = false;
        float cash = 5000.00f;
        float previousCash = 50000.00f;
        Agent agent = new Agent();
        //Act
        boolean actualResult = agent.checkDepositTotalTransaction(cash,previousCash);
        //Assert
        assertEquals(expectedResult,actualResult);
    }
}
