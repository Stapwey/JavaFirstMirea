package ru.mirea.task1;

import java.util.Arrays;
import java.util.Scanner;

public class TestProgram {
        public static void main(String[] args) {
            System.out.print("1) ");
            int[] b = new int[10];
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < b.length; i++) {
                b[i] = input.nextInt();
            }

            int sum = 0;
            for (int i = 0; i < b.length; i++) {
                sum += b[i];
            }
            System.out.println(sum);

            int i = 0;
            sum = 0;
            while (i < b.length) {
                sum += b[i];
                i++;
            }
            System.out.println(sum);

            i = 0;
            sum = 0;
            do {
                sum += b[i];
                i++;
            }
            while (i < b.length);
            System.out.println(sum);

            System.out.print("2) ");
            System.out.println("Всего аргументов в командной строке: " + args.length);
            //for (String str : args) {
            //  System.out.println("аргумент = " + str);
            //}

            System.out.print("3) ");
            float n = 0;
            while (n < 10) {
                n++;
                float k = 1 / n;
                System.out.print(k + " ");
            }

            System.out.println();
            System.out.print("4) ");
            int[] arr = new int[10];
            for (i = 0; i < arr.length; i++) {
                arr[i] = (int) Math.round((Math.random() * 100));
                System.out.print(arr[i] + " ");
            }
            Arrays.sort(arr);
            System.out.println();
            for (i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }


            System.out.println();
            System.out.print("5) ");
            int numb = input.nextInt();
            Program f1 = new Program();
            System.out.println(f1.Factorial(numb));
        }
}
