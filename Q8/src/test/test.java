package test;

import base.Bank;
import impl.InterestRateAccount;
import impl.OneyearNationaldebtAccount;
import impl.OneyearRateAccount;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/4/16 19:36
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Bank oneyearRateAccount = new OneyearRateAccount();
        oneyearRateAccount.count(100);
        oneyearRateAccount.show();

        Bank oneyearNationaldebtAccount = new OneyearNationaldebtAccount();
        oneyearNationaldebtAccount.count(100);
        oneyearNationaldebtAccount.show();

        Bank interestRateAccount = new InterestRateAccount();
        interestRateAccount.count(100);
        interestRateAccount.show();

    }
}
