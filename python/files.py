# Dosya açmak ve oluşturmak için open() fonksiyonu kullanılır.
# Kullanımı: open(dosya_adi, dosya_erisme_modu)
# dosya_erisme_modu => dosyayı hangi amaçla açtığımızı belirtir

# "w" : (write) yazma modu. Dosyayı konumda oluşturur.
# dosya içeriğini siler ve yeniden ekleme yapar
# "a" : (Append) ekleme. Dosya konumda yoksa oluşturur.
# "x" : (Create) oluşturma. Dosya zaten varsa hata verir.
# "r" : (Read) okuma. Varsayılan dosya konumda yoksa hata verir.

'''
file = open("newfile.txt","w") 
file.close()

file = open("C:/Users/Elif/Desktop/newfile.txt","w")
print(file)


file = open("newfile.txt","w",encoding='utf-8') 
file.write("elif dağlar")
file.close()


file = open("newfile.txt","a",encoding='utf-8') 
file.write("\nelif dağlar") #sonra \n koyarsak 1 boş satır ekler
file.close()

'''
file = open("newfile2.txt","x",encoding='utf-8') 

