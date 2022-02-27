/*
Saya Muhammad Zakaria Saputra 2007993 mengerjakan Latihan 3 C1 dalam 
mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan kecurangan
seperti yang telah dispesifikasikan. Aamiin
*/
// mengimport kelas utility
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //variabel untuk inputan
        Scanner sc=new Scanner(System.in);
        //instansiasi
        String pName="", dType="";
        int pPrice=0, dCapacity=0, dPrice=0, rCapacity=0, rPrice=0;

        //input untuk setiap atribut
        System.out.println("Input: ");
        try{
            System.out.print("Processor Name: ");
            pName=sc.next();
        } catch (Exception e){
        }
        try{
            System.out.print("Processor Price:: ");
            pPrice=sc.nextInt();
        } catch (Exception e){
        }
        try {
            System.out.print("RAM Capacity: ");
            rCapacity=sc.nextInt();
        } catch (Exception e){
        }
        try {
            System.out.print("RAM Price: ");
            rPrice=sc.nextInt();
        } catch (Exception e){
        }
        try {
            System.out.print("Disk Type: ");
            dType=sc.next();
        } catch (Exception e){
        }
        try {
            System.out.print("Disk Capacity: ");
            dCapacity=sc.nextInt();
        } catch (Exception e){
        }
        try {
            System.out.print("Disk Price: ");
            dPrice=sc.nextInt();
        } catch (Exception e){
        }

        //Membuat objek Processor, Disk, dan RAM
        Processor processor=new Processor(pName, pPrice);
        Disk disk=new Disk(dType, dCapacity, dPrice);
        Ram ram=new Ram(rCapacity, rPrice);

        //Membuat objek PC lalu Masukkan objek Processor, Disk, dan RAM
        Pc pc=new Pc(processor, ram, disk);

        //Menampilkan hasil atribut yang ada pada kelas
        System.out.println("\nOutput: ");
        pc.printPc();
    }
}