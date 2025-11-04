package a.basic.practice_if_switch;

public class Practice_8 {
    public static void main(String[] args) {
//        int a = 10, b = 25, c = 17;
//
//        int max = a;
//
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
        int[] nums = {10, 25, 17};
        int max = nums[0];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
        }
        System.out.println(max);

    }
}
