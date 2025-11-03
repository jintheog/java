package a.basic;

import java.util.Scanner;

public class Practice_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수 입력: ");
        int score = sc.nextInt();
        String grade = switch(score / 10){
            case 10,9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            case 5 -> "F";
            default -> "잘못된 점수";
        };
        System.out.println(grade);
    }
}
