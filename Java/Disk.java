public class Disk {
    //atribut
    private String type;
    private int capacity;
    private int price;

    //constructor
    Disk() {}
    Disk(String type, int capacity, int price) {
        this.type=type;
        this.capacity=capacity;
        this.price=price;
    }

    //Setter Getter
    public void setType(String type) { this.type=type; }
    public void setCapacity(int capacity) { this.capacity=capacity; }
    public void setPrice(int price) { this.price=price; }
    
    public String getType() { return this.type; }
    public int getCapacity() { return this.capacity; }
    public int getPrice() { return this.price; }

    //Method
    //Menampilkan atribut Disk
    public void printDisk() {
        System.out.println("Disk Type : " + this.getType());
        System.out.println("Disk Capacity : " + this.getCapacity());
        System.out.println("Disk Price : " + this.getPrice());
    }
}
