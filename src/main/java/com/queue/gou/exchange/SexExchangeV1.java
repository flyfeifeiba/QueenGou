package com.queue.gou.exchange;

import com.queue.gou.model.QueueGou;

public interface SexExchangeV1 {
    public QueueGou toMan(QueueGou queueGou);

    public QueueGou toWoman(QueueGou queueGou);

}
