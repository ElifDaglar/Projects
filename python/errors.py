# error => hata

# error handling => hata yönetimi

# print(a) tanımlanmamış ifade kullanımı: NameError

# int('12a') : ValueError

# print(10/0) : ZeroDivisionError

# print('denem'e) : yazım yanlışı hatası SyntaxError

 # error handling => hata yönetimi
try:

 x = int(input('x: '))
 y = int(input('y: '))
 print(x/y)
except ZeroDivisionError:
 print('y için 0 girilemez ')
except ValueError:
 print("x ve y için sayısal değer girmelisiniz")
else:
 print('her şey yolunda')
# veya except (ZeroDivisionError, ValueError) as e:
#print: yanlış bilgi girdiniz.
#print(e) #hangi objeden gelen hata mesaj olduğunu gösterir

while True:
 
    try:

     a = int(input('a: '))
     b = int(input('b: '))
     print(x/y)
    except Exception as ex:
     print('yanlış bilgi girdiniz' ,ex)
    else:
     break
    finally: #finally bloğu her zaman çalışır
     print('try except sonlandı')




