package hw05;

public class Computer {
    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;

    public Computer(String cpu, String memory, String hd, String color, String power) {
        this.cpu = cpu;
        this.memory = memory;
        this.hd = hd;
        this.color = color;
        this.power = power;
    }

    public void turnOn(){
        System.out.println("Turning on the computer.");
    }

    public void printInfo(){
        System.out.println(" CPU: " + cpu);
        System.out.println(" Memory: " + memory);
        System.out.println(" HDD: " + hd);
        System.out.println(" Color: " + color);
        System.out.println(" Power: " + power);
    }
}
