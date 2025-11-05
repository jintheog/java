package a.basic;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //배열 선언, 크기 지정
        int[] numbers = new int[5];

        // 값 할당
        numbers[0] = 100;
        numbers[1] = 200;

        System.out.println(numbers.length);
        System.out.println(numbers[0]);
        System.out.println(numbers[4]);
        System.out.println();

        // 배열 초기화
        // 선언 후 한칸씩 할당
        int[] arr1 = new int[5];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        // 선언과 동시에 초기화
        int[] arr2 = new int[] {1, 2, 3, 4, 5};

        // 생략
        int[] arr3 = {1, 2, 3, 4, 5};

        String[] names = {"kim", "lee", "park"};
        System.out.println(names.length);

        int[] scores = {80, 40, 80, 90, 100};

        //index 접근
        for (int i = 0; i < scores.length; i++){
            System.out.println(scores[i]);
        }

        //요소 반복
        for(int score : scores){
            System.out.println(score);
        }

        System.out.println();

        //int[][] matrix = new int[5][5];
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        //System.out.println(matrix[0][2]);
        for(int i = 0; i < matrix.length; i++){
            //System.out.println(i);
            for(int j = 0; j < matrix[i].length; j++){
                System.out.println(matrix[i][j]);
            }
        }

        System.out.println();
        
        //행마다 길이가 다른 배열 출력
        int[][] jagged = {
                {1},
                {2, 3},
                {4, 5, 6},
                {7, 8, 9, 10}
        };
        for (int[] row : jagged){
            for(int item : row){
                System.out.println(item);
            }
        }

        System.out.println();
        // Array 유틸리티 클래스
        int[] nums = {5, 2, 1, 7, 8};
        System.out.println(nums);
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        int idx =  Arrays.binarySearch(nums, 7);
        System.out.println(idx);

        System.out.println();

        int[] filled = new int[10];
        Arrays.fill(filled, 99);
        System.out.println(Arrays.toString(filled));

        int[] origin = {1, 2, 3, 4, 5};
        int[] copied = Arrays.copyOf(origin, origin.length);
        System.out.println(Arrays.toString(copied));

        int[] copied2 = origin;
        System.out.println(Arrays.toString(copied2));

        System.out.println();

        origin[0] = 100;

        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copied));
        System.out.println(Arrays.toString(copied2));


        int[] ranged = Arrays.copyOfRange(origin,1, 3);
        System.out.println(ranged);

        System.out.println();

        int[] arrA = {1, 2, 3};
        int[] arrB = {1, 2, 3};

        System.out.println(arrA == arrB);
        System.out.println(Arrays.equals(arrA, arrB));


        System.out.println();

        int[][] mat = {{1, 2}, {3, 4}};
        System.out.println(Arrays.toString(mat));
        System.out.println(Arrays.deepToString(mat));// 재귀적으로 데이터를 문자열로 바꿈

        System.out.println();



    }
}
