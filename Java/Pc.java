public class Pc {
    //atribut
    private Processor processorObj;
    private Disk diskObj;
    private Ram ramObj;
    private int totalPrice;

    //constructor
    Pc() {}
    Pc(Processor processorObj, Ram ramObj, Disk diskObj) {
        this.processorObj=processorObj;
        this.ramObj=ramObj;
        this.diskObj=diskObj;
    }

    //Setter Getter
    public void setProcessorObj(Processor processorObj) { this.processorObj=processorObj; }
    public void setRamObj(Ram ramObj) { this.ramObj=ramObj; }
    public void setDiskObj(Disk diskObj) { this.diskObj=diskObj; }
    public void setTotalPrice(int pPrice, int rPrice, int dPrice) {
        this.totalPrice=pPrice + rPrice + dPrice;
    }

    public Processor getProcessorObj() { return this.processorObj; }
    public Ram getRamObj() { return this.ramObj; }
    public Disk getDiskObj() { return this.diskObj; }
    public int getTotalPrice() { return this.totalPrice; }

    //Method
    //Menampilkan atribut PC
    public void printPc() {
        this.processorObj.printProcessor();
        this.ramObj.printRam();
        this.diskObj.printDisk();
        this.setTotalPrice(this.processorObj.getPrice(), this.ramObj.getPrice(), this.diskObj.getPrice());
        System.out.println("Total Price: " + this.getTotalPrice());
    }
}
