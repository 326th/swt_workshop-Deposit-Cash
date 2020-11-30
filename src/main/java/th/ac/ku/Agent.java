package th.ac.ku;

public class Agent {

    private float maxCashPerDeposit = 30000f;
    private float minCashPerDeposit = 100f;
    private float maxCashPerDepositDaily = 50000f;

    public boolean checkDepositPerTransaction(float cash) {
        if (cash < minCashPerDeposit){
            return false;
        }
        if (cash > maxCashPerDeposit){
            return false;
        }
        return true;
    }
    public boolean checkDepositTotalTransaction(float cash, float previousTotalCash){
        if (cash + previousTotalCash > maxCashPerDepositDaily){
            return false;
        }
        return true;
    }
}
