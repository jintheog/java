package c.oop2;

public class Enum {
    public static void main(String[] args) {
        Direction direc = Direction.WEST;
        System.out.println(direc);

        System.out.println(direc.name());
        System.out.println(direc.ordinal());
    }
}
