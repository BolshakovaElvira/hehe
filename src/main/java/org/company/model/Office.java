package org.company.model;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Office implements Workable {
    private static final Logger log = Logger.getLogger(String.valueOf(Office.class));
    private String name;
    List<Worker> workers = new ArrayList<>();
    private int profit;
    public Office(String name) {
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println(getName());
        for (Worker worker : workers) {
            worker.work();
            profit += worker.getProfit();
        }
        log.info("Общая прибыль офиса " + getName() + " составила " + getProfit());
        //System.out.println("Общая прибыль офиса "+getName()+" составила "+getProfit());
    }

    public String getName() {
        return name;
    }

    public int getProfit() {
        return profit;
    }

    public void add(Worker w) {
        workers.add(w);
    }
}
