package collections.list;

import java.util.Comparator;
public class CompareByName implements Comparator<Employee> {
    public int compare(Employee first,Employee second){
        return first.getEmpName().compareTo(second.getEmpName());
    }
}
