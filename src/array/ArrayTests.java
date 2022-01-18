package array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ArrayTests {
    public static void main(String[] args) {
//        String[] names = new String[5];
//        names[5] = "John";

        new LinkedList<>();
        List<String> names = new ArrayList<>();

        //TOP
        //1) add
        //2) get(i)
        //3) size()
        //4) isEmpty()
        //5) remove
        add(names, "Ivan");
        add(names, "Igor");
        add(names, "Igor");

        names.add(1, "John");

//        System.out.println("names.size() = " + names.size());
//        System.out.println("names = " + names);
//
//        System.out.println("names.get(0) = " + names.get(0));
//        System.out.println("names.get(1) = " + names.get(1));
//
//        System.out.println("names.remove(0) = " + names.remove(0));
//        System.out.println("names = " + names);

        if (names.isEmpty()) {
            System.out.println("No names");
        } else {
            System.out.println("There are names");
        }

        for (String name : names) {
            System.out.println("names.get(i) = " + name);
        }
    }

    private static void add(List<String> names, String name) {
        if (names.contains(name)) {
            return;
        }

        names.add(name);
    }
}
