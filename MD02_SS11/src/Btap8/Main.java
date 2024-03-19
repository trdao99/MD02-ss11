package Btap8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add((int) (Math.random() * 100));
        }
        System.out.println(arr);

        List<Integer> arr01 = new ArrayList<>();
        Collections.addAll(arr01, arr.toArray(new Integer[0]));
        System.out.println(arr01);
    }
}