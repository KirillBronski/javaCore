package lesson04.homeWork04;

public class Employee {

    private String firstName;
    private String lastname;
    private String position;
    private String phoneNumb;
    private int salary;
    boolean salaryUp;
    private int age;
    private static int score = 0;
    private int id;

    public Employee (String firstName, String lastname, int age, String position, String phoneNumb, int salary) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.age = age;
        this.position = position;
        this.phoneNumb = phoneNumb;
        this.salary = salary;
        this.id = ++score;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPhoneNumb(String phoneNumb) {
        this.phoneNumb = phoneNumb;
    }

    public String getPhoneNumb() {
        return phoneNumb;
    }

    public void setSalary(int salary) {
        this.salary = this.salary + salary;
    }

    public int getSalary() {
        return salary;
    }


    public void info(){
        System.out.println("ID: " + this.id + " |First name: "
                + firstName + "\t|Last Name: "
                + lastname + "\t|Age: " + age + "\t|Position: "
                + position + "\t|PhoneNumber: " + phoneNumb
                + "\t|Salary: " + salary+" $");
    }
}
