package com.telran.org.lessonFive;

import java.util.Scanner;

public class MainAppThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-Hello!, 2-Bye!, 3-End program");
        int num = scanner.nextInt();
        // ==
        // num == 1 -проверка, что num равна 1 и возврат результата true, false
        // boolean result = - присвоение в переменную резалт , того что получилось выше
        // boolean result = num == 1;
        // Если (логическое выражение) {
        //      логическое выражение = истина, то выполняем код тут
        // } Иначе {
        //    логическое выражение = ложь, то выполняем код тут
        // }
        // example num = 5
        if (num == 1) {
            System.out.println("You input 1 - Hello!");
        }

        if (num == 2) {
            System.out.println("You input 2 - Bye!");
        }

        if (num == 3) {
            System.out.println("You input 3 - End program");
        }
    }
}