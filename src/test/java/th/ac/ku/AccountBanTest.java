package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountBanTest {

    @Test
    void deposit_To_Legal_Account_Result_Should_Be_False(){
        //Arrange
        boolean expectedResult = false;
        int targetUserID = 12345678;
        AccountHandler accountHandler = new AccountHandler();
        //Act
        boolean actualResult = accountHandler.checkIfUserIsBanned(targetUserID);
        //Assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void deposit_To_Banned_Account_Result_Should_Be_True(){
        //Arrange
        boolean expectedResult = true;
        int targetUserID = 55555555;
        AccountHandler accountHandler = new AccountHandler();
        //Act
        boolean actualResult = accountHandler.checkIfUserIsBanned(targetUserID);
        //Assert
        assertEquals(expectedResult,actualResult);
    }
}
