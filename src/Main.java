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
        int postpone = 15_000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i++;
            total = total + total / 100;
            total = total + postpone;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        System.out.println("    Порядок чисел с помощью цикла while!");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("    Порядок чисел с помощью цикла for!");
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int growth = birthRate - deathRate;
        for (int i = 1; i <= 10; i++) {
            population += population * growth/1000;
            System.out.println("Год " + i + ", численность населения составляет " + population + " человек");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deposit = 15_000;
        for (int i = 1; deposit <= 12_000_000; i++) {
            deposit += (deposit * 7 / 100);
                System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit + " рублей");
            }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int deposit = 15_000;
        for (int i = 1; deposit < 12_000_000; i++) {
            deposit += (deposit * 7 / 100);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int deposit = 15_000;
        int year_9 = 12 * 9;
        int i = 1;
        for (; i < year_9; i++) {
            deposit += (deposit * 7 / 100);
                if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit + " рублей");
            }
        }
        System.out.println("За 9 лет (" + i + " месяцев) , сумма накоплений равна " + deposit + " рублей");
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int oneFriday = 7; oneFriday < 31; oneFriday += 7) {
            if (oneFriday % 7 == 0) {
                System.out.println("Сегодня пятница, " + oneFriday + "-е число. Необходимо подготовить отчет");
            }

        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int yearNow = 2023;
        int twoHundredYearsAgo = yearNow - 200;
        int aHundredYearsAhead = yearNow + 100;
        for (int i = 0; i <= aHundredYearsAhead; i += 79) {
            if (i > twoHundredYearsAgo) {
                System.out.println(i);
            }

        }
    }
}