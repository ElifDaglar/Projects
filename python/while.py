x= 1
while x <= 100:
    print(x)
    x +=1
print('bitti...') 

#tek ssyıları yazdırmak için:
y=1
while y<=100:
    if y % 2==1:
        print(f'sayı tek: {y}')
    else:
        print(f'sayı çift: {y}')
    y += 1
print('bitti...')
    


name = '' #false
while not name:
    name = input('isminizi giriniz: ')
print(f'merhaba, {name}')  

i=0
sayilar = [1,3,5,7,9,12,19,21]
while (i < len(sayilar)):
    print(sayilar[i])
    i += 1

baslangic=int(input("başlangıç: "))
bitis=int(input('bitiş: '))

while baslangic<bitis:
    baslangic+=1
    if(baslangic % 2 ==1):
     print(baslangic)
sayi=100
print("100 den 1 e azalan:")
while(sayi>0):
    print(sayi)
    sayi-=1
c=5
sayilar=[]
while(c>0):
    sayi=int(input("sayı girin: "))
    sayilar.append(sayi)
    c-=1
print(sayilar)

urunler = []
urunS=int(input("kaç ürün gireceksiniz: "))
i=0
while i<urunS:
    name = input("ürün ismi: ")
    price = input("ürün fiyatı: ")
    urunler.append({
    'name':name,
    'price':price
    })
i +=1
for urun in urunler:
     print(f"ürün adı: {urun['name']} ürün fiyatı: {urun['price']}")



