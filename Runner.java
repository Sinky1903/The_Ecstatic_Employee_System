/**
 * Created by user on 22/02/2017.
 */

public class Runner {
    public static void main(String[] args){

        Department.deleteAll();
        Employee.deleteAll();

        Department department1 = new Department("HR");
        Department department2 = new Department("Marketing");
        Department department3 = new Department("Sales");
        Department department4 = new Department("Finance");
        Department department5 = new Department("Admin");


        department1.save();
        department2.save();
        department3.save();
        department4.save();
        department5.save();


        Employee employee1 = new Employee("Suzie Smith", department1, 45000);
        Employee employee2 = new Employee("Jamie Jones", department2, 25000);
        Employee employee3 = new Employee("David Davies", department1, 55000);
        Employee employee4 = new Employee("Eric Edwards", department2, 15000);
        Employee employee5 = new Employee("Laura Low", department3, 25000);
        Employee employee6 = new Employee("Kat Kiljoy", department4, 45000);
        Employee employee7 = new Employee("Andy Adams", department3, 35000);
        Employee employee8 = new Employee("Bill Bremner", department4, 75000);
        Employee employee9 = new Employee("Neville Neville", department5, 12500);
        Employee employee10 = new Employee("Tony Tibbs", department5, 30000);


        employee1.save();
        employee2.save();
        employee3.save();
        employee4.save();
        employee5.save();
        employee6.save();
        employee7.save();
        employee8.save();
        employee9.save();
        employee10.save();


        Department.all();
        Employee.all();

        employee1.getEmployeeDetails();
//        employee2.getEmployeeDetails();
//        employee3.getEmployeeDetails();
//        employee4.getEmployeeDetails();
//        employee5.getEmployeeDetails();
//        employee6.getEmployeeDetails();
//        employee7.getEmployeeDetails();
//        employee8.getEmployeeDetails();
//        employee9.getEmployeeDetails();
//        employee10.getEmployeeDetails();

        department1.setTitle("What do they do?");
        department1.update();
//        department1.getDepartmentDetails();

        employee1.setName("Suzanne Smyth");
        employee1.update();
        employee1.getEmployeeDetails();












    }
}
