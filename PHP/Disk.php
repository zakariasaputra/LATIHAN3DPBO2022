<?php
class Disk{
    //atribut
    private $type;
    private $capacity;
    private $price;

    //constructor
    function __construct($type, $capacity, $price) {
        $this->type=$type;
        $this->capacity=$capacity;
        $this->price=$price;
    }

    //Setter Getter
    function setType($type) { $this->type=$type; }
    function setCapacity($capacity) { $this->capacity=$capacity; }
    function setPrice($price) { $this->price=$price; }

    function getType() { return $this->type; }
    function getCapacity() { return $this->capacity; }
    function getPrice() { return $this->price; }

    //Method
    //Menampilkan atribut Disk
    function printDisk() {
        echo "Disk Type: " . $this->getType() . "<br>";
        echo "Disk Capacity: " . $this->getCapacity() . "<br>";
        echo "Disk Price: " . $this->getPrice() . "<br>";
    }

    function __destruct() {}
}
