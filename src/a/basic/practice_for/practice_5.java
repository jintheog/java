package a.basic.practice_for;

public class practice_5 {

    public static void main(String[] args) {
        int num = 24;
        System.out.printf("%d의 약수: ", num);
        for(int i = 1; i <= num; i++) {
            if(num % i == 0){
            System.out.print(i + " ");
            }
        }
    }
}
