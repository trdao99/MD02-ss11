package Baitap3;

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

        Collections.sort(arr);
        Collections.reverse(arr);
        System.out.println(arr);

    }
}