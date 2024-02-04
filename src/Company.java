import java.util.ArrayList;
import java.util.List;

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void addDepartment(Department department) {
        departments.add(department);
        department.setCompany(this);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
        department.setCompany(null);
    }

    public void displayEmployees() {
        for (Department dept : departments) {
            System.out.println("Department: " + dept.getName());
            for (Employee emp : dept.getEmployees()) {
                System.out.println("Employee: " + emp.getFullName());
            }
        }
    }
}
