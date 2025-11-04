package a.basic.practice_for;

public class practice_4 {
    public static void main(String[] args) {
//        int n = 5;
//        for(int i = 1; i <= n; i++) {
//            for(int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for(int k = 1; k <= 2 * i - 1; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for(int i = 1; i <= 5; i++) {
            for(int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
