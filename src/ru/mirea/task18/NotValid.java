package ru.mirea.task18;

import java.math.BigInteger;

public class NotValid extends Exception {

    private BigInteger innNum;

    public NotValid(BigInteger inn){
        super("ИНН с номером "+ inn + " не действителен!");
        innNum = inn;
    }

    public BigInteger getInnNum() {
        return innNum;
    }
}
