sayilar = [1,3,5,7,9,12,19,21]

for i in sayilar:
    if i%3==0:
        print(i)
for s in sayilar:
    toplam=0
    toplam+=s
print("toplam: ",toplam)

for s in sayilar:
    if(s%2!=0):
        s=s**2
        print("tek sayıların karesi: ",s)

sehirler = ['kocaeli' , 'istanbul' , 'ankara' , 'izmir' , 'rize']
for s in sehirler:
    if(len(s)<=5):
        print(s)
urunler = [
    {'name' : 'samsung s6' ,'price' : '3000' },
    {'name' : 'samsung s7' ,'price' : '4000' },
    {'name' : 'samsung s8' ,'price' : '5000' },
    {'name' : 'samsung s9' ,'price' : '6000' },
    {'name' : 'samsung s10' ,'price' : '7000' },
]
toplam=0
for urun in urunler:
    toplam+=int(urun['price'])
    
print(f'ürünlerin toplamı: {toplam}')

print("fiyatı 5000 tl nin altındaki ürünler: ")
for urun in urunler:
    if(int(urun['price'])<=5000):
        print(urun['name'])
