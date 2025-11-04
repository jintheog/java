package a.basic.practice_if_switch;

public class Practice_9 {
    public static void main(String[] args) {
        int math = 70, english = 80, science = 45;
        double avg = (math + english + science) / 3.0;

        if((math > 40) && (english > 40) && (science > 40) && (avg>60)) {
            System.out.println("합격");
        } else  {
            System.out.println("불합격");
        }
    }
}
