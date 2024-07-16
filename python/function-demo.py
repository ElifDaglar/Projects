def asalSayilariBul(sayi1,sayi2):
    for sayi in range(sayi1,sayi2+1):
        if sayi>1:
            for i in range(2,sayi):
                if (sayi % i == 0):
                    break
            else:
                print(sayi)
sayi1= int(input("sayı 1: "))
sayi2= int(input("sayı 2: "))
asalSayilariBul(sayi1,sayi2)

def tamBolenleriBul(sayi):
    tamBolenler = []
    for i in range(2,sayi):
        if sayi % i ==0:
            tamBolenler.append(i)
    return tamBolenler
print(tamBolenleriBul(20))
