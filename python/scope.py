x = 'global x'
def function():
    x = 'local x'
    print(x)
function()
print(x)

name = 'Çınar'
def changeName(new_name):
    name = new_name
    print(name)

changeName("Ada")
print(name)

name = 'global string'
def greeting():
    name = 'Çınar'

    def hello():
        print('hello ' + name)
    hello()

greeting()

x = 50
def test(x):
    print('x ' , x)

    x = 100
    print('changed x to ' , x)
test(x)
print(x)