package com.queue.gou.exchange.impl;

import com.queue.gou.enums.SexEnum;
import com.queue.gou.exchange.SexExchangeV1;
import com.queue.gou.model.QueueGou;

public class SexExchangeV1Impl implements SexExchangeV1 {

    @Override
    public QueueGou toMan(QueueGou queueGou) {
        queueGou.setSex(SexEnum.SEX_MALE);
        return queueGou;
    }

    @Override
    public QueueGou toWoman(QueueGou queueGou) {
        queueGou.setSex(SexEnum.SEX_FEMALE);
        return queueGou;
    }
}
