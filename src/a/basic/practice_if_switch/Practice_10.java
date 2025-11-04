package a.basic.practice_if_switch;

public class Practice_10 {
    public static void main(String[] args) {
        int price = 120000;
        boolean isMember = true;
        int dcRate = 0;
        if(price > 100000) {
            dcRate += 10;
        } else if (price > 50000) {
            dcRate += 5;
        }
        if(isMember) {
            dcRate += 5;
        }
        int finPrice = price - (price * (dcRate/100));
        System.out.printf("원가: %d", price + "\n 할인율: %d", dcRate + "\n 최종 금액: %d",finPrice);
    }
}
