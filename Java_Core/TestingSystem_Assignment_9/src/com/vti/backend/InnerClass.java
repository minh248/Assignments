package com.vti.backend;

import com.vti.entity.CPU;

public class InnerClass {
    public void question1(){
        CPU cpu = new CPU(10000000);
        CPU.Ram ram = cpu.new Ram(256, "Dell");
        CPU.Processor processor = cpu.new Processor(4, "Dell");

        System.out.println(ram.getClockSpeed());
        System.out.println(processor.getCache());
    }
}
