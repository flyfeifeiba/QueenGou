package impl;

import base.Bank;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/4/16 19:31
 * @Version 1.0
 */
public class OneyearNationaldebtAccount extends Bank {
    @Override
    public double count(double principal) {
        double amount =  principal * (1 + this.getOneyearNationaldebt());
        this.setAmount(amount);
        return amount;
    }

    @Override
    public void show() {
        System.out.println(this.getAmount());
    }
}
