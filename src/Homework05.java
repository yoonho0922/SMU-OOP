import hw05.Computer;
import hw05.Monitor;
import hw05.PersonalComputer;

public class Homework05 {
    public static void main(String[] args) {
        Computer computer = new Computer("Core i7",
                "16GB", "2TB", "White", "500W");
        Monitor monitor = new Monitor("24 inch",
                "Black", "45W");

        PersonalComputer pc = new PersonalComputer(computer, monitor);

        pc.turnOn();
        pc.printInfo();
    }
}
