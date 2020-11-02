package com.vti.backend;

import com.vti.entity.abstraction.Ex1.*;
import com.vti.entity.abstraction.Ex1.Phone;
import com.vti.entity.abstraction.Ex1.VietnamesePhone;
import com.vti.entity.abstraction.Ex2_3.Employee;
import com.vti.entity.abstraction.Ex2_3.Manager;
import com.vti.entity.abstraction.Ex2_3.User;
import com.vti.entity.abstraction.Ex2_3.Waiter;

public class Abstraction {
    // question 1
    public void question1(){
        Phone p = new VietnamesePhone();
        p.insertContact("Minh", "0967993496");
        p.removeContact("Minh");
        p.updateContact("Minh", "0967993496");
        p.searchContact("Minh");
    }

    public void question2_3(){
        User user1 = new Waiter("A",3.2);
        user1.displayInfo();
        User user2 = new Employee("B",2);
        user2.displayInfo();
        User user3 = new Manager("C",4.1);
        user3.displayInfo();
    }
}
