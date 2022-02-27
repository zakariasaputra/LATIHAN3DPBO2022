class RAM:
    #atribut
    __capacity=0
    __price=0

    #constructor
    def __init__(self, capacity=0, price=0):
        self.__capacity=capacity
        self.__price=price

    #Setter Getter
    def setCapacity(self, capacity):
        self.capacity=capacity

    def setPrice(self, price):
        self.__price=price
    
    def getCapacity(self):
        return self.__capacity

    def getPrice(self):
        return self.__price

    #Method
    #Menampilkan atribut RAM
    def printRAM(self):
        print("RAM Capacity: " + str(self.getCapacity()))
        print("RAM Price: " + str(self.getPrice()))
