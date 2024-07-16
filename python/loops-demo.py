import  random
x=random.randint(1,10)
#or x=random.random()
hak=int(input("kaç adet hakkınız olsun? "))
sayac = 0
while hak>0:
 sayi=int(input("tahmin edilen sayı: "))

 if sayi<x:
    print("yukarı")
    hak -=1
    sayac+=1
    
 elif sayi>x:
    print("aşağı")
    hak -=1
    sayac+=1

 elif(sayi==x):
        sayac+=1
        print("doğru tahmin")
        print(f"{sayac} . defada bildiniz. Toplam puanınız: {100 - (100/hak) * (sayac-1)}")
        break
 else:
    print("hatalı ifader girildi")
hak -=1
print("tahmin hakkınız bitti. Tututlan sayı: ", x )
