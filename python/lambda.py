def square(num): return num ** 2

numbers = [1,3,4,5,9,10]

result= list(map(square, numbers))
#veya for item in map(square, numbers):
#print(item)
#result = list(map(lambda num: num ** 2 , numbers))
#result=square(3)
print(result)

#map: dizinin elemanlarını tek tek fonksiyona gönderir

def check_even(num): return num %2==0

result=list(filter(check_even,numbers)) #filter belirli koşulu sağlayan elemanları almak için kullanılır
print(result)
#result= list(filter(lambda num: num % 2 == 0, numbers))

result = check_even(numbers[2])
