""" 
Saya Muhammad Zakaria Saputra 2007993 mengerjakan Latihan 3 C1 dalam
mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan kecurangan
seperti yang telah dispesifikasikan. Aamiin 
"""
#Mengimport kelas
from PC import PC
from Processor import Processor
from Disk import Disk
from RAM import RAM

#Membuat variabel untuk masukan
pName=""
dType=""
pPrice=0
rCapacity=0
rPrice=0
rCapacity=0
diskPrice=0

#Meminta masukan untuk setiap atribut
print("Input: ")
pName = str(input("Processor Name: "))
pPrice = int(input("Processor Price: "))
rCapacity = int(input("Ram Capacity: "))
rPrice = int(input("Ram Price: "))
dType = str(input("Disk Type: "))
dCapacity = int(input("Disk Capacity: "))
dPrice = int(input("Disk Price: "))

#Membuat objek Processor, Disk, dan RAM
processor = Processor(pName, pPrice)
ram = RAM(rCapacity, rPrice)
disk = Disk(dType, dCapacity, dPrice)

#Membuat objek PC lalu Masukkan objek Processor, Disk, dan RAM
pc = PC(processor, ram, disk)

#Menampilkan hasil atribut yang ada pada kelas
print("\nOutput:")
pc.printPC()
