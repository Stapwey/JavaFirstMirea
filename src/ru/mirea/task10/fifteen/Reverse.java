package ru.mirea.task10.fifteen;
import java.util.Scanner;

public class Reverse {
    public static void Reverse(int n){
        System.out.print(n%10);
        if (n>=10){
            Reverse(n/10);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Reverse(N);

    }
}
