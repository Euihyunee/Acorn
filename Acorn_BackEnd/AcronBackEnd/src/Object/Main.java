package Object;

public class Main {
    public static void main(String[] args) {

        Emloyee01 em1 = new Emloyee01(1, 500.0,"정의현");
        double tax = 0.15;

        System.out.println("세후 월급은 : " + (em1.Salary - em1.getReturnTax(tax)) + "만원 입니다.");

        System.out.println("세후 월급은 : " + (em1.Salary - calTax(em1.Salary, tax)) + "만원 입니다.");

        Main main = new Main();
        System.out.println("세후 월급은 : " + (em1.Salary - main.cal2Tax(tax, em1.Salary)) + "만원 입니다.");
    }
    public static double calTax(double ratio, double salary){
        return salary * ratio;
    }
    public double cal2Tax(double ratio, double salary){
        return salary * ratio;
    }
}
