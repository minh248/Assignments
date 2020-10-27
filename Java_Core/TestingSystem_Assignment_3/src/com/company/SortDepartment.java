package com.company;

import java.util.Comparator;

public class SortDepartment implements Comparator<Department> {
    @Override
    public int compare(Department department1, Department department2) {
        String[] s1 = department1.name.split("//s+");
        String[] s2 = department2.name.split("//s+");
        return Character.compare(s1[s1.length - 1].charAt(0), s2[s1.length - 1].charAt(0));
    }
}
