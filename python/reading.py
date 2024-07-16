'''
try:
 file= open("newfile.txt","r")
 print(file)
except FileNotFoundError:
 print("dosya okuma hatası")
finally:
 print("dosya kapandı")
 file.close()



#for döngüsü
for i in file:
 print(i, end="") #print yazıldıktan sonra 1 boşluk bırak

# read() fonksiyonu
content1 = file.read()

print("içerik 1: ")
print(content1)

content2 =file.read()
print("içerik 2: ")
print(content2)

content = file.read(5)
content = file.read(3)

print(content)
'''
# ***************** readline() fonksiyonu
file = open("newfile.txt","r",encoding="utf-8")
# print(file.readline(),end="")
# print(file.readline(),end="")
# print(file.readline(),end="")
# print(file.readline()) #karaktter olmamasına rağmen readline dan dolayı boşluk eklemeye devam eder
# ****************** readlines() fonksiyonu

liste = file.readlines()
print(liste[0])
print(liste[1])
print(liste[2])


file.close()