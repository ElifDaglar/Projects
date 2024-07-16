website="www.elifdaglar.com"
course="pyhton kursu: baştan sona pyhton programlama rehberiniz (40 saat)"
print(len(course))
print(website[0:3])
print(website[15:])
print(course[:15])
print(course[15:31]) # ya da
print(course[-15:-1])
print(course[::-1]) #ifadeyi tersten yazma adım sayısı belirtir -1 olması sağdan sola doğru yazdır demektir

name,surname,age,job="Bora","Yılmaz",32,"mühendis"
print("Benim adım " + name + " " + surname + " yaşım " + str(age) + " ve mesleğim " + job)
#ya da
print("Benim adım {} {} yaşım {} ve mesleğim {}".format(name,surname,age,job))
print(f"Benim adım {name} {surname} yaşım {age} ve mesleğim {job} ")
s="hello world"
s=s[0:6] + 'W' + s[-4:]
print(s)
s.replace('w','W')
result="abc" * 3
print(result)

