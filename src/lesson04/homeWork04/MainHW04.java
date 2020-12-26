package lesson04.homeWork04;

public class MainHW04 {
    public static void main(String[] args) {

        Employee employee = new Employee("Alex","Gladkoff",34,"Developer","+79017778899",5000);
        System.out.println("Info: " + employee.getPosition() + " " + employee.getFirstName() + " " + employee.getLastname() );

        System.out.println();

        Employee[] employeeArr = {
                new Employee("Kirill","Kondrat",33,"Developer","+79013621372",4000),
                new Employee("Adam ","Shelby",41,"Seller      ","+79013698521",3589),
                new Employee("Lara ","Croft",27,"Orcheolog","+79014791118",9360),
                new Employee("Kylie","Minouge",44,"Artist     ","+79014568696",48000),
                new Employee("Benni","Benassi",45,"Producer   ","+79013332211",20000)
        };
        for (int i = 0; i < employeeArr.length; i++) {
            if(employeeArr[i].getAge() > 40){
                employeeArr[i].info();
            }
        }
        System.out.println();
        System.out.println("Before salary increase: ");

        for (int i = 0; i < employeeArr.length; i++) {
            employeeArr[i].info();
        }
        System.out.println();
        System.out.println("After salary increase: ");

        salaryIncrease(employeeArr,35,10000);

        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i].salaryUp);
            employeeArr[i].info();
        }
    }

    public static void salaryIncrease(Employee[] employees, int age, int salary){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > age){
                employees[i].setSalary(salary);
                employees[i].salaryUp = true;
            }
        }
    }
}
