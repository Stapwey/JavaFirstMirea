package ru.mirea.task10.eight;

public class Palindrome {
    private static String Palindrome(String s) {
        int length = s.length();
        if (length < 2)
            return "YES";
        else {
            if (s.charAt(0) != s.charAt(length - 1))
                return "NO";
            else
                return Palindrome(s.substring(1, length - 1));
        }
    }

    public static void main(String[] args) {
        String wort = "relieffeiler";
        System.out.println(Palindrome(wort));
        wort = "relieffeilerr";
        System.out.println(Palindrome(wort));
    }
}
