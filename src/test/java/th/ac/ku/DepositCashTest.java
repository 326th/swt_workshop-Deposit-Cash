package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositCashTest {

    @Test
    void deposit_Less_Than_30000_Result_Should_Be_True(){
        //Arrange
        boolean expectedResult = true;
        float cash = 5000.00f;
        Agent agent = new Agent();
        //Act
        boolean actualResult = agent.checkDepositPerTransaction(cash);
        //Assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void deposit_Equal_30000_Result_Should_Be_True(){
        //Arrange
        boolean expectedResult = true;
        float cash = 30000.00f;
        Agent agent = new Agent();
        //Act
        boolean actualResult = agent.checkDepositPerTransaction(cash);
        //Assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void deposit_More_Than_30000_Result_Should_Be_False(){
        //Arrange
        boolean expectedResult = false;
        float cash = 32000.00f;
        Agent agent = new Agent();
        //Act
        boolean actualResult = agent.checkDepositPerTransaction(cash);
        //Assert
        assertEquals(expectedResult,actualResult);
    }
    //2 แยก ไฟล์
    //3 แยก ไฟล์
    //4 100 baht min แยก ไฟล์
}
