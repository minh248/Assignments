package com.vti.backend;

import com.vti.entity.CPU;
import com.vti.entity.Car;
import com.vti.entity.NgayThangNam;
import com.vti.entity.Outerclass;

public class InnerClass {
    public void question1(){
        CPU cpu = new CPU(10000000);
        CPU.Ram ram = cpu.new Ram(256, "Dell");
        CPU.Processor processor = cpu.new Processor(4, "Dell");
        System.out.println(ram.getClockSpeed());
        System.out.println(processor.getCache());
    }

    public void question2(){
        Car car = new Car("Marda", "8WD");
        Car.Engine engine = car.new Engine("Crysler");
        System.out.println(engine.getEngineType());
    }

    public void question3() {
        Outerclass outerclass = new Outerclass();
        outerclass.show();

        Outerclass.InnerClass innerClass = outerclass.new InnerClass();
        innerClass.show();
    }

    public void question4() {
        NgayThangNam date= new NgayThangNam();
        date.ngay = 31;
        date.thang = 10;
        date.nam = 2017;

        NgayThangNam.GioPhutGiay time= date.new GioPhutGiay();
        time.gio = 10;
        time.phut = 15;
        time.giay = 30;

        time.xuatThongTin();
    }
}
