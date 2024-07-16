#class

class Person:
     # pass => class ın içine herhangi bir şey yazmıyorsak yer tutucu olarak kullanılır
    #attributes
    #methods
    #class attributes
    address = 'no information'


    #constructor(yapıcı metod)
    def __init__(self, name, year): #self class tan türetilen herhangi bir obje
    # tanımlanacak olan objeler üzerine eklenecek objeler
    #object attributes
       self.name =name
       self.year=year #self yerine this de kullanılabilir
       print('init metodu çalıştı.')

    #instance methods
    def intro (self):
        print("hello world. I am " + self.name)
    def calculatingAge(self):
        return 2024 - self.year


#object (instance)
p1 = Person('Elif', 2000)
p2 = Person("Hatice" , 2002)

#updating
p1.name = 'ahmet'
p1.address = 'kocaeli'
p1.intro()
p2.intro()

print(f'adım: {p1.name} yaşım: {p1.calculatingAge()}')
print(f"adım: {p2.name} yaşım: {p2.calculatingAge()}")

#accesing object attributes
print(f"p1 :name: {p1.name} year: {p1.year} addres: {p1.address}")
print(f"name: {p2.name} year: {p2.year} address: {p2.address}")
print(p1)
print(type(p1))
print(p1==p2)
