package com.vti.frontend;

import com.vti.backend.Basic;

import java.io.IOException;
import java.sql.SQLException;

public class BasicProgram {
    public static void main(String[] args) throws IOException, SQLException {
        Basic basic = new Basic();
        basic.question1();
        basic.question2();
        basic.question3();
        basic.question4();
        basic.question5();
    }
}
