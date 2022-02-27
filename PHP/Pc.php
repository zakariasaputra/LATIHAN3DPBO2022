<?php
//Mengimport kelas Processor, Ram, dan Disk
include "Processor.php";
include "Ram.php";
include "Disk.php";

class Pc {
    //atribut
    private $processorObj;
    private $ramObj;
    private $diskObj;
    private $totalPrice;

    //constructor
    function __construct($processorObj, $ramObj, $diskObj) {
        $this->processorObj=$processorObj;
        $this->ramObj=$ramObj;
        $this->diskObj=$diskObj;
    }

    //Setter Getter
    function  setProcessorObj($processorObj) { $this->$processorObj=$processorObj; }
    function  setRamObj($ramObj) { $this->ramObj=$ramObj; }
    function  setDiskObj($diskObj) { $this->$diskObj=$diskObj; }
    function  setTotalPrice($pPrice, $rprice, $dPrice)
    {
        $this->totalPrice=$pPrice + $rprice + $dPrice;
    }

    function getProcessorObj() { return $this->processorObj; }
    function getRamObj() { return $this->ramObj; }
    function getDiskObj() { return $this->diskObj; }
    function getTotalPrice() { return $this->totalPrice; }

    //Method
    //Menampilkan atribut Pc
    function  printPc() {
        $this->processorObj->printProcessor();
        $this->ramObj->printRam();
        $this->diskObj->printDisk();
        $this->setTotalPrice($this->processorObj->getPrice(), $this->ramObj->getPrice(), $this->diskObj->getPrice());
        echo "Total Price: " . $this->getTotalPrice() . "<br>";
    }

    //Destructor
    function __destruct() {}
}
