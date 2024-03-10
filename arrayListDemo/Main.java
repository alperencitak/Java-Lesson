package arrayListDemo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //int[] numbers = new int[]{1,2,3};
        //numbers = new int[4];
        //System.out.println(numbers[0]);

        ArrayList numbers = new ArrayList();
        numbers.add(1);
        numbers.add(10);
        numbers.add(28);
        numbers.add("istanbul");
        System.out.println(numbers.size());
        System.out.println(numbers.get(3));
        numbers.set(3, "ankara");
        System.out.println(numbers.get(3));
        numbers.set(3, 79);
        System.out.println(numbers.get(3));
        numbers.remove(0); // 1-10-28-79 => 10-28-79
        System.out.println(numbers.get(2));
        System.out.println(numbers.size());
        for (Object number : numbers) {
            System.out.println(number);
        }
    }
}
