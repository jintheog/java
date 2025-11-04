package a.basic.practice_if_switch;

import java.util.Scanner;

public class Practice_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("점수 입력: ");
            int score = sc.nextInt();
            if (score == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            String grade = switch(score / 10){
                case 10,9 -> "A";
                case 8 -> "B";
                case 7 -> "C";
                case 6 -> "D";
                case 5, 4, 3, 2, 1, 0 -> "F";
                default -> "잘못된 점수";
            };
            System.out.println(grade);
            System.out.println();
            System.out.println("0: 나가기");

        }

    }
}
