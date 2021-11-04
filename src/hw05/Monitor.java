package hw05;

public class Monitor {
    private String monitorSize;
    private String color;
    private String power;

    public Monitor(String monitorSize, String color, String power) {
        this.monitorSize = monitorSize;
        this.color = color;
        this.power = power;
    }

    public void turnOn(){
        System.out.println("Turning on the monitor.");
    }

    public void printInfo(){
        System.out.println(" Size: " + monitorSize);
        System.out.println(" Color: " + color);
        System.out.println(" Power: " + power);
    }
}
