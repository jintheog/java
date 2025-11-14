package i.lambda;

import java.util.Comparator;
import java.util.function.*;


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
        calc.apply(5, 10);
    }
}
