def changeName(n):
    n = "ada"
name = "yiğit"
changeName(name)
print(name)

def change(n):
    n[0] = "istanbul"
sehirler = ["ankara", "izmir"]
n = sehirler[:] #slicing bütün bilgileri at
n[0] =" istanbul"

change(sehirler[:])
print(n)

def add(a,b,c=0):
    return sum((a,b,c))

#veya
def add2(*params):
    return sum((params))
print(add(10,20,30))
print(add2(10,20,30))

def add3(*params): #tuple listesi
    sum = 0

    for n in params:
        sum = sum + n
    return sum
print(add3(10,20,30,50,60,10,20))

def displayUser(**args): #dictionary örneği (key-value)
    print(type(args))
    for key, value in args.items():
        print( '{} is {} ' .format(key,value))



displayUser(name= "Çınar", age =2, city = "istanbul")
displayUser(name= "Ada", age =12, city = "Kocaeli",phone = '1547584')
displayUser(name= "Ada", age =14, city = "Ankara",phone = '1547584' , email ='yigit@mail.com')

def myFunc(a, b, c, *args, **kwargs): #keyword args
  print(a)
  print(b)
  print(c)
  print(args)
  print(kwargs)

myFunc(10,20,30,40,50,key1 = 'value 1' , key2 = 'value 2')

def ekranaYaz(kelime):
    msg=int(input("kaç kez yazsın: "))
    while(msg>0):
     print(kelime)
     msg-=1
     #ya da
def ekranaYaz2(kelime,sayi):
    print(kelime * sayi)

isim=input("kelime: ")
ekranaYaz(isim)
ekranaYaz2("merhaba\n",3)

def parameters(*param):
    liste = []
    liste.append(param)
    print(liste)
parameters("10,20,30",72)

def findAsal(sayi1,sayi2):
    asalMi=False

def listeyeCevir(*params):
    liste = []
    for param in params:
     liste.append(param)
    return liste
result= listeyeCevir(10,20,30,"Merhaba") 
print(result)

sayi1= int(input("sayı 1: "))
sayi2= int(input("sayı 2: "))


