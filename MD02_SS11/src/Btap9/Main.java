package Btap9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add((int) (Math.random() * 100));
        }
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        System.out.println(arr);
        List<Integer> uniqueArr = new ArrayList<>();
        for (Integer num : arr) {
            if (!uniqueArr.contains(num)) {
                uniqueArr.add(num);
            }
        }
        System.out.println(uniqueArr);
    }
}