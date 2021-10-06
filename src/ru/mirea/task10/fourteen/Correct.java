package ru.mirea.task10.fourteen;
import java.util.Scanner;

public class Correct {
    static void Correct(int n) //no need to return a value
    {
        if (n/10 > 0)
        {
            Correct(n/10);
        }
        System.out.print(n%10+" ");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Correct(N);


    }
}
