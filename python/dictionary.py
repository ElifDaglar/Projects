users={
    'sadikturan' : {
        'age':36,
         'roles':['user'],
        'e-mail':'sadik@gmail.com',
        'addres':'kocaeli',
        'phone': '123123'
    },
    'cinarturan' : {
        'age':2,
        'roles':['admin','user'],
        'e-mail':'cinar@gmail.com',
        'addres':'kocaeli',
        'phone': '123123'
    },
    }
print(users['cinarturan']['age'])
print(users['cinarturan']['e-mail'])
print(users['cinarturan']['phone'])
print(users['cinarturan']['roles'][0])
'''
ogrenciler ={
    '120': {
        'ad':'Ali',
        'soyad':'Yılmaz',
        'telefon': '532 000 00 01'
    },
    '125': {
        'ad':'Can',
        'soyad':'Korkmaz',
        'telefon': '532 000 00 02'
    },
    '128': {
        'ad':'Volkan',
        'soyad':'Yükselen',
        'telefon': '532 000 00 03'
    }
}
'''
ogrenciler ={} #başlangıçta bir öğrenciler listesi oluşturuyoruz
number=input("öğrenci no: ")
name=input("öğrenci adı: ")
surname=input("öğrenci soyadı: ")
phone=input("öğrenci telefon: ")

ogrenciler[number] = {
    'ad':name,
    'soyad':surname,
    'telefon':phone,
}

#ya da
ogrenciler.update({
    number: {
        'ad' : name,
        'soyad' :surname,
        'telefon' : phone
    }
})
number=input("öğrenci no: ")
name=input("öğrenci adı: ")
surname=input("öğrenci soyadı: ")
phone=input("öğrenci telefon: ")

ogrenciler.update({
    number: {
        'ad' : name,
        'soyad' :surname,
        'telefon' : phone
    }
})
number=input("öğrenci no: ")
name=input("öğrenci adı: ")
surname=input("öğrenci soyadı: ")
phone=input("öğrenci telefon: ")

ogrenciler.update({
    number: {
        'ad' : name,
        'soyad' :surname,
        'telefon' : phone
    }
})
#print(ogrenciler)

print('*'*50)
ogrNo= input('ogrenci no: ')
ogrenci = ogrenciler[ogrNo]

print(f'Aradığınız {ogrNo} nolu öğrencinin adı: {ogrenci['ad']} soyadı: {ogrenci['soyad']} ve telefonu ise {'telefon'}  ')






