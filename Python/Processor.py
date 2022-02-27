class Processor:
    #atribut
    __name=""
    __price=0

    #constructor
    def __init__(self, name="", price=0):
        self.__name=name
        self.__price=price

    #Setter Getter
    def setName(self, name):
        self.__name=name

    def setPrice(self, price):
        self.__price=price

    def getName(self):
        return self.__name

    def getPrice(self):
        return self.__price

    #Method
    #Menampilkan atribut Processor
    def printProcessor(self):
        print("Processor Name: " + self.getName())
        print("Processor Price: " + str(self.getPrice()))
