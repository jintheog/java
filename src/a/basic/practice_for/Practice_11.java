package a.basic.practice_for;

public class Practice_11 {
    public static void main(String[] args) {
        int n = 5;
        long fact = 1;
        for(int i = 1; i <= n; i++) {
            fact = fact*i;
        }
        System.out.print(fact);
    }
}
