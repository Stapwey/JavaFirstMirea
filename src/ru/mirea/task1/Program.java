package ru.mirea.task1;

public class Program {
        public int Factorial (int n) {
            int res = 1;
            for (int i = 1; i<=n;i++){
                res*=i;
            }
            return res;
        }
}

