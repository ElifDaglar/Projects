x,y,z = 5,16,20
x,y=y,x # x i y ye y yi x e atar
x = x + 5
x += 5  #x = x + 5
x -= 5  #x = x-5
x *= 5
x /= 5
x %= 5
y //= 5 #bölümün tam kısmını alır
y **= z

print(x,y,z)
 
values = 1,2,3,4,5

print(values)
print(type(values))
x, y, *z = values #kalan değerler z ye gitsin
print(x,y,z)
print(x,y,z[0])