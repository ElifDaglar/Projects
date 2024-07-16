fruits={ 'orange' , 'apple' , 'banana'}

#print(fruits[0]) indekslenemez

for x in fruits:
    print(x)

fruits.add('cherry')
fruits.update(['mango','grape', 'apple'])
#listede olan elemanları eklemez
fruits.remove('mango')
fruits.discard('apple')

fruits.pop() #sıralı değil herhangi bir eleman silinebilir
fruits.clear() #bütün elemanlar silinir
print(fruits)

myList = [1,2,5,1,4,2]
print(myList)
print(set(myList)) #tekrarlayan elemanlar liste içerisinden gider

#value types => string, number
x = 5
y = 25
x = y
y = 10
#print(x,y)

#reference types =>  list, class
a=["apple","banana"]
b=["apple","banana"]
a = b
b[0] = "grape"
print(a,b)
