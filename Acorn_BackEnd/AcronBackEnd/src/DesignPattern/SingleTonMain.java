package DesignPattern;

public class SingleTonMain {
    public static void main(String[] args) {

        SingleTonPattern st = SingleTonPattern.getInstance("KIT");
        System.out.println(st);
        SingleTonPattern st2 = SingleTonPattern.getInstance("KIT2");
        System.out.println(st2);
    }
}
