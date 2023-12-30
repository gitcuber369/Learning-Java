import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

class Employ {
    private String name; 
    private int salary; 
    private String employId;

    public Employ (String name, int salary, String employId) {
        this.name = name;
        this.salary = salary;
        this.employId = employId;
    }
    public void displayDetails() {
        System.out.println("name of the employ  " + name);
        System.out.println("Salary  " + salary);
        System.out.println("Employ ID  " + employId);
    }

    public int getSalary() {
        return salary;
    }
}
class Manager extends Employ {
   private int numberOfSubordninates;
    
    public Manager(String name, int salary, String employId, int numberOfSubordninates) {
        super(name, salary, employId);
        this.numberOfSubordninates = numberOfSubordninates;
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("number of the subordinates " + numberOfSubordninates);
    }
}

public class demo {
    public static void main(String[] args) {
        Employ[] employee = new Employ[3];
        employee[0] = new Employ("Arpit", 75000000, "Arpit001");
        employee[1] = new Employ("Rahul", 45000000, "Arpit002");
        employee[2] = new Employ("Ruddransh", 78000000, "Arpit003");

        Arrays.sort(employee,Comparator.comparingDouble(Employ::getSalary).reversed());

        for(Employ employ : employee) {
            employ.displayDetails();
            System.out.println("------------------");
        }
    }
}

