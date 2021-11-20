package hw07;

public class InkjetPrinter extends Printer{

    public InkjetPrinter(String model, int availableCount) {
        this.model = model;
        this.availableCount = availableCount;
    }

    @Override
    public boolean print() {
        if (availableCount <= 0) {
            System.out.println(model + ": " + printedCount+1 +" 매째 인쇄 실패 - 잉크 부족.");
            return false;
        } else{
            printedCount++;
            availableCount--;
            return true;
        }
    }
}
