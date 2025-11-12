package f.collection.practice_01;
import java.util.*;

public class Practice_01 {
    public static void main(String[] args) {
        // 테스트 1
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(5, 3, 9, 1, 7));
        System.out.println("입력: " + list1);
        System.out.println("출력: " + findSecondLargest(list1));

        // 테스트 2
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(10, 10, 10));
        System.out.println("\n입력: " + list2);
        System.out.println("출력: " + findSecondLargest(list2));

        // 테스트 3
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(5, 5, 3, 3, 1));
        System.out.println("\n입력: " + list3);
        System.out.println("출력: " + findSecondLargest(list3));

        // 테스트 4
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(5));
        System.out.println("\n입력: " + list4);
        System.out.println("출력: " + findSecondLargest(list4));
    }

    public static Integer findSecondLargest(ArrayList<Integer> list) {
        int max = list.get(0);
        int secondMax = -1;

        for (int i = 1; i < list.size(); i++) {
            int num = list.get(i);
            if(num > max) {
                secondMax = max;
                max = num;
            } else if (num < max && num > secondMax) {
                secondMax = num;
            }
        }
        if(secondMax == -1) {
            return -1;
        }
        return secondMax;
    }
}
