public class Employee {
    int id;
    String name;
    int experience;
    double salary;

    public Employee(int id, String name, int experience) {
        this.id = id;
        this.name = name;
        this.experience = experience;
    }

    public double predictSalary() {
        if (experience <= 1) {
            salary = 25000;
        } else if (experience <= 3) {
            salary = 40000;
        } else if (experience <= 5) {
            salary = 60000;
        } else {
            salary = 80000;
        }

        return salary;
    }
}