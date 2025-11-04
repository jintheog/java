package a.basic.practice_for;

public class practice_7 {
    public static void main(String[] args) {
        int num = 16;

        boolean isPrime = true;
        for(int i = 2; i * i <= num; i++) {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.printf("%d은 소수입니다.",num);
        } else {System.out.printf("%d은 소수가 아닙니다.",num);}
    }
}
