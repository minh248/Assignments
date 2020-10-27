package com.company;

import java.util.Comparator;

public class Department implements Comparator<Department> {
    int id;
    String name;

    @Override
    public String toString() {
        return "id: " + this.id + " | " + "name: " + this.name;
    }

    @Override
    public int compare(Department d1, Department d2) {
        return Character.compare(d1.name.charAt(0), d2.name.charAt(0));
    }
}
