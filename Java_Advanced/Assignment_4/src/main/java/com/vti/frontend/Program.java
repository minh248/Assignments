package com.vti.frontend;

import com.vti.backend.repository.DepartmentRepository;
import com.vti.entity.Group;

import java.time.LocalDate;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        DepartmentRepository departmentRepository = new DepartmentRepository();

        // Create group
        Group group = new Group();
        group.setName("test transaction");
        group.setCreate_date(LocalDate.now());
        departmentRepository.createGroup(group);
        List<Group> groups1 = departmentRepository.getAllGroups();

        for (Group g : groups1) {
            System.out.println(g.toString());
        }

        // Get group by name
        group = departmentRepository.getGroupByName("A");
        System.out.println(group.toString());

        // Delete group
        departmentRepository.deleteGroupById(1);
        List<Group> groups2 = departmentRepository.getAllGroups();

        for (Group g : groups2) {
            System.out.println(g.toString());
        }
    }

    public static void printAllGroups(){

    }
}
