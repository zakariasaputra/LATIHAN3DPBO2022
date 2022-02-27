#include <string>
#include <iostream>
using namespace std;

class Disk {
    private:
        //atribut
        string type;
        int capacity;
        int price;
    public:
        //constructor
        Disk() {}
        Disk(string type, int capacity, int price) {
            this->type=type;
            this->capacity=capacity;
            this->price=price;
        }
        //Setter Getter
        void setType(string type) { this->type=type; }
        void setCapacity(int capacity) { this->capacity=capacity; }
        void setPrice(int price) { this->price=price; }

        string getType() { return this->type; }
        int getCapacity() { return this->capacity; }
        int getPrice() { return this->price; }

        //Method
		//Menampilkan atribut Disk
        void printDisk() {
            cout<<"Disk Type: "<<this->type<<endl;
            cout<<"Disk Capacity: "<<this->capacity<<endl;
            cout<<"Disk Price: "<<this->price<<endl;
        }
        //Destructor
        ~Disk() {}
};