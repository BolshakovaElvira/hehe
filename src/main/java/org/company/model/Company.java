package org.company.model;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Company implements Workable {
    private static final Logger log = Logger.getLogger(String.valueOf(Company.class));
    private int profit;
    List<Office> offices = new ArrayList<>();

    public void work() {
        for (Office office : offices) {
            office.work();
            profit += office.getProfit();
        }
        log.info("Общая прибыль компании составила " + getProfit());
        //System.out.println("Общая прибыль компании составила "+getProfit());
    }

    public int getProfit() {
        return profit;
    }

    public void add(Office o) {
        offices.add(o);
    }
}
