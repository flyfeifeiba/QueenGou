package base;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/4/16 19:25
 * @Version 1.0
 */
public abstract class Bank {
    private double oneyearRate = 0.0178;

    private double oneyearNationaldebt = 0.0198;

    private double interestRate = 0.0078;

    private double amount;

    public double getOneyearRate() {
        return oneyearRate;
    }

    public void setOneyearRate(double oneyearRate) {
        this.oneyearRate = oneyearRate;
    }

    public double getOneyearNationaldebt() {
        return oneyearNationaldebt;
    }

    public void setOneyearNationaldebt(double oneyearNationaldebt) {
        this.oneyearNationaldebt = oneyearNationaldebt;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    public abstract double count(double principal);

    public abstract void show();


}
