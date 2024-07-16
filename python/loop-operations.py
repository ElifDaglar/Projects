liste = [1,2,3]

for item in liste:
    print(item)

for item in range(10):
    print(item) # 10 u almaz 10 a kaadar 0 dan itibaren tüm sayıları yazdırır

for i in range(2,10):
    print(i) # 2 dahil 10 a kadar sayıları yazdırır
for it in range(50,100,20):
    print(it)
print(list(range(50, 100, 20)))

#enumerate
index=0
greeting='Hello There'

for letter in greeting:
    print(f'index: {index} letter: {letter}')
    index +=1
# veya for letter in greeting:
# print(f'index: {index} letter: {greeting[index]}')
#    index +=1
 #enumerate her bir elemanın indeksini almamızı sağlar
for index, item in enumerate(greeting):
    print(f'index: {index} letter: {item}')

#zip her bir listedeki elemanı diğer listedeki elemanla eşleştirir
list1 = [1,2,3,4,5]
list2 = ['a','b','c','d','e']
list3 = [100,200,300,400,500]


print(list(zip(list1,list2,list3)))

for item in zip(list1, list2 , list3):
    print(item)

for a,b,c in zip(list1, list2, list3):
    print(a,b,c)