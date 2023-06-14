package Sample01;

public class Worker2 extends BaseClassWorker {


    private int salaryHour;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Worker2(String name, int salary) {


        this.name = name;
        this.salaryHour = salary;
    }
    public  double getSalary(){

        return 20.8 * 8 * salaryHour;
    }
}
