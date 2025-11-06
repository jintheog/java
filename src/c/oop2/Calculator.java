package c.oop2;

class Sample{
    int value;
}

public class Calculator {
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c) {
        return a+b+c;
    }

    // 반환값이 없는 경우
    void printResult(int result) {
        System.out.println(result);
    }

    // String 반환
    String printValue(int score) {
        if (score >= 50) {
            return "pass";
        } else {
            return "fail";
        }
    }

    // 배열 반환
    int[] getArray() {
        return new int[]{1, 3, 5, 7, 9};
    }

    Sample getSample() {
        return new Sample();
    }


}
