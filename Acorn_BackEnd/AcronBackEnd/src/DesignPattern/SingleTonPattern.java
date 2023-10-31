package DesignPattern;

public class SingleTonPattern {
    private static SingleTonPattern instance = null;
    private String name;

    private SingleTonPattern(){}

    private SingleTonPattern(String name){
        this.name = name;
    }

    public static SingleTonPattern getInstance(String name) {
        if (instance == null) {
            instance = new SingleTonPattern(name);
            System.out.println("생성한 " + name);
        }else{
            System.out.println("이미 생성된 " + name);
        }
        return instance;
    }
}
