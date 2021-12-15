package ru.mirea.task27;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        HashMap<String, String> journal = new HashMap<>();

        journal.put("Semenov","Dmitriy");
        journal.put("aaaa1","bbbb1");
        journal.put("aaaa2","bbbb2");
        journal.put("aaaa3","bbbb2");
        journal.put("aaaa4","bbbb4");
        journal.put("aaaa5","bbbb5");
        journal.put("aaaa6","bbbb6");
        journal.put("aaaa7","bbbb7");
        journal.put("aaaa8","bbbb5");
        journal.put("aaaa9","bbbb9");

        HashMap<String, String> jcopy = (HashMap<String, String>) journal.clone();

        for (Map.Entry<String, String> i : jcopy.entrySet()) {
            for (Map.Entry<String, String> j : jcopy.entrySet()) {
                if (i.getValue().equals(j.getValue()) && !(i.getKey().equals(j.getKey()))){
                    journal.remove(j.getKey());
                }
            }
        }

        System.out.println(journal);

    }
}
