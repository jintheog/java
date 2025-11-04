package a.basic.practice_for;
//최소 공배수
public class practice_9 {
    public static void main(String[] args) {
        int a = 12, b = 18;
        int originA = a, originB = b;
        // 유클리드 호제법
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gcd = a;
        System.out.println(originA * originB / gcd);
    }
}
