package model.person;

public class Employee extends Person{
    private String level;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String level, String position, double salary) {
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, String sex, String email, String id, String dateOfBirth, String phoneNumber, String CMND, String level, String position, double salary) {
        super(name, sex, email, id, dateOfBirth, phoneNumber, CMND);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + this.level + "; vi tri: " +this.position + ";" +this.salary;
    }

    public String getInfoToCSV() {
        return this.getName() + "," + this.getSex() + "," + this.getEmail() + "," + this.getId() + "," + this.getDateOfBirth() + "," + this.getPhoneNumber() + " , " + this.getCMND() + " , " + this.level + " , " + this.position + " , " + this.salary ;
    }
}
