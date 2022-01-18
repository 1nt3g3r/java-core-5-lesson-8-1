package array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTests {
    public static void main(String[] args) {
        String text = "Igor Matvienko\nIgor Petrenko\nBill Gates";

        Set<String> uniqueNames = new HashSet<>();

        String[] fullNames = text.split("\n");
        for (String fullName : fullNames) {
            String[] nameParts = fullName.split(" ");

            String firstName = nameParts[0];

            uniqueNames.add(firstName);
        }

        System.out.println("uniqueNames = " + uniqueNames);

        Set<String> numbers = new HashSet<>(); // LinkedHashSet<>();
        numbers.add("Abc");
        numbers.add("Abd");
        numbers.add("Aba");
        numbers.add("Abx");
        System.out.println("numbers = " + numbers);

        //1) Разбить текст на строки с имя-отчество
        //2) Из каждой строки получить имя
        //3) Добавить все имена в Set<String>

//        Set<Integer> numbers = new HashSet<>();
//
//        numbers.add(1);
//        numbers.add(2);
//
//        System.out.println("numbers = " + numbers);
    }
}
