package Sample01;

public class Worker1 extends BaseClassWorker {

    private double salaryFIx;
    String name;

    public double getSalary() {
        return salaryFIx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Worker1(String name, int salary) {

        this.name = name;
        this.salaryFIx = salary;
    }
}



