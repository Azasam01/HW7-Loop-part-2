public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        while (total < 2459000 ){
            total = total + salary;
            total = total + total/100;
            for (int i = 0; i <= 12; i++)
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int v = 1;
        while (v<=10){
            System.out.print(" " + v);
            v = v + 1;
        }
        System.out.println();
        for (int k = 10; k >= 1; k--){
            System.out.print(" " + k);
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthrate = 17;
        int mortality = 8;
        for (int i = 1; i <= 10; i ++){
            population += (population / 1000 * birthrate) - (population / 1000 * mortality);
            System.out.println("Год " + i + " численность населения составляет " + population);
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        double deposit = 15000;
        int goal = 12_000_000;
        int month = 0;
        while ( deposit < goal ){
            month ++;
            deposit *= 1.07;
            System.out.println("Сумма накоплений за " + month + " месяц,равна " + deposit);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        double deposit = 15000;
        int goal = 12_000_000;
        int month = 0;
        while ( deposit < goal ){
            month ++;
            deposit *= 1.07;
            if ( month % 6 == 0)
                System.out.println("Сумма накоплений за " + month + " месяц,равна " + deposit);
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int deposit = 15000;
        int months = 9 * 12;

        for (int i = 1; i <= months; ++i){
            deposit *= 1.07;

            if (i % 6 == 0){
                System.out.println("Сумма накоплений за " + i + " месяц,равна " + deposit);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int day = 5;
        int lastDay = 31;
        for (int i = day; i <= lastDay; i = i + 7){
            System.out.println("Сегодня пятница, " + i + " -е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int currentYear = 2023;
        int startYear = currentYear - 200;
        int finalYear = currentYear + 100;

        for (int i = startYear; i <= finalYear; ++ i){

            if (i % 79 ==0) {
                System.out.println( i );
            }

        }

    }

}

