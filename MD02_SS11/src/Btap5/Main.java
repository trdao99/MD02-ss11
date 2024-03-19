package Btap5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String tt = "Rekkei Academy để nông dân biết code";
        String[] arr01 = tt.split(" ");
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < arr01.length; i++) {
            arr.add(arr01[i]);
        }
        int num = arr.get(0).length();
        for (int i = 0; i < arr.size(); i++) {
            if (num > arr.get(i).length()) {
                num = arr.get(i).length();
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).length() == num) {
                System.out.println(arr.get(i));
            }
        }
    }
}