package a.basic;

import java.util.Scanner;

public class Practice_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("1 ~ 7까지 요일 입력: ");
            int numOfDay =  sc.nextInt();
            String day = "";
            if(numOfDay == 0){
                System.out.println("프로그램 종료");
                break;
            }

            day = switch(numOfDay){
                case 1 -> "월요일";
                case 2 -> "화요일";
                case 3 -> "수요일";
                case 4 -> "목요일";
                case 5 -> "금요일";
                case 6 -> "토요일";
                case 7 -> "일요일";
                default -> "잘못된 요일";
            };
//            String dayOfWeek = switch (numOfDay) {
//                case 1, 2, 3, 4, 5 -> String.format("%d: %s은 주중입니다", numOfDay, day);
//                case 6, 7 -> String.format("%d: %s은 주말입니다", numOfDay, day);
//                default -> "잘못된 입력입니다";
//            };
            switch(numOfDay){
                case 1, 2, 3, 4, 5:
                    System.out.printf("%d: %s은 주중 입니다", numOfDay, day);
                    break;
                case 6, 7:
                    System.out.printf("%d: %s은 주말 입니다", numOfDay, day);
                default:
                    System.out.println("잘못된 요일입니다.");
            }
            System.out.println();
        }
    }
}
