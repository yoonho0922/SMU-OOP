package hw05;

public class PersonalComputer {
    private Computer computer;
    private Monitor monitor;

    public PersonalComputer(Computer computer, Monitor monitor) {
        this.computer = computer;
        this.monitor = monitor;
    }

    public void turnOn(){
        computer.turnOn();
        monitor.turnOn();
    }

    public void printInfo(){
        System.out.println("The spec of  the computer.");
        computer.printInfo();
        System.out.println("The spec of the monitor");
        monitor.printInfo();
    }
}
