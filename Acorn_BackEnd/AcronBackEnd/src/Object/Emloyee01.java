package Object;

public class Emloyee01 {

    int EmNum;
    double Salary;
    String EmName;

    public Emloyee01(int emNum, double salary, String emName) {
        EmNum = emNum;
        Salary = salary;
        EmName = emName;
    }
    public Emloyee01() {}

    public double getReturnTax(double ratio){
        return Salary * ratio;
    }
}
