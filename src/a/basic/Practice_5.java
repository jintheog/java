package a.basic;

import java.util.Scanner;

public class Practice_5 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        while(true){
            System.out.print("월 입력: ");
            int month = sc.nextInt();

            if(month == 0) {
                System.out.println("프로그램을 종료 합니다.");
                break;
            }
            String season = switch(month){
                case 3, 4, 5 -> "봄";
                case 6, 7, 8 -> "여름";
                case 9, 10, 11 -> "가을";
                case 12, 1, 2 -> "겨울";
                default -> "잘못된 월 입니다.";
            };
            System.out.println(season);
            System.out.println("0: 나가기");
        }
    }
}
