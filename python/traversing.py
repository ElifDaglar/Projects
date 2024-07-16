with open("newfile.txt" , "r" , encoding="utf-8") as file:
    content = file.read(10)
    print(content) #file.close() a gerek kalmadı
    file.seek(0) #içeriğin hepsini yazdıktan sonra cursor u 10.konuma gönderir
    print(file.tell()) #cursor ın konumunu verir
    content2 =file.read()
    print(content2)
    

