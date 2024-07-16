sayi=int(input("sayı: "))
if sayi>0 and sayi<100:
    print("sayı istenen aralıkta")
else:
    print("sayı istenilen aralıkta değil")
if(sayi>0 and sayi%2==0):
    print("sayı çift ve pozitif")

email="email@sadikturan.com"
password="abc1234"

mail=input("mail: ")
parola=input("parola: ")
if mail==email and password==parola:
    print("giriş başarılı")
elif mail !=email and password==parola:
    print("giriş başarısız. mail yanlış girildi ")
elif mail==email and password!=parola:
    print("giriş başarısız.parola yanlış girildi ")
else:
    print("hatalı parola ve şifre")


sayi1=int(input("1.sayı: "))
sayi2=int(input("2.sayı: "))
sayi3=int(input("3.sayı: "))

if sayi1>sayi2 and sayi1>sayi3:
    print(f"sayı1: {sayi1} daha büyüktür")
elif sayi2>sayi1 and sayi2>sayi3:
    print(f"sayı2: {sayi2} daha büyüktür")
elif sayi3>sayi1 and sayi3>sayi2:
    print(f"sayi3: {sayi3} daha büyüktür")
else:
    print("sayılar eşittir")

vize1=float(input("1.vize notu: "))
vize2=float(input("2.vize notu: "))
final=float(input("final notu: "))
ort=(vize1 + vize2) * 0.6 + final * 0.6
if final>=70:
    print("geçti")
elif ort>=50 and final>=50:
    print("geçti")
else:
    print("kaldı")

ad=input("adı: ")
kg=float(input("kilosu: "))
boy=float(input("boyu: "))

index=(kg) / (boy ** 2)
if index>=0 and index<=18.4:
    print(f"vücut kitle indeksiniz {index} ve sağlık durumunuz zayıf")
elif index>18.4 and index<=24.9:
    print(f"vücut kitle indeksiniz {index} ve sağlık durumunuz normal")
elif index>24.9 and index<=29.9:
    print(f"vücut kitle indeksiniz {index} ve sağlık durumunuz kilolu")
elif index>=29.9 and index<=34.9:
    print(f"vücut kitle indeksiniz {index} ve sağlık durumunuz obez")
else:
    print("yanlış değer girdiniz.")


