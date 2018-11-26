package Staff;

public abstract class Employee {

    protected String name;
    protected int NI;
    protected double salary;
    protected double bonus;

    public Employee(String name, int NI, double salary){
        this.name = name;
        this.NI = NI;
        this.salary = salary;
        this.bonus = 0;
    }

    public String getName(){
        return this.name;
    }

    public int getNI(){
        return this.NI;
    }

    public double getSalary(){
        return this.salary;
    }

    public void raiseSalary(double increase){
        this.salary = this.salary + (this.salary * increase);
    }

    public void payBonus(){
        this.bonus = (this.salary * 0.01);
    }

    public double viewBonus(){
        return this.bonus;
    }
}
