package a.basic.practice_array;

import java.util.Arrays;

public class Practice_2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = Arrays.copyOf(arr, arr.length);
        for(int i=0;i<newArr.length/2;i++){
            int temp = newArr[i];
            newArr[i] = newArr[newArr.length-1-i];
            newArr[newArr.length-1-i] = temp;
        }
        System.out.println("원본: "+Arrays.toString(arr));
        System.out.println("뒤집기: "+Arrays.toString(newArr));

        int[] reversed = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }

        System.out.println("원본: "+Arrays.toString(arr));
        System.out.println("뒤집기: "+Arrays.toString(reversed));

    }
}
