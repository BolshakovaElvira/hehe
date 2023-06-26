package org.company;

import org.company.model.Company;
import org.company.model.Office;
import org.company.model.Worker;

public class RunnerCompany {
    public static Company company = new Company();
    public static void run() {
        Worker worker1 = new Worker();
        Worker worker2 = new Worker();
        Worker worker3 = new Worker();
        Office office1 = new Office("Зажигалка");
        office1.add(worker1);
        office1.add(worker2);
        office1.add(worker3);

        Worker worker11 = new Worker();
        Worker worker22 = new Worker();
        Worker worker33 = new Worker();
        Office office2 = new Office("Хлебомяс");
        office2.add(worker11);
        office2.add(worker22);
        office2.add(worker33);

        Worker worker111 = new Worker();
        Worker worker222 = new Worker();
        Worker worker333 = new Worker();
        Office office3 = new Office("Айдидикьюди");
        office3.add(worker111);
        office3.add(worker222);
        office3.add(worker333);

        company.add(office1);
        company.add(office2);
        company.add(office3);
    }
}
