package collections.list;

import java.util.Comparator;
public class CompareByID implements Comparator<Employee> {
    public int compare(Employee first, Employee second) {
        if (first.getEmpID() == second.getEmpID()) {
            return 0;
        } else if (first.getEmpID() > second.getEmpID()) {
            return 1;
        } else {
            return -1;
        }
    }
}
