#include <string>
#include <iostream>
using namespace std;

class Processor {
    private:
        //atribut
        string name;
        int price;
    public:
        //constructor
        Processor() {}
        Processor(string name, int price) {
            this->name=name;
            this->price=price;
        }
        //Setter Getter
        void setName(string name) { this->name=name; }
        void setPrice(int price) { this->price=price; }

        string getName() { return this->name; }
        int getPrice() { return this->price; }

        //Method
        void printProcessor() {
            cout<<"Processor Name: "<<this->name<<endl;
            cout<<"Processor Price: "<<this->price<<endl;
        }
        //Destructor
        ~Processor() {}
};