package Btap12;

import java.util.Arrays;
import java.util.IdentityHashMap;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> arr = new MyList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }
        System.out.println(Arrays.toString(arr.getElement()));
        System.out.println(arr.size());
        arr.remove(5);
        System.out.println(Arrays.toString(arr.getElement()));
        System.out.println(arr.size());
        System.out.println(arr.contains(9));
        System.out.println(arr.indexOf(4));
        System.out.println(arr.clear());
        System.out.println(Arrays.toString(arr.getElement()));
        arr.ensureCapacity(10);

    }
}