package a.basic;

import java.util.Scanner;

public class Practice_4 {
    public static void main(String[] args) {
        //int a = 3, b = 4, c = 5;
        Scanner sc = new Scanner(System.in);
        System.out.print("a변의 길이 입력: ");
        int a = sc.nextInt();
        System.out.print("b변의 길이 입력: ");
        int b = sc.nextInt();
        System.out.print("c변의 길이 입력: ");
        int c = sc.nextInt();

        boolean valid = (a>0&&b>0&&c>0) && ((a+b)>c&&(b+c)>a&&(a+c)>b);
        if (valid) {
            System.out.println("삼각형을 만들 수 있습니다");
        } else System.out.println("삼각형을 만들 수 없습니다");
    }
}
