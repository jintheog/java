package a.basic.practice_array;

import java.util.Arrays;

public class Practice_3 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        int idx = Arrays.binarySearch(arr, target);
        System.out.printf("%d의 인덱스: %d\n",target, idx);

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.printf("%d의 인덱스: %d\n",target, i);
                break;
            }
        }
    }
}
