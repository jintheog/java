package c.oop2;

public class Student {
    private String name;
    private int score;

    private static int totalStudnet = 0;
    private static int totalScore = 0;
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
        totalStudnet++;
        totalScore+=score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public static int getTotalStudent(){
        return totalStudnet;
    }
    public static double getAverageScore() {
        return (double)totalScore/totalStudnet;
    }


}
