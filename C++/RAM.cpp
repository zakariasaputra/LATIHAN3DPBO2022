#include <string>
#include <iostream>
using namespace std;

class RAM {
    private:
        //atribut
        int capacity;
        int price;
    public:
        //constructor
        RAM() {}
        RAM(int capacity, int price) {
            this->capacity=capacity;
            this->price=price;
        }
        //Setter Getter
        void setCapacity(int capacity) { this->capacity=capacity; }
        void setPrice(int price) { this->price=price; }

        int getCapacity() { return this->capacity; }
        int getPrice() { return this->price; }

        //Method
        void printRAM() {
            cout<<"RAM Capacity: "<<this->capacity<<endl;
            cout<<"RAM Price: "<<this->price<<endl;
        }
        //Destructor
        ~RAM() {}
};