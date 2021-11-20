package hw07;

public class LaserPrinter extends Printer {
    public LaserPrinter(String model, int availableCount) {
        this.model = model;
        this.availableCount = availableCount;
    }

    @Override
    public boolean print() {
        if (availableCount <= 0) {
            System.out.println(model + ": " + printedCount+1 +" 매째 인쇄 실패 - 토너 부족.");
            return false;
        } else{
            printedCount++;
            availableCount--;
            return true;
        }
    }
}
