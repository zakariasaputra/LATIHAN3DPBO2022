<?php
class Ram{
    //atribut
    private $capacity;
    private $price;

    //constructor
    function __construct($capacity, $price) {
        $this->capacity=$capacity;
        $this->price=$price;
    }

    //Setter Getter
    function setCapacity($capacity) { $this->capacity=$capacity; }
    function setPrice($price) { $this->price=$price; }

    function getCapacity() { return $this->capacity; }
    function getPrice() { return $this->price; }

    //Method
    //Menampilkan atribut Ram
    function printRam() {
        echo "RAM Capacity: " . $this->getCapacity() . "<br>";
        echo "RAM Price: " . $this->getPrice() . "<br>";
    }

    function __destruct() {}
}
