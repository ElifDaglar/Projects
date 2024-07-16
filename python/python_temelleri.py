maasAli=3000
maasAhmet=5000
vergi = 0.27
print(maasAli - (maasAli * vergi))
print(maasAhmet - (maasAhmet * vergi))

#Değişken Tanımlama Kuralları

# Rakam ile başlayamaz
number1=10
print(number1)
number1=20
print(number1)
number1+=30
print(number1)

#Büyük küçük harf duyarlılığı

age=30
Age=20
print(age)
print(Age)

#Türkçe karakter kullanmayalım

x=1
y=2
name="Elif"
isStudent=True
a ='10'
b='20'
print(a+b) #metinsel olarak birleşitir

firstName = 'Elif'
lastName = ' Daglar'
print(firstName + lastName)

x,y,name,isStudent = (1,2,'Elif',True) #bu şekilde de kullanılabilir.

musteriAd = 'Tugba'
musteriSoyad = ' Daglar'
musteriAdSoyad= musteriAd + musteriSoyad
musteriCinsiyet = 'kadın'
musteriTc=11111111111
musteriDogumYili = 1984
adresBilgisi = 'sivas'
musteriYas= 2024 - musteriDogumYili
print(musteriYas)

order1,order2,order3=100,110.5,356.95
toplam= order1 + order2 + order3
print("Total:",toplam)

'''
x=input('1.sayı: ') #input javadaki scanner komutuyla aynı kullanıcıdan veri girişi için kullanılır.
y=input('2.sayı: ')
print(type(x))
print(type(y))
toplam = int(x)+int(y)
print(toplam)
'''

#Type conversion
# int to float
x=5
y=2.5
name='Elif'
isOnline=False
y=int(y)
print(y)
print(type(y))

result = x+y
print(result)
print(type(result))

#bool to str
isOnline=str(isOnline)
print(isOnline)
print(type(isOnline))

#bool to int
#isOnline=int(isOnline)
print(isOnline)
print(type(isOnline))

r= float(input("yarıçap: "))
alan=3.14*(r**2)
cevre=2*3.14*r
print("alan",alan)
print("çevre",cevre)
print("alan: " + str(alan) + " çevre: " + str(cevre))

name='Elif'
surname='Dağlar'
age=23

greeting="my name is " + name + " " + surname +" and \nI am " + str(age) + " " + "years old." 
print(greeting[3])
print(greeting[5])
print(len(greeting))
#print(greeting[length-1])
print(greeting[-1]) #son karakteri bulmak için
print(greeting[3:7])
print(greeting[3:])

print('My name is {} {}' .format(name,surname))
print('My name is {1} {0}' .format(name,surname))
print('My name is {s} {n}' .format(n=name,s=surname))
print("My name is {} {} and I'm {} years old." .format(name,surname," 23"))

result=200/700
print('the result is {r:1.4} '.format(r=result))

