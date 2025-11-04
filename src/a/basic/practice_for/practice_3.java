package a.basic.practice_for;

public class practice_3 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            for(int j = 5; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
