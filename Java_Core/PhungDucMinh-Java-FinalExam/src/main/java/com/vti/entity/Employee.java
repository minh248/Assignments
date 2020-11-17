package com.vti.entity;

public class Employee extends User{
    private int projectId;
    private String proSkill;

    public Employee(int id, String fullName, String email, String password, int projectId, String proSkill) {
        super(id, fullName, email, password, Roll.EMPLOYEE);
        this.projectId = projectId;
        this.proSkill = proSkill;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + super.getId() +
                ", FullName='" + super.getFullName() + '\'' +
                ", Email='" + super.getEmail() + '\'' +
                ", Password='" + super.getPassword() + '\'' +
                ", roll=" + super.getRoll() +
                ", projectId=" + projectId +
                ", proSkill='" + proSkill + '\'' +
                '}';
    }
}
