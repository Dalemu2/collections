package collections.map;

import collections.list.Employee;

import java.util.Comparator;

public class CompareByName implements Comparator<collections.list.Employee> {
    public int compare(collections.list.Employee first, Employee second){
        return first.getEmpName().compareTo(second.getEmpName());
    }
}


/*
*
* Comparator<Map.Entry<String, Integer>> myComparator =
new Comparator<Map.Entry<String, Integer>>() {

            @Override
            public int compare(
                  Map.Entry<String, Integer> e1,
                  Map.Entry<String, Integer> e2) {

                Integer int1 = e1.getValue();
                Integer int2 = e2.getValue();
                return int1.compareTo(int2);
            }
};

// Sorting the list w.r.t values of entries using myComparator
Collections.sort(list, myComparator);
*
*/
