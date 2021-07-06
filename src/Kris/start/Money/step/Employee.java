package Kris.start.Money.step;

public class Employee {
    String fio;
    String position;
    String mail;
    long phoneNumber;
    int salary;
    int age;

    public Employee(String fio, String position, String mail, long phoneNumber, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.printf("%s %s %s %+d %d %d\n", fio, position, mail, phoneNumber, salary, age);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", position='" + position + '\'' +
                ", mail='" + mail + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
