public class Main {
    public static void main(String[] args) {
        Company company = new Company("XYZ Corporation");

        Department sales = new Department("Sales");
        Department it = new Department("IT");

        company.addDepartment(sales);
        company.addDepartment(it);

        Employee e1 = new Employee("Kamila Doe", "Sales Manager", 75000);
        Employee e2 = new Employee("Saya Smith", "Sales Representative", 50000);
        Employee e3 = new Employee("Mike Johnson", "IT Specialist", 65000);

        sales.addEmployee(e1);
        sales.addEmployee(e2);
        it.addEmployee(e3);

        company.displayEmployees();
    }
}