package Btap1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add((int) (Math.random() * 100));
        }
        for (int n : arr) {
            System.out.println(n);
        }
        System.out.println("so lon nhat la: " + Collections.max(arr));
    }
}