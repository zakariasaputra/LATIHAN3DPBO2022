class Disk:
    #atribut
    __type=""
    __capacity=0
    __price=0

    #constructor
    def __init__(self, type="", capacity=0, price=0):
        self.__type=type
        self.__capacity=capacity
        self.__price=price

    #Setter Getter
    def setType(self, type):
        self.__type=type
    
    def setCapacity(self, capacity):
        self.capacity=capacity

    def setPrice(self, price):
        self.__price=price

    def getType(self):
        return self.__type
    
    def getCapacity(self):
        return self.__capacity

    def getPrice(self):
        return self.__price

    #Method
    #Menampilkan atribut Disk
    def printDisk(self):
        print("Disk Type: " + self.getType())
        print("Disk Capacity: " + str(self.getCapacity()))
        print("Disk Price: " + str(self.getPrice()))
