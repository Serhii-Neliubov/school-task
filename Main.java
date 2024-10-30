public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Ivan", "Ivanov", 20);

        Employee employee = new Employee("Petr", "Petrov", 30);

        System.out.println("Student Info:");
        student.getInfo();

        System.out.println("\nEmployee Info:");
        employee.getInfo();
    }
}