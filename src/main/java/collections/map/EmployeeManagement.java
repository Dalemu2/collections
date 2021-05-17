package collections.map;
import collections.list.Employee;
import java.util.*;
public class EmployeeManagement {

    public static void main(String[] args) {
        Map<Integer, Employee> employees = new HashMap<>();
        employees = addEmployee();

       // .hashCode() -> returns int value // a memory address where an object stored

        /*
            Node<k,v> table
            four elements
                - key
                - hash value
                - value
                - link

            index = hash % (n - 1)

        */
        System.out.println(employees.hashCode());
        //printEmployee(employees);
        //printEmpName(employees);
        //printEmpDetail(employees);
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

    public static Map<Integer,Employee> addEmployee() {
        Map<Integer, Employee> employees = new HashMap<>();

        employees.put(1,createEmployee(111, "Jhon Douglas", "IT", 1234.55, true));
        employees.put(2,createEmployee(172, "Mike Joh", "CS", 1334.55, false));
        employees.put(3,createEmployee(123, "Elias three", "Security", 1434.55, true));
        employees.put(4,createEmployee(104, "Hanan four", "database", 1534.55, false));
        employees.put(5,createEmployee(105, "Joh five", "cloud", 1634.55, true));

        return employees;
    }
    public static void printEmployee(Map<Integer, Employee> employees){


        System.out.println("Print employees detail ");
        addEmployee().forEach((integer,emp) ->{
            System.out.println(emp);
        });
      //  printValue(employees,"");
       /* Iterator<Map.Entry<Integer, Employee>> iterator1 = employees.entrySet().iterator();
        while (iterator1.hasNext()){
            Map.Entry<Integer, Employee> entry= iterator1.next();
            System.out.println(entry.getValue());
        }*/
    }
    public static void printEmpName(Map<Integer, Employee> employees){
        System.out.println("Print employees name ");
        printValue(employees,"by Name");
        /*Iterator<Map.Entry<Integer, Employee>> iterator1 = employees.entrySet().iterator();
        while (iterator1.hasNext()){
            Map.Entry<Integer, Employee> entry= iterator1.next();
            System.out.println(entry.getValue().getEmpName());
        }*/
    }
    public static void printEmpDetail(Map<Integer, Employee> employees){
        System.out.println("Print employee name, employee status and employee income");
        printValue(employees,"detail");
       /* while (iterator1.hasNext()){
            Map.Entry<Integer, Employee> entry= iterator1.next();
            System.out.println(entry.getValue().getEmpName() + " " + entry.getValue().getEmpIncome() +  "  "  + entry.getValue().getActive() );
        }*/
    }
    public static void printValue(Map<Integer, Employee> employees, String type){
        Iterator<Map.Entry<Integer, Employee>> iterator1 = employees.entrySet().iterator();
        while (iterator1.hasNext()){
            Map.Entry<Integer, Employee> entry= iterator1.next();
            if(type.equalsIgnoreCase("by name")) {
                System.out.println(entry.getValue().getEmpName());
            }
            if(type.equalsIgnoreCase("detail")) {
                System.out.println(entry.getValue().getEmpName() + " " + entry.getValue().getEmpIncome() + "  " + entry.getValue().getActive());
            }
            else {
                System.out.println(entry.getValue().getEmpName());
            }
        }
    }
}











/*

        employees.values().stream().sorted();
;
        /*Collections.sort(employees, (Comparator<Map<Integer, Employee>>) (o1, o2) -> {
            return o1.getValue().getEmpName().compareTo(o2.getValue().getEmpName());
            //return (o1.getValue()).compareTo(o2.getValue());
        });

Comparator<Map.Entry<Integer,Employee>> newComparator = new Comparator<Map.Entry<Integer, Employee>>() {
    @Override
    public int compare(Map.Entry<Integer, Employee> first, Map.Entry<Integer, Employee> second) {
        return first.getValue().getEmpName().compareTo(second.getValue().getEmpName());
    }
};

// Collections.sort(Arrays.asList(employees.values().toArray()), );



**/
