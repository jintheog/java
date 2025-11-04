package a.basic.practice_if_switch;

import java.util.Scanner;

public class Practice_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("년도 입력 : ");
            //문제 3
            int year = sc.nextInt();

            if (year == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.printf("%d년은 윤년입니다", year);
            } else {
                System.out.printf("%d년은 윤년이 아닙니다", year );
            }
            System.out.println();
            System.out.println("0: 나가기");
        }
    }
}
