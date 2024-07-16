
message='Hello there! my name is Elif Dağlar'
'''
message=message.upper()
print(message)
message=message.lower()
print(message)
message=message.title() #her kelimenin ilk harfini büyük yapar
print(message)
message=message.capitalize() #cümlenin ilk harfini büyük yapar
print(message)
message=message.strip() #baştaki boşluk karakterini siler
message=message.split() #ifadeyi boşluk karakterlerinden böler
print(message)
#message=message.split(".") ifadeyi . dan böler
message= '*' .join(message) #ayırdığımız ifadeyi birleştirir aralara yıldız ekler
print(message)

index=message.find("eliff") #ifade cümlede varsa olduğu indexi dönderir yoksa -1 dönderir
print(index)
isFound=message.startswith('H')
print(isFound)
isf=message.endswith("g")
print(isf)
message=message.replace("Elif","Tugba") #kelimeyi istediğimiz kelime ile değiştirir
print(message)
message=message.center(100)
print(message)
#100 karakterlik alan oluşturur ve bizim mesajımızı o alanda ortalar
website="http://www.sadikturan.com"
course="Pyhton Kursu: Baştan Sona Pyhton Programlama Rehberiniz (40 saat)"
print(" Hello World ".strip())
print(" Hello World ".lstrip())#sadece soldaki boşluğu siler
print(" Hello World ".rsplit())#sadece sağdaki bolşuğu siler

result='www.elifdaglar.com'.strip('w.moc')
print(result)
x=website.find('elifdaglar')
print(x)
x=website[11:21]
print(x)

print(course.lower())
print(course.count('a'))
print(course.count('a',0,10)) #a karakteri 0 ila 10 içerisinde var mı
print(course.rfind("pyhton")) #saymaya sağdan başlar

isTrue=(website.startswith("www") and website.endswith("com"))
print(isTrue)
isFind=website.find(".com")
print(isFind)
y=course.isalpha()
print(y)
z="contents".center(50 ,"*")
z="contents".center(50 ,"-")
z="contents".ljust(50 ,"*")
z="contents".rjust(50 ,"*")
print(z)

course=course.replace(" " , "-")
print(course)

print("Hello World".replace("Hello","There"))

print(course.split(" "))

myList=[1,2,3]
myList=['bir',2,True,5.6]
print(myList)

list1=['one','two','three']
list2=['four','five','six']
numbers=list1+list2
print(numbers)
print(len(numbers))
print(numbers[0])
print(numbers[2])

userA=['Sadık',36]
userB=['Çınar',2]

users=userA+userB
print(userA)
print(userB)
print(users)
print(users[0][0])
arabalar=['BMW','Mercedes','Opel','Mazda']
print(len(arabalar))
print(arabalar[0])
print(arabalar[-1])
arabalar[-1]='Toyota'
print(arabalar)
print('mercedes' in arabalar)
print(arabalar[-2])
print(arabalar[:3])
arabalar[-2:] = ['Toyota','Renault']
print(arabalar)
arabalar=arabalar + ['Audi','Nissan']
print(arabalar)
del arabalar[-1]
print(arabalar)
print(arabalar[::-1])

studentA=["yigit","bilgi",2010,[70,60,70]]
studentB=["sena","turan",1999,[80,80,70]]
studentC=["ahmet","turan",1998,[80,70,90]]

result=studentA[0]
result=studentB[1]
result=studentC[3][1]
result=f"{studentA[0]} {studentA[1]} {2024-studentA[2]} yaşında ve not ortalaması {(studentA[3][0]+studentA[3][1]+studentA[3][2])/3}"
print(result)

numbers=[1,10,5,16,4,9,10]
letters=['a','g','b','s','y','a','s']
val=min(numbers)
print(val)
val=max(numbers)
print(val)
val=min(letters)
print(val)
val=max(letters)
val=numbers[3:6]
print(val)
val=numbers[:3]
print(val)
numbers[4]=40
val=numbers
print(val)
numbers.append(49) #sayıyı sona ekler
numbers.insert(3,78) #verdiğimiz index numarasından önce 78 i ekler
numbers.insert(-1,52)
numbers.pop() #son elemanı siler
print(numbers)
numbers.remove(78) #silmek istediğimiz karakteri veriyoruz
numbers.sort()
letters.sort()
print(letters)
numbers.reverse() #tam tersine döndürmek için
print(numbers)
print(len(letters))
print(numbers.count(10))
numbers.clear() #tüm listeyi temizler
print(numbers)

names=['Ali','Yağmur','Hakan','Deniz']
years=[1998,2000,1998,1997]
names.append("Cenk")
names.insert(0,"Sena")
#names.remove("Deniz")
print(names.index("Deniz"))
print("Ali" in names)
print(names)
print(names[::-1])
names.reverse()
names.sort()
print(names)
#str='Chevrolet','Dacia' karakter dizisini listeye çevirin
str='chevrolet , dacia'
result=str.split(',')
result=min(years)
result=max(years)
print(years.count(1998))
years.clear()
print(result)
x=input("1.marka: ")
y=input("2.marka: ")
z=input("3.marka: ")
mylist=[x,y,z]
print(myList)

markalar=[]
marka=input("marka: ")
markalar.append(marka)

marka=input("marka: ")
markalar.append(marka)

marka=input("marka: ")
markalar.append(marka)
print(markalar)
'''
tuple=(1,'iki',3)
list=[1,2,3]
print(type(list))
print(type(tuple))
print(len(tuple))
print(len(list))
list=['Ali','Veli']
tuple=("Damla","Ayşe")
names=("Damla","Ayşe","Ayşe") + tuple

list[0]='ahmet'

#tuple da atanan değerler sonradan değiştirilemez
print(names)
print(list)
print(tuple)

sehirler=['Kocaeli','istanbul']
plakalar=[41,34]
print(plakalar[sehirler.index('istanbul')])

#print(plakalar['kocaeli']) =>41 yazmak için
#print(plakalar['istanbul']) =>34

plakalar={'kocaeli ' : 41 , 'istanbul' : 34}
print(plakalar['kocaeli '])

plakalar['ankara']= 6
plakalar['kocaeli '] = "new value"
print(plakalar)
