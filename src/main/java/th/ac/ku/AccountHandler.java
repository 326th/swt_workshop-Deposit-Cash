package th.ac.ku;

import java.util.*;

public class AccountHandler {
    Integer[] banned = {55555555};
    public boolean checkIfUserIsBanned(int targetUserID) {
        if (Arrays.asList(banned).contains(targetUserID)){
            return true;
        }
        return false;
    }
}
