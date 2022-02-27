#include <string>
#include <iostream>
using namespace std;
//Mengimport kelas Processor, RAM, dan Disk
#include "Processor.cpp"
#include "RAM.cpp"
#include "Disk.cpp"

class PC{
    private:
        //atribut
        Processor processorObj;
        RAM ramObj;
        Disk diskObj;
        int totalPrice;
    public:
        //constructor
        PC() {}
        PC(Processor processorObj, RAM ramObj, Disk diskObj) {
            this->processorObj=processorObj;
            this->ramObj=ramObj;
            this->diskObj=diskObj;
        }
        //Setter Getter
        void setProcessor(Processor processorObj) { this->processorObj=processorObj; }
        void setRam(RAM ramObj) { this->ramObj=ramObj; }
        void setDisk(Disk diskObj) { this->diskObj=diskObj; }
        void setTotalPrice(int pPrice, int rPrice, int dPrice) {
            this->totalPrice= pPrice + rPrice + dPrice;
        }

        Processor getProcessorObj() { return this->processorObj; }
        RAM getRamObj() { return this->ramObj; }
        Disk getDiskObj() { return this->diskObj; }
        int getTotalPrice() { return this->totalPrice; }

        //Method
		//Menampilkan atribut PC
        void printPC() {
            this->processorObj.printProcessor();
            this->ramObj.printRAM();
            this->diskObj.printDisk();
            this->setTotalPrice(this->processorObj.getPrice(), this->ramObj.getPrice(), this->diskObj.getPrice());
            cout<<"Total Price: "<<this->getTotalPrice()<<endl;        
        }
        //Destructor
        ~PC() {}
};