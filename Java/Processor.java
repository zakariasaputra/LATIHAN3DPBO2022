public class Processor {
    //atribut
    private String name;
    private int price;

    //constructor
    Processor() {}
    Processor(String name, int price) {
        this.name=name;
        this.price=price;
    }

    //Setter Getter
    public void setName(String name) { this.name=name; }
    public void setPrice(int price) { this.price=price; }
    
    public String getName() { return this.name; }
    public int getPrice() { return this.price; }

    //Method
    //Menampilkan atribut Processor
    public void printProcessor() {
        System.out.println("Processor Name : " + this.getName());
        System.out.println("Processor Price : " + this.getPrice());
    }
}
