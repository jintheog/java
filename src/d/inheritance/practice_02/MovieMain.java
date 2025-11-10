package d.inheritance.practice_02;

class Movie{
    String title;
    String rating;

    public Movie(String title, String rating) {
        this.title = title;
        this.rating = rating;
    }

    public void displayInfo(){

    }

}

class ActionMovie extends Movie {
    String specialEffects;

    public ActionMovie(String title, String rating, String specialEffects) {
        super(title, rating);
        this.specialEffects = specialEffects;
    }
}

class Comedy extends Movie {
    String humorStyle;

    public Comedy(String title, String rating, String humorStyle) {
        super(title, rating);
        this.humorStyle = humorStyle;
    }
}

class Drama extends Movie {
    String theme;

    public Drama(String title, String rating, String theme) {
        super(title, rating);
        this.theme = theme;
    }
}
public class MovieMain {
    public static void main(String[] args) {

    }
}
