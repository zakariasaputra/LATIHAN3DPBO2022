# Design Pemrograman Berorientasi Objek
Repositori ini dibuat untuk memenuhi tugas latihan dari Mata Kuliah Desain Pemrograman Berorientasi Objek di Semester 4 pada Program Studi Ilmu Komputer Universitas Pendidikan Indonesia. Di dalamnya terdapat beberapa implementasi kelas dalam bahasa PHP, C++, Python, dan Java.
> Muhammad Zakaria Saputra; 2007993; Ilmu Komputer-C1-2020; Universitas Pendidikan Indoneisa

### Project Description
Pada latihan kali ini terdapat penerapan dari materi "Composition" di mana pada project kali ini terdapat 4 kelas yaitu kelas PC, Processor, RAM, dan Disk. PC memuat ketiga kelas lainnya sebagai atribut, "PC has a Processor, RAM, and Disk." Berikut atribut dari masing-masing kelas:
* PC
  * Processor
  * Disk
  * RAM
  * Total_Price
* Processor
  * Name
  * Price
* RAM
  * Capacity
  * Price
* Disk
  * Type
  * Capacity
  * Price

### Tools
- [MinGW](https://sourceforge.net/projects/mingw-w64/) : C++
- [JDK](https://www.oracle.com/java/technologies/downloads/) : Java
- [XAMPP](https://www.apachefriends.org/download.html) : PHP 
- [Python](https://www.python.org/) : Python
- Browser
- Text Editor

### Usage
#### C++
* Masuk ke directory project dalam CMD
* Eksekusi Perintah berikut:
```
g++ -c *.cpp
g++ main.cpp -o [name].exe
```

#### Java
* Masuk ke directory project dalam CMD
* Eksekusi Perintah berikut:
```
javac *.java
java main
```

#### PHP
- Pindahkan folder berisi kode PHP ke dalam folder htdocs di directory XAMPP
- Jalankan web server Apache pada XAMPP
- Masukan alamat berikut pada browser:
  > localhost/[nama-folder]/[nama-file].php

#### Python
* Masuk ke directory project dalam CMD
* Eksekusi Perintah berikut:
```
py [name].py
```
### Results
1. C++</br>
![SS C++](https://github.com/zakariasaputra/LATIHAN3DPBO2022/blob/0cb6d419486cf80ee68f42a0e3386684e7461397/Screenshot%20Hasil/C++.png)
2. Java</br>
![SS Java](https://github.com/zakariasaputra/LATIHAN3DPBO2022/blob/0cb6d419486cf80ee68f42a0e3386684e7461397/Screenshot%20Hasil/Java.png)
3. PHP</br>
![SS PHP](https://github.com/zakariasaputra/LATIHAN3DPBO2022/blob/0cb6d419486cf80ee68f42a0e3386684e7461397/Screenshot%20Hasil/PHP.png)
4. Python</br>
![SS Py](https://github.com/zakariasaputra/LATIHAN3DPBO2022/blob/0cb6d419486cf80ee68f42a0e3386684e7461397/Screenshot%20Hasil/Python.png)

