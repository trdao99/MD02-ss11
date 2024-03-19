package Btap7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add((int) (Math.random() * 100));
        }
        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) %2==0){
                arr.remove(i);
            }
        }
        System.out.println(arr);

    }
}
