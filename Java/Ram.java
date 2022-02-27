public class Ram {
    //atribut
    private int capacity;
    private int price;

    //constructor
    Ram() {}
    Ram(int capacity, int price) {
        this.capacity=capacity;
        this.price=price;
    }

    //Setter Getter
    public void setCapacity(int capacity) { this.capacity=capacity; }
    public void setPrice(int price) { this.price=price; }
    
    public int getCapacity() { return this.capacity; }
    public int getPrice() { return this.price; }

    //Method
    //Menampilkan atribut RAM
    public void printRam() {
        System.out.println("RAM Capacity : " + this.getCapacity());
        System.out.println("RAM Price : " + this.getPrice());
    }
}
