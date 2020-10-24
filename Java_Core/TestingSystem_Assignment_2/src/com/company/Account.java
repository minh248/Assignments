package com.company;

import java.time.LocalDate;

public class Account {
   int id;
   String email;
   String username;
   String fullname;
   Department department;
   Position position;
   LocalDate createDate;
   Group[] groups;

   @Override
   public String toString() {
      return "ID: " + this.id  + " | "
              + "Email: " + this .email + " | "
              + "Username: " + this.username + " | "
              + "Full name: " + this.fullname + " | "
              + "Department: " + this.department.name + " | "
              + "Position: " + this.position.name + " | "
              + "Create date: ";
   }
}

