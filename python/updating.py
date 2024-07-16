'''
with open("newfile.txt" , "r+" , encoding="utf-8") as file:
    print(file.write("deneme"))
with open("newfile.txt" , "r+" , encoding="utf-8") as file:
    print(file.read())
    '''
with open("newfile.txt","a",encoding="utf-8") as file:
    file.write("\nEmel Turan")
with open("newfile.txt" , "r" , encoding="utf-8") as file:
    print(file.read())

# ********** sayfa başında güncelleme *************
with open("newfile.txt" , "r+" , encoding="utf-8") as file:
    content = file.read()
    content = "Efe Turan\n" + content
    file.seek(0)
    file.write(content)
with open("newfile.txt" , "r" , encoding="utf-8") as file:
    print(file.read())
   
# ********** sayfa ortasında güncelleme *************
with open("newfile.txt" , "r+" , encoding="utf-8") as file:
   list = file.readlines()
   list.insert(1,"Ali korkmaz\n") #1.indeksten sonra ekler
   file.seek(0)
   file.writelines(list)
   '''
   for i in list:
       file.write(i)
with open("newfile.txt" , "r" , encoding="utf-8") as file:
    print(file.read())
    '''

