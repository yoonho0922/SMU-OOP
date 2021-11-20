import hw07.InkjetPrinter;
import hw07.LaserPrinter;

public class Homework07 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T720DW", 1);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while (inkjet.print()) ;
        while (laser.print()) ;
    }
}
