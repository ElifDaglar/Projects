sayi=int(input('sayı giriniz: '))
result = (sayi>0) and (sayi<100)
result=(sayi>0) and (sayi%2==0)


email="mailto@mail.com"
parola='1234ed'
mail=(input("mail girin: "))
password=(input("parola girin: "))
result=(email==mail) and (parola==password)

sayi1=int(input("1.sayı: "))
sayi2=int(input("2.sayı: "))
sayi3=int(input("3.sayı: "))
result = (sayi1 > sayi2) and (sayi1>sayi3)
print(f"a en büyük sayıdır: {result}")

result = (sayi2 > sayi1) and (sayi2>sayi3)
print(f"b en büyük sayıdır: {result}")

result = (sayi3 > sayi2) and (sayi3>sayi1)
print(f"c en büyük sayıdır: {result}")


vize1=float(input("1.vizeyi girin: "))
vize2=float(input("2.vizeyi girin: "))
final=float(input("final: "))
ort=(((vize1 + vize2)/2) * 0.6) + (final * 0.4)
result=(ort>=50) and (final>=50)
print(f"öğrencinin ortalaması: {ort} ve geçme durumu: {result}")

ad=input("adınız: ")
kilo=float(input("kilo: "))
boy=float(input("boy: "))
vki=(kilo) / (boy ** 2)
zayif=(vki>=0) and (vki<=18.4)
normal=(vki>18.4) and (vki<=24.9)
fazlaKilo=(vki>24.9) and (vki<=29.9)
obez=(vki>29.9) and (vki<=34.9)


print(f'{ad} kilo indeksin: {vki} ve kilo değerlendirmen: {zayif}')
print(f'{ad} kilo indeksin: {vki} ve kilo değerlendirmen: {normal}')
print(f'{ad} kilo indeksin: {vki} ve kilo değerlendirmen: {fazlaKilo}')
print(f'{ad} kilo indeksin: {vki} ve kilo değerlendirmen: {obez}')
