package hw_HelloJava;

public class HelloJava {
    public static void main(String[] args) {
        String a = "Hello, Java! It's a Java Basic course";

        System.out.println("Длинна строки = " + a.length());
        System.out.println("Символ 11 = " + a.charAt(11));
        System.out.println(a.substring(13, 24));
        System.out.println((a.substring(20, 37)));

    }
}
