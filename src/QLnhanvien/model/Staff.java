package QLnhanvien.model;

public class Staff {
    private int id;
    private String name;
    private int age;
    private String address;
    private double salary;
    private double work_day;
    private int idNumber = 1;

    public Staff() {
    }

    public Staff( String name, int age, String address, double salary, double work_day) {
        this.id = idNumber++;
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.work_day = work_day;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getWork_day() {
        return work_day;
    }

    public void setWork_day(double work_day) {
        this.work_day = work_day;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void monthly_salary() {
       double monthly_salary =  getSalary() * getWork_day();
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", work_day=" + work_day +
                '}';
    }
}
