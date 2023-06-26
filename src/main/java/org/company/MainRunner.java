package org.company;
import java.util.Scanner;
import java.util.logging.Logger;

public class MainRunner {
    private static final Logger log = Logger.getLogger(String.valueOf(MainRunner.class));

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int days;
        while (true) {
            System.out.print("Введите количество дней работы : ");
            days = in.nextInt();
            break;
        }
        RunnerCompany.run();
        for (int i = 0; i < days; i++) {
            log.info("ДЕНЬ " + (i + 1));
            RunnerCompany.company.work();
        }
    }
}
