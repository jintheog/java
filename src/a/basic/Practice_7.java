package a.basic;

import java.util.Scanner;
public class Practice_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("몸무게 kg 입력:");
            double weight  = sc.nextDouble();
            System.out.print("키 cm 입력:");
            double cm = sc.nextDouble();
            double height = cm / 100;
            double BMI =  weight / (height * height);

            if(BMI < 18.5) {
                System.out.printf("BMI: %.2f \n 저체중 입니다. \n ", BMI);
            } else if (BMI < 23 && BMI > 18.5) {
                System.out.printf("BMI: %.2f\n 정상 입니다. \n ", BMI);
            } else if (BMI < 25 && BMI > 23){
                System.out.printf("BMI: %.2f\n 과체중 입니다. \n ", BMI);
            } else  System.out.printf("BMI: %.2f\n 비만 입니다. \n ", BMI);

            System.out.print("0. 프로그램 종료. 1. 다시 입력 \n 입력 : ");
            int choice = sc.nextInt();
            if(choice == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                continue;
            }

        }
    }
}
