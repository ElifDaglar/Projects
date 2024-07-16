ad=input("isim: ")
yas=int(input("yaş: "))
egitim=input("eğitim: ")
if((egitim=="lise" or egitim=="üniversite") and yas>=18 ):
    print("ehliyet alabilir")
else:
    print("ehliyet alamazsınız")

yazili1=int(input("1.yazılı: "))
yazili2=int(input("2.yazılı: "))
sozlu=int(input("sözlü: "))
ort=(yazili1 + yazili2 + sozlu) / 3
if(ort>=0 and ort<24):
    print("notunuz 0")
elif(ort>25 and ort<44):
    print("notunuz 1")
elif(ort>45 and ort<54):
    print("notunuz 2")
elif(ort>55 and ort<69):
    print("notunuz 3")
elif(ort>70 and ort<84):
    print("notunuz 4")
else:
    print("notunuz 5")
import datetime

tarih= input("aracınız kaç gündür trafikte: (2019/8/9)")
tarih=tarih.split("/")

trafigeCikis=datetime.datetime(int(tarih[0]),int(tarih[1]),int(tarih[2]))
simdi= datetime.datetime.now()
fark=simdi - trafigeCikis
days=fark.days
print(fark.days)

if days<=365:
    print("1.servis aralığı")
elif days > 365 and days<=365*2:
    print("2.servis aralığı")
elif days > 365 and days<=365*3:
    print("3.servis aralığı")
else:
    print("hatalı süre")

    