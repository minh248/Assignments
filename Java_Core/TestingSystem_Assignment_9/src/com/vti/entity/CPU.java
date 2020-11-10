package com.vti.entity;

public class CPU {
    private int price;

    public CPU() {
    }

    public CPU(int price) {
        this.price = price;
    }

    // Why inner classes are suggested to be static ??
    public class Processor{
        private int coreAmount;
        private String manufacturer;

        public Processor(int coreAmount, String manufacturer) {
            this.coreAmount = coreAmount;
            this.manufacturer = manufacturer;
        }

        public double getCache(){
            return 4.3;
        }

        public int getCoreAmount() {
            return coreAmount;
        }

        public void setCoreAmount(int coreAmount) {
            this.coreAmount = coreAmount;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }
    }

    public class Ram{
        private int memory;
        private String manufacturer;

        public Ram(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        public double getClockSpeed(){
            return 5.3;
        }

        public int getMemory() {
            return memory;
        }

        public void setMemory(int memory) {
            this.memory = memory;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
