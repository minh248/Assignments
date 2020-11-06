package com.vti.entity.ex1;

public class Student {
    private int id;
    private String name;
    private static String college = "Đại học bách khoa";
    private static int groupMoney = 0;
    private static int total = 0;
    private static final int maxStudent = 7;

    public Student(int id, String name) throws Exception {
        if (total >= maxStudent) {
            throw new Exception("Không thể tạo quá 7 sinh viên");
        }

        total ++;
        this.id = id;
        this.name = name;
    }

    public void useMoney(int money, String purpose){
        groupMoney -= money;
        System.out.println("Học sinh " + name + " sử dụng " + money + "k để " + purpose);
    }

    public void contributeToTheFund(int money){
        groupMoney += money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCollege() {
        return college;
    }

    public static void setCollege(String college) {
        Student.college = college;
    }

    public static int getGroupMoney() {
        return groupMoney;
    }

    public static void setGroupMoney(int groupMoney) {
        Student.groupMoney = groupMoney;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Student.total = total;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", college='" + college + '\'' +
                '}';
    }
}
