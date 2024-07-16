DogumGunu = int(input("Doğum gününüzü giriniz: "))
DogumAyi = input("Doğum Ayınızı Giriniz: ")

if (DogumAyi== "Mart" and DogumGunu >= 21 and DogumGunu <= 31) or (DogumAyi== "Nisan" and DogumGunu <= 20 and DogumGunu <= 31):
 print("Burcunuz Koç")
elif(DogumAyi== "Nisan" and DogumGunu >= 21 and DogumGunu <= 31) or (DogumAyi== "Mayıs" and DogumGunu <= 21 and DogumGunu <= 31):
  print("Burcunuz Boğa")
elif(DogumAyi== "Mayıs" and DogumGunu >= 22 and DogumGunu <= 31) or (DogumAyi== "Haziran" and DogumGunu <= 22 and DogumGunu <= 31):
  print("Burcunuz İkizler")
elif(DogumAyi== "Haziran" and DogumGunu >= 23 and DogumGunu <= 31) or (DogumAyi== "Temmuz" and DogumGunu <= 22 and DogumGunu <= 31):
  print("Burcunuz Yengeç")
elif(DogumAyi== "Temmuz" and DogumGunu >= 23 and DogumGunu <= 31) or (DogumAyi== "Ağustos" and DogumGunu <= 22 and DogumGunu <= 31):
  print("Burcunuz Aslan")
elif(DogumAyi== "Ağustos" and DogumGunu >= 23 and DogumGunu <= 31) or (DogumAyi== "Eylül" and DogumGunu <= 22 and DogumGunu <= 31):
  print("Burcunuz Başak")
elif(DogumAyi== "Eylül" and DogumGunu >= 23 and DogumGunu <= 31) or (DogumAyi== "Ekim" and DogumGunu <= 22 and DogumGunu <= 31):
  print("Burcunuz Terazi")
elif(DogumAyi== "Ekim" and DogumGunu >= 23 and DogumGunu <= 31) or (DogumAyi== "Kasım" and DogumGunu <= 21 and DogumGunu <= 31):
  print("Burcunuz Akrep")
elif(DogumAyi== "Kasım" and DogumGunu >= 22 and DogumGunu <= 31) or (DogumAyi== "Aralık" and DogumGunu <= 21 and DogumGunu <= 31):
  print("Burcunuz Yay")
elif(DogumAyi== "Aralık" and DogumGunu >= 22 and DogumGunu <= 31) or (DogumAyi== "Ocak" and DogumGunu <= 21 and DogumGunu <= 31):
  print("Burcunuz Oğlak")
elif(DogumAyi== "Ocak" and DogumGunu >= 22 and DogumGunu <= 31) or (DogumAyi== "Şubat" and DogumGunu <= 19 and DogumGunu <= 31):
  print("Burcunuz Kova")
elif(DogumAyi== "Şubat" and DogumGunu >= 20 and DogumGunu <= 31) or (DogumAyi== "Mart" and DogumGunu <= 20 and DogumGunu <= 31):
  print("Burcunuz Balık")
else:
  print("Yanlış değer girdiniz.")
