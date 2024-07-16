class Circle: 
  #Class object attribute
  pi = 3.14
  def __init__(self,yaricap=1):
    self.yaricap=yaricap

  def cevreHesapla(self):
    return 2 * self.pi * self.yaricap
  
  def alan_hesapla(self):
    return self.pi * (self.yaricap**2)
  
c1=Circle() #parametre girilmediği için yarıçap 1 olarak alınır.
c2=Circle(5)

print(f'c1: alan= {c1.alan_hesapla()} çevre= {c1.cevreHesapla()} ')
print(f'c2: alan= {c2.alan_hesapla()} çevre= {c2.cevreHesapla()} ')

#inheritance (kalıtım): Miras alma
#person => name, lastName , age , eat() , drink() ,run()
#Student(Person), Teacher(Person)
#Animal => Dog(Animal) , Cat(Animal)

class Person:
  def __init__(self, fname ,lname):
      self.fname=fname
      self.lname=lname
      print('Person created')
    
  def who_am_i(self):
   print("I am a person")
  
  def eat(self):
    print("I am eating")

  

class Student(Person): #person sınıfından kalıtım var
    def __init__(self,fname,lname,number):
      Person.__init__(self,fname,lname), #overwrite ı engeller
      self.studentNumber = number
      print("student created")  
    
    def sayHello(self):
     print('Hello I am a student')

    def who_am_i(self): #override
     print("I am a person")

    


class Teacher(Person):
  def __init__(self, fname, lname,branch):
    super().__init__(fname, lname) #self i göndermemize gerek kalmıyor
    self.branch = branch

  def who_am_i(self):
    print(f"I am a {self.branch} teacher")


p1= Person("Ali","yılmaz")
s1= Student("çınar","turan",1256)
t1 = Teacher("Serkan","Yılmaz","Math")

print(p1.fname + " " + p1.lname)
print(s1.fname + " " + s1.lname + ' ' + str(s1.studentNumber))

p1.who_am_i()
s1.who_am_i()
p1.eat()
s1.eat()
s1.sayHello()
t1.who_am_i()




