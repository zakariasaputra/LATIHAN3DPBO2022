<?php
class Processor{
    //atribut
    private $name;
    private $price;

    //constructor
    function __construct($name, $price) {
        $this->name=$name;
        $this->price=$price;
    }

    //Setter Getter
    function setName($name) { $this->name=$name; }
    function setPrice($price) { $this->price=$price; }

    function getName() { return $this->name; }
    function getPrice() { return $this->price; }

    //Method
    //Menampilkan atribut Processor
    function printProcessor() {
        echo "Processor Name: " . $this->getName() . "<br>";
        echo "Processor Price: " . $this->getPrice() . "<br>";
    }

    function __destruct() {}
}
