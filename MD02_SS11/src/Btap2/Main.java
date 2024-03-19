package Btap2;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add((int) (Math.random() * 100));
        }
        System.out.println(arr);

        List<Integer> revArr = new ArrayList<>();
        for (int i = arr.size() - 1; i >= 0; i--) {
            revArr.add(arr.get(i));
        }

        System.out.println(revArr);
    }
}
