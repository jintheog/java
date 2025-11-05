package a.basic.practice_array;

import java.util.Arrays;

public class Practice_1 {
    public static void main(String[] args) {
        int[] numbers = {45, 23, 78, 12, 89, 34};
        int max = numbers[0];
        int min = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max) {
                max = numbers[i];
            }
            if(numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("최대값: "+max);
        System.out.println("최소값: "+min);

    }
}
