package QLnhanvien.model;

public class Engineer extends Staff {
    private float coefficients_salary;

    public Engineer() {
    }

    public Engineer(String name, int age, String address, double salary, double work_day, float coefficients_salary) {
        super(name, age, address, salary, work_day);
        this.coefficients_salary = coefficients_salary;
    }

    public float getCoefficients_salary() {
        return coefficients_salary;
    }

    public void setCoefficients_salary(float coefficients_salary) {
        this.coefficients_salary = coefficients_salary;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "coefficients_salary=" + coefficients_salary + super.toString() +
                '}';
    }
}
