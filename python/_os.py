import os
import datetime
#result = dir(os)
#result = os.name
#result=os.getcwd()
# dizin değiştirme
# os.chdir('C:\\')
# os.chdir('../..') 1. 2 nokta ile python dizinine 2. iki nokta ile de C dizinine geçiş yaparız

# klasör oluşturma
#os.mkdir("newdirectory")

#etkin dizin öğrenme
#result = os.getcwd()

#klasör oluşturma
#os.makedirs("newdirectory/yeniklasör")
#os.rename("newdirectory","yeniklasör")
# os.rmdir("newdirectory") : newdirectory klasörünü siler
#os.removedirs("yeniklasör/yeniklasör")

#listeleme
#result = os.listdir()
# result = os.listdir('C:\\')

#for dosya in os.listdir(): #sadece py uzantılı dosyaları gösterir
#   if dosya.endswith('.py'):
#        print(dosya)
#result = os.stat("_datetime.py")
#result = result.st_size/1024
# dosyanın oluşturulma tarihi : result = datetime.datetime.fromtimestamp(result.st_ctime)
# dosyaya son erişim tarihi : #result = datetime.datetime.fromtimestamp(result.st_atime)
# dosyanın değiştirilme tarihi :result = datetime.datetime.fromtimestamp(result.st_mtime)

# os.system("notepad.exe") : notepad uygulamasını çalıştırır

# path

result = os.path.abspath("_os.py") #dosyanın tam konumunu yolunu verir
result = os.path.dirname("C:/Users/Elif/python/_os.py") #dosyanın dizin ismini verir
result = os.path.dirname(os.path.abspath("_os.py"))
result = os.path.exists("C:/Users/Elif/python/_os4.py")
result = os.path.isdir("C:/Users/Elif/python/_os.py") #klasör mü diye kontrol eder dosya olduğu için false dönderir
result = os.path.isfile("C:/Users/Elif/python/_os.py")
result = os.path.join("C: \\","deneme","deneme1") #path oluşturma
result = os.path.split("C:\\deneme")
print(result)
