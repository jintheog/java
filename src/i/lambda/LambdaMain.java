package i.lambda;

import java.util.Comparator;
import java.util.function.*;

@FunctionalInterface
interface Calculator{
    int calculate(int a, int b);
    //int calculate2(int a, int b); //단 1개의 메서드가 있는 인터페이스만 사용 가능. 람다식이 어디로 전달 되어야 하는지 알 수 없음.
}



public class LambdaMain {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return Integer.compare(a,b);
            }
        };

        Comparator<Integer> comparator2 = (a, b) -> Integer.compare(a, b);

        // 매개변수 없는 형태
        Runnable task = () -> System.out.println("실행");
//        System.out.println(task);
        task.run();

        // 매개변수가 1개
        Consumer<String> print = (s) -> System.out.println(s);
        print.accept("hi");

        // 매개변수가 2개
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        add.apply(1, 2);

        BiFunction<Integer, Integer, Integer> calc = (a, b) ->{
          int sum = a + b;
          return sum / 2;
        };
        System.out.println(calc.apply(5, 10));

        Calculator cal = (a, b) -> a + b;



    }
}
