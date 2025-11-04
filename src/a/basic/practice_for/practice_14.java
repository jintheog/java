package a.basic.practice_for;

public class practice_14 {
    public static void main(String[] args) {
        for(int i = 2; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                if(i == 5){
                    continue;
                }
                System.out.println(i + " X "+ j + " = " + (i*j));
            }
        }
    }
}
