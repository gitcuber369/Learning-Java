import java.sql.Struct;

public class Student {
    private String name;
    private int[] grades;
    private double averageGrade;

    public Student(String name, int[] grades){
        this.name=name;
        this.grades=grades;
        calculateAverage();
    }

    private void calculateAverage() {
        if(grades.length ==0){
            averageGrade = 0.0;
            return;
        }
        int sum = 0;
        for(int grade : grades) {
            sum += grade;
        }

        averageGrade = (double) sum / grades.length; 
    }
        public double getAverageGrade() {
            return averageGrade;
        }
        public String getName() {
            return name;
        }

        public static void printNamesAboveThreshold(Student[] students, double threshould){
            System.out.println("name of the students with an average grade above" + threshould + ":");
            for(Student student : students){
                if (student.getAverageGrade()>threshould) {
                    System.out.println(student.getName());
                }
            }
        }
        public static void main(String[] args) {
            Student[] students = new Student[3];
            students [0] = new Student("Arpit", new int[]{90, 80, 70});
            students [1] = new Student("Atul", new int[]{100, 45, 7410});
            students [2] = new Student("Rahul", new int[]{45, 879, 45});

            printNamesAboveThreshold(students, 80);
        }
}