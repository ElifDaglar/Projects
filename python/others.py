#Identitiy Operator: is

x = y = [1, 2, 3]
z = [1, 2, 3]

print(x==y)
print(x==z)
print(x is y) #değerler önemli değil objeler aynı mı değil mi buna bakılır.
print(x is z)

x =[1, 2, 3]
y=[2, 4]
del x[2]
y[1] = 1
y.reverse()
print(x==y)
print(x is y)
print(x is not y)

#Membership Operator: in

x=['apple','banana']
print('banana' in x) # bu nesneyi içeriyor mu

name="çınar"
print('a' in name)



