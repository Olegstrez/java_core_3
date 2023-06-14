import Sample01.BaseClassWorker;
import Sample01.Worker1;
import Sample01.Worker2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static List<BaseClassWorker> list = new ArrayList<>();


    public static void main(String[] args) {
        createlist();
        outputConsole(list);
        System.out.println("Сортировка ");
        sortMaxMinSalary(list);

        }




    public static void createlist() {
        list.add(new Worker1("Вася", 30000));
        list.add(new Worker1("Олег", 45000));
        list.add(new Worker2("Рамзан", 700));
        list.add(new Worker2("Петр", 350));
        list.add(new Worker1("Володя", 30000));
        list.add(new Worker2("Георгий", 425));
        list.add(new Worker1("Жора", 30000));


    }

    public static void outputConsole(List<BaseClassWorker> work) {

        for (int i = 0; i < work.size(); i++) {

            System.out.println(i + 1 + " " + work.get(i).getName() +  " " + work.get(i).getSalary());
        }
    }
    public static void sortMaxMinSalary(List<BaseClassWorker> work) {
        work.sort(new Comparator<BaseClassWorker>() {


            @Override
            public int compare(BaseClassWorker o1, BaseClassWorker o2) {
                if (o1.getSalary() == o2.getSalary()) return 0;
                else if (o1.getSalary() < o2.getSalary()) return 1;
                else return -1;
            }
        });
        outputConsole(work);
    }
}

