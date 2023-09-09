public class Main {
    public static void main(String[] args) {
        //Задача№1
        for (int x = 1; x <= 10; x++) {
            System.out.println( x );
        }
        //Задача№2
        for (int x = 10; x >= 1; x--) {
            System.out.println( x );
        }
        //Задача№3
        for (int x = 0; x <= 17; x = x + 2) {
            System.out.println( x );
        }
        //Задача№4
        for (int x = 10; x >= -10; x--) {
            System.out.println( x );
        }
        //Задача№5
        for (int vis = 1904; vis <= 2096; vis = vis + 4) {
            System.out.println(vis + "Год является високосным.");
        }
        //Задача№6
        for (int x = 7; x <= 98; x = x + 7) {
            System.out.println( x );
        }
        //Задача№7
        for (int x = 1; x <= 512; x = x * 2) {
            System.out.println( x );
        }
        //Задача№8
        int accumulation = 0;
        for (int year = 1; year <= 12; year++ ) {
            accumulation = accumulation + 29000;
            System.out.println(year + " месяц, сумма накоплений равна " + accumulation + " рублей.");
        }
        //Задача№9
        double accumulationi = 0;
        double percent = 0.01;
        for (int yeari = 1; yeari <= 12; yeari++) {
            accumulationi = accumulationi + 29000 + (accumulationi * percent);
            System.out.println(yeari + " месяц, сумма накоплений равна " + accumulationi + " рублей.");
        }
        //Задача№10
        int total;
        for (int number = 1; number <= 10; number++) {
            total = 2 * number;
            System.out.println("2 * " + number + " = " + total);
        }

    }
}