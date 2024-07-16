name= 'Sadık Turan'
for letter in name:
    if letter == 'ı': # ı harfini atlar
        continue
    print(letter)

for letter in name:
    if letter == 'u': # ı harfini atlar
       break #döngüden çıkar
    print(letter)

x = 0

while x < 5:
    print(x)
    x+=1
print("y: ")
y=0
while y < 5:
    if y == 2:
        break
    print(y)
    y+=1
print("z: ")
z=0
while z < 5:
    z+=1
    if z == 2:
        continue
    print(z)
    
 #1-100 e kadar tek sayıların toplamı

x=1
result=0
while x<=100:
    result+=x
    x+=1
print(f'toplam: {result}')

d=1
while d<=100:
    d+=1
    if d % 3 == 1:
        continue
    result+=d
print(f"toplam: {result}")
