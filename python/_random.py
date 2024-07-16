import random

#result =dir(random)
result = random.random() # 0.0 ila 1.0 arasında bir sayı üretilir
result = random.random() * 100
result = random.uniform(1,10) # 1-10 arası ondalıklı sayı üretir
result = int(random.uniform(1,10)) # tam sayı üretmek için casting
result = random.randint(1,100) # tam sayı üretir

greeting = 'hello there'
names = ['Ali' , 'yağmur' ,'deniz' , 'cenk']
result = names[random.randint(0,len(names)-1)]
# 0-3 arsı bir sayı üretir ve bilgiler bize tek tek gelir
result = random.choice(names) #bizim için rastgele bir isim seçer
result = random.choice(greeting)

liste =list(range(10))
random.shuffle(liste) # orijinal liste içerisindeki elemanların yerleri değiştirilir

liste = range(100)
result=random.sample(liste,3) # liste içinden rastgele 3 eleman getir
result = random.sample(names ,2)
print(result)
#print(liste) 


