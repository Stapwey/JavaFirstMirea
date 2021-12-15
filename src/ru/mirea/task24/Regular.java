package ru.mirea.task24;

import java.util.regex.Pattern;

public class Regular {
    private static final String POSITIVE_INTEGER_REGEX = "[0-9]+";
    private static final Pattern POSITIVE_INTEGER_PATTERN = Pattern.compile(POSITIVE_INTEGER_REGEX);

    public static final boolean isPositiveInteger(String s) {
        return POSITIVE_INTEGER_PATTERN.matcher(s).matches();
    }
    public static void main(String[] args) {

        String balanceString = "127.0.0.1, 255.255.255.0";

        System.out.println("Совпадения с шаблоном: ");
        System.out.println(isPositiveInteger(balanceString));
    }
}
