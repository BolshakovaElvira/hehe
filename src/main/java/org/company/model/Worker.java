package org.company.model;

import java.util.logging.Logger;

public class Worker implements Workable {
    private static final Logger log = Logger.getLogger(String.valueOf(Worker.class));
    private int profit;

    @Override
    public void work() {
        this.profit = getRandomPay();
        log.info("Работник поднял бабла до " + getProfit());
        //System.out.println("Работник поднял бабла до "+ getProfit() );
    }

    private int getRandomPay() {
        return (int) (10 + Math.random() * 40) * 10;
    }

    public int getProfit() {
        return profit;
    }
}
