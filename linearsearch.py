def linearsearch(dizi,sayi):
    for i in range(0,len(dizi)):
        if(sayi == dizi[i]):
            print("{} sayisi {} . sirada bulundu".format(sayi,i))
            return True
        
        print("{} sayisi dizi içerisinde bulunamadi".format(sayi))
        return False
            
              
diziX = [10,20,40,60,80,-5,3,189,120,999,1000]
while True:
    sayiX = int(input(">>"))
    linearsearch(diziX,sayiX)
