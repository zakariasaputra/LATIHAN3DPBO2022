<?php
/*
Saya Muhammad Zakaria Saputra 2007993 mengerjakan Latihan 3 C1 dalam
mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan kecurangan
seperti yang telah dispesifikasikan. Aamiin
*/
//mengimport kelas PC
include "Pc.php";

//Membuat objek Processor, Disk, dan RAM
$processor = new Processor("AMD Athlon Gold 3150U", 500000);
$ram = new Ram(8, 380000);
$disk = new Disk("SSD", 512, 700000);

//Membuat objek PC lalu Masukkan objek Processor, Disk, dan RAM
$pc = new Pc($processor, $ram, $disk);

//Menampilkan hasil atribut yang ada pada kelas
$pc->printPc();
