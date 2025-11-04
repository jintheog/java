package a.basic;

public class For {
    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for(int i = 10; i >= 1; i--){
            System.out.println(i);
        }
        System.out.println();
        for(int i = 0; i<10; i += 2) {
            System.out.println(i);
        }

        System.out.println();

        for(int i = 0, j = 10; i < j; i++, j-- ){
            System.out.println(i);
            System.out.println(j);
        }

        // 구구단 2단
        int dan = 2;
        for(int i = 1; i < 10; i++){
            System.out.println(dan + " X " + i + " = "+dan*i);
        }
        System.out.println();
        // 구구단 2단 부터 9단 까지
        for(int i = 2; i < 10; i++){
            System.out.println(i);
            for(int j = 1; j < 10; j++){
                System.out.println(i + " X " + j + " = "+i*j);
            }
        }

        //while
        int i = 1;

        while (i<10) {
            System.out.println(i);
            i++;
        }
        System.out.println();
        // do-while
        int j = 100;
        do {
            System.out.println(j);
            j++;
        } while(j <= 10);
        System.out.println();
        //enhanced for
        int [] numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18};

        for(i=0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println();
        // for (const num of numbers)
        for(int number : numbers){
            System.out.println(number);
        }
        System.out.println();
        
        //for each문으로 원본 배열 변경 불가
        int[] nums = {1, 2, 3};
        for (int num : nums) {
            //int num = 1, 2, 3
            num = num * 3;
        }

        for(int num : nums){
            System.out.println(num);
        }
        System.out.println();
        //일반 for문으로 원본 배열 변경 가능
        for(int a = 0; a < nums.length; a++){
            nums[a] = nums[a] * 3;
        }
        for (int num : nums){
            System.out.println(num);
        }
        System.out.println();

        // break 자기가 포함되어 있는 가장 가까운 반복문을 중단
        for (int z = 0; z < 10; z++) {
            System.out.println(z);
            if(z == 5) {
                break;
            }
        }

        // continue 현재 반복을 건너 뛰고 다음 반복으로 진행
        for(int z = 0; z < 10; z++) {
            if(z % 2 == 0) {
                continue;
            }
            System.out.println(z);
        }

        for(int x = 2; x < 10; x++) {
            for(int y = 1; y < 10; y++){
                System.out.println(x + "X" + y + "=" + (x*y));
            }
        }

    }
}
