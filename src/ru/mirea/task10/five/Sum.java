package ru.mirea.task10.five;
import java.util.Scanner;

public class Sum {
    public static int Sum(int y){
        if (y/10>=1)
        {
            int tmp = y%10;
            int rem = y/10;
            return tmp + Sum(rem);
        }
        else
            return y;
    }

    public static void main(String[] args) {
        int sum = 0;
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        sum = Sum(N);
        System.out.println(sum);
    }
}
