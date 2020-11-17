package com.vti.entity;

public class Manager extends User {
    private int expInYear;

    public Manager(int id, String fullName, String email, String password, int expInYear) {
        super(id, fullName, email, password, Roll.MANAGER);
        this.expInYear = expInYear;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + super.getId() +
                ", FullName='" + super.getFullName() + '\'' +
                ", Email='" + super.getEmail() + '\'' +
                ", Password='" + super.getPassword() + '\'' +
                ", roll=" + super.getRoll() +
                ", ExpInYear=" + expInYear +
                '}';
    }
}