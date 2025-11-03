
package a.basic;

import java.util.Scanner;

public class Practice_1 {
    public static void main(String[] args) {
        //문제 1.
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력: ");
        int num = sc.nextInt();
        if((num % 2) == 0) {
            System.out.printf("%d은(는) 짝수 입니다", num);
        } else System.out.printf("%d은(는) 홀수 입니다", num);
    }

}
