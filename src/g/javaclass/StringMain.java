package g.javaclass;

import java.util.Arrays;

public class StringMain {
    public static void main(String[] args) {
        //리터럴 방식
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1 == str2);

        //String이라는 클래스의 생성자를 호출해서 만들었다. => 다른 객체
//        String str3 = new String("hi");
//        String str4 = new String("hi");
//
//        System.out.println(str3 == str4);

        String str3 = "hello";
        System.out.println(str1.equals(str2)); //같은 값인지를 비교
        System.out.println(str1.equals(str3)); //대소문자 비교 //false
        System.out.println(str1.equalsIgnoreCase(str3)); //대소문자 무시 //true

        System.out.println(str1.length());
        System.out.println(str1.charAt(2));
        System.out.println(str1.indexOf("e"));
        System.out.println(str1.lastIndexOf("l"));

        System.out.println(str1.substring(2, 4));
        System.out.println(str1);

        System.out.println(str1.contains("H"));
        System.out.println(str1.startsWith("H"));

        System.out.println(str1.isEmpty());

        String str4 = "    Hello    \n";
        System.out.println(str4.trim());

        str4.replace("Hello", "Hi"); //함수만으로 원본의 데이터를 바꾸지는 않음.
        System.out.println(str4);
        System.out.println(str4.replace("Hello", "Hi"));

        String csv = "apple, banana, orange";

        String[] fruits = csv.split(", ");
        System.out.println(Arrays.toString(fruits));

        StringBuilder sb = new StringBuilder();
        sb.append(1);
        sb.append(5);
        sb.append(10);
        System.out.println(sb.toString());




    }
}
