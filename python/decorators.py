import math
import time

def my_decorator(func):
    def wrapper(name):
        print("fonksiyondan önceki işlemler")
        func(name)
        print("fonksiyondan sonraki işlemler")
    return wrapper

@my_decorator
def sayHello(name):
    print("hello", name)

def sayGreeting():
    print("greeting")

sayHello("ali")
sayGreeting()

def calculate_time(func):
    def inner(*args, **kwargs):
        start = time.time()
        time.sleep(1)
        func(*args, **kwargs)
        finish = time.time()
        print(f"fonksiyon {func.__name__} {finish - start} saniye sürdü.")
    return inner

@calculate_time
def usalma(a, b):
    print(math.pow(a, b))

@calculate_time
def factoriyel(num):
    print(math.factorial(num))

@calculate_time
def toplama(a,b):
    print(a+b)

usalma(2, 3)
factoriyel(4)
toplama(10,20)
