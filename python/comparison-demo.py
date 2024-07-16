sayi1=int(input("1.Sayiyi giriniz: "))
sayi2=int(input("2.Sayiyi giriniz: "))
if(sayi1>sayi2):
 print(f"{sayi1} daha büyüktür")
else:
    print("2.sayı daha büyüktür")

vize1=float(input("1.vize: "))
vize2=float(input("2.vize: "))
final=float(input("final: "))
ortalama=((vize1 + vize2) * 0.6) +  (final * 0.4)
if(ortalama>50):
 print("geçti")
else:
  print("kaldı")
print(ortalama)

sayi3=int(input("sayı girin: "))
if(sayi3%2==0):
  print("sayı çift")
else:
  print("sayı tek")

if(sayi3>0):
  print("sayı pozitif")
else:
  print("sayı negatif")

mail="email@sadikturan.com"
password="abc123"
parola=input("parolayı girin : ")
email=input("email girin: ")
if(password==parola):
  print("parola doğru")
elif(mail==email):
  print("email doğru")
else:
  print("parola ya da şifre uyuşmuyor")



