package myownlist;

public class MyArrayListTests {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("Igor");

        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(0) = " + list.get(0));

    }
}
