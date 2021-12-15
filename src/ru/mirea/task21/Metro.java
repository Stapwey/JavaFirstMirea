package ru.mirea.task21;

import java.util.ArrayList;

public class Metro<T> {
    private ArrayList<String> lines;
    private T t;

    public Metro() {
        lines = new ArrayList<String>();

        lines.add("Sokolnicheskaya");
        lines.add("Borovitskaya");
        lines.add("Kaluzhsko-Rizhskaya");
        lines.add("Arbatsko-pokrovskaya");
        lines.add("Zamoskvorechenskaya");
    }


    public void PrintList(boolean state){
        for(int i = 0; i < lines.size(); i++){
            if(state){
                if(i % 2 == 0)
                    System.out.println("Линия: " + lines.get(i));
            }
            else if(i % 2 == 1)
                System.out.println("Линия: " + lines.get(i));
        }
    }

}
