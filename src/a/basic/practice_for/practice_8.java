package a.basic.practice_for;
//최대 공배수
public class practice_8 {
    public static void main(String[] args) {
        int a = 48, b = 18;

        // 유클리드 호제법
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
    }
}
