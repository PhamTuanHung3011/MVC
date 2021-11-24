package QLnhanvien.model;

public class Worker extends Staff{
    public Worker() {
    }

    public Worker(String name, int age, String address, double salary, double work_day) {
        super(name, age, address, salary, work_day);
    }

    @Override
    public String toString() {
        return "Worker{}";
    }


}
