package com.vti.frontend;

import com.vti.backend.StudentManagement;

public class PolymophismProgram_1 {
    public static void main(String[] args) {
        // Question 1
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.initStudents();
        studentManagement.caLopDiemDanh();
        studentManagement.nhomDiHocBai();
        studentManagement.nhomDiDonVeSinh();
    }
}
