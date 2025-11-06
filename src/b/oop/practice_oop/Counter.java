package b.oop.practice_oop;

public class Counter {
    private int count;
    public Counter(int count) {
        this.count = 0;
    }
    public void increment() {
        count++;
    }
    public void decrement() {
        count--;
    }
    public int getCount() {
        return count;

    }
    public void reset() {
        count = 0;
    }
}
