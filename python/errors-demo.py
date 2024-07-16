import re
liste = ["1" , "2" , "5a" , "10b" , "abc", "10" , "50"]
for x in liste:
    try:
        result = int(x)
        print(result)
    except ValueError:
        continue

while True:
    sayi = input('sayi: ')
    if sayi == 'q':
        break
    try:
        result = float(sayi)
        print('girdiğiniz sayı: ',result)
    except ValueError:
        print('geçersiz sayı')
        continue 


def checkPassword(parola):

 turkce_karakterler = ["ö","ü","ı","o","u","ç","ğ","ş"]  

 for i in ifade:
  for i in turkce_karakterler:
        if i in turkce_karakterler:
         raise TypeError('parola türkçe karakter içeremez')
        else:
            pass
   
print("geçerli parola")
ifade = input("parola girin: ")

try:
   checkPassword(ifade)
except TypeError as err:
   print(err)

def factorial(sayi):
    if not isinstance(sayi, int):
        raise ValueError("Girdi tam sayı değil.")
    if sayi < 0:
        raise ValueError("Negatif sayı girdiniz.")
    
    result = 1
    for i in range(1, sayi + 1):
        result *= i
    return result

for x in [5, 10, 20, -3, '10a']:
    try:
        y = factorial(x)
        print(f"{x}! =", y)
    except ValueError as err:
        print(err)

         
      


  