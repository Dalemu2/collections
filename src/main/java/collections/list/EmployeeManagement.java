package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeManagement{
    public static void main(String[] args) {

        // create set of employee (At least Five)
        // print the emp name and dept
        //
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees = addEmployee();
       // System.out.println(employees);

        for (Employee newEmp: employees
             ) {
            System.out.println(newEmp.getEmpName() + "  " + newEmp.getEmpDept());
        }
        //sort by id
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee one, Employee two) {
                return one.getEmpID() - two.getEmpID();
            }
        });
        //Collections.sort(employees, new CompareByID());
        //employees.forEach(employee -> System.out.println(employee));


        // sort by name
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee first, Employee second) {
                return first.getEmpName().compareTo(second.getEmpName());
            }
        });
        //Collections.sort(employees,new CompareByName());
        employees.forEach(employee -> System.out.println(employee));
    }
    public static Employee createEmployee(int id, String name, String dep, double income, boolean active){


        Employee newEmployee = new Employee();
        newEmployee.setEmpID(id);
        newEmployee.setEmpName(name);
        newEmployee.setEmpDept(dep);
        newEmployee.setEmpIncome(income);
        newEmployee.setActive(active);

        return newEmployee;
    }

    public static ArrayList<Employee> addEmployee(){
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(createEmployee(111, "user one", "IT", 1234.55, true));
        employees.add(createEmployee(172, "user two", "CS", 1334.55, false));
        employees.add(createEmployee(123, "user three", "Security", 1434.55, true));
        employees.add(createEmployee(104, "user four", "database", 1534.55, false));
        employees.add(createEmployee(105, "user five", "cloud", 1634.55, true));

        return employees;

    }
  /*  @Override
    public int compare(Employee first, Employee second) {
        if (first.getEmpID() == second.getEmpID()) {
            return 0;
        } else if (first.getEmpID() > second.getEmpID()) {
            return 1;
        } else {
            return -1;
        }
    }*/
}
