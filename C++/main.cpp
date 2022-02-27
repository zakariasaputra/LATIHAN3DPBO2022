/*
Saya Muhammad Zakaria Saputra 2007993 mengerjakan Latihan 3 C1 dalam
mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan kecurangan
seperti yang telah dispesifikasikan. Aamiin
*/
#include <string>
#include <iostream>
using namespace std;
//mengimport kelas PC
#include "PC.cpp"

int main() {
    //instansiasi variabel masukan
    string pName, dType;
    int pPrice, dCapacity, dPrice, rCapacity, rPrice;

    //meminta masukan untuk setiap atribut
    cout<<"Input: "<<endl;
    cout<<"Processor Name: ";
    cin>>pName;
    cout<<"Processor Price: ";
    cin>>pPrice;
    cout<<"RAM Capacity: ";
    cin>>rCapacity;
    cout<<"RAM Price: ";
    cin>>rPrice;
    cout<<"Disk Type: ";
    cin>>dType;
    cout<<"Disk Capacity: ";
    cin>>dCapacity;
    cout<<"Disk Price: ";
    cin>>dPrice;

    //Membuat objek Processor, Disk, dan RAM
    Processor processor(pName, pPrice);
    Disk disk(dType, dCapacity, dPrice);
    RAM ram(rCapacity, rPrice);

    //Membuat objek PC lalu Masukkan objek Processor, Disk, dan RAM
    cout<<endl<<"Output: "<<endl;
	
	//Menampilkan hasil atribut yang ada pada kelas
    PC pc(processor, ram, disk);
    pc.printPC();
    return 0;
}

