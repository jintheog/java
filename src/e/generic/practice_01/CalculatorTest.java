package e.generic.practice_01;
class Calculator<T>{
    private T value;
    private T value2;
    public Calculator(T value, T value2){
        this.value = value;
        this.value2 = value2;
    }

    public T getFirst() {
        return value;
    }

    public T getSecond() {
        return value2;
    }

    public void printBoth() {
        System.out.println("첫 번째: "+value+", 두번째: "+value2);
    }

    public boolean areEqual() {
        return  value.equals(value2);
    }

}


public class CalculatorTest {
    public static void main(String[] args) {
        // Integer Calculator
        Calculator<Integer> intCalc = new Calculator<>(10, 20);
        intCalc.printBoth();
        System.out.println("같은 값? " + intCalc.areEqual());

        // String Calculator
        Calculator<String> strCalc = new Calculator<>("Hello", "Hello");
        strCalc.printBoth();
        System.out.println("같은 값? " + strCalc.areEqual());

        // Double Calculator
        Calculator<Double> doubleCalc = new Calculator<>(3.14, 2.71);
        System.out.println("첫 번째: " + doubleCalc.getFirst());
        System.out.println("두 번째: " + doubleCalc.getSecond());
        System.out.println("같은 값? " + doubleCalc.areEqual());
    }

}
