#Mengimport kelas
from Processor import Processor
from Disk import Disk
from RAM import RAM

class PC:
    #atribut
    __processorObj=Processor()
    __ramObj=RAM()
    __diskObj=Disk()
    __totalPrice=0

    #constructor
    def __init__(self, processorObj, ramObj, diskObj):
        self.__processorObj=processorObj
        self.__ramObj=ramObj
        self.__diskObj=diskObj

    #Setter Getter
    def setProcessorObj(self, processorObj):
        self.__processorObj=processorObj

    def setRamObj(self, ramObj):
        self.__ramObj = ramObj

    def setDiskObj(self, diskObj):
        self.__diskObj = diskObj

    def setTotalPrice(self, pPrice, rPrice, dPrice):
        self.__totalPrice = pPrice + rPrice + dPrice


    def getProcessorObj(self):
        return self.__processorObj
    
    def getRamObj(self):
        return self.__ramObj

    def getDiskObj(self):
        return self.__diskObj

    def getTotalPrice(self):
        return self.__totalPrice

    #Method
    #Menampilkan atribut PC
    def printPC(self):
        self.__processorObj.printProcessor()
        self.__ramObj.printRAM()
        self.__diskObj.printDisk()
        self.setTotalPrice(self.__processorObj.getPrice(), self.__ramObj.getPrice(), self.__diskObj.getPrice())
        print("Total Price: " + str(self.getTotalPrice()))
