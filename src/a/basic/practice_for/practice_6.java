package a.basic.practice_for;

import java.util.Scanner;

public class practice_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 17;

       boolean isPrime = true;
       for(int i = 2; i <= num-1; i++) {
           if(num % i == 0) {
            isPrime = false;
            System.out.printf("%d은 소수가 아닙니다.",num);
            break;
           }
       }

       if(isPrime) {
           System.out.printf("%d은 소수입니다.",num);
       }
    }
}
