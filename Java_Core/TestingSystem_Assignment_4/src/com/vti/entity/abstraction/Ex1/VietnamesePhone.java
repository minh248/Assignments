package com.vti.entity.abstraction.Ex1;

public class VietnamesePhone extends Phone {

    // Should change these method into class "Contact"
    @Override
    public void insertContact(String name, String phone) {
        System.out.println("insertContact");
    }

    @Override
    public void removeContact(String name) {
        System.out.println("removeContact");
    }

    @Override
    public void updateContact(String name, String newPhone) {
        System.out.println("updateContact");
    }

    @Override
    public void searchContact(String name) {
        System.out.println("searchContact");
    }
}
