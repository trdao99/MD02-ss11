package Btap4;

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
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).length() > 3) {
                System.out.println(arr.get(i));
            }
        }
    }
}