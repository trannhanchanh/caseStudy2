package model;

public class Student {
    private int id;
    private String name;
    private double mark;
    private String capacity;
    private String dateofBirth;
    private String email;


    public Student() {
    }

    public Student(int id, String name, double mark, String capacity, String dateofBirth, String email) {
        this.id = id;
        this.name = name;
        this.mark = mark;
        this.capacity = capacity;
        this.dateofBirth = dateofBirth;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mark=" + mark +
                ", capacity='" + capacity + '\'' +
                ", dateofBirth='" + dateofBirth + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getInfoToCSV() {
        return this.id + ";" + this.name + ";" + this.mark + ";" + this.capacity + ";" + this.dateofBirth + ";" +this.email ;
    }
}
