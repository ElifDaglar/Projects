import re

result = dir(re)


# re module

str = "python kursu: python programlama rehberiniz | 40 saat"

#result = re.findall("python",str) # bulunan kelimeleri yazar
#result = len(result)
#result = re.split(" ",str) # split metodu bulduğu her bir boşluk karakterinden sonra ifadeyi böler

#result = re.sub(" " ,"-",str) # str içerisindeki tüm boşluk karakterlerini - ile değiştir
result = re.search("python" ,str) # verilen ifadeyi 0-6. karakterlerde bulduk
#result = result.span() # ifade kaçıncı indexte
#result = result.start()  #kaçıncı ifadeden itibaren başlıyor
#result = result.end() # kaçıncı karakterde bitiyor
#result =result.group() # bulduğu ifadeyi bize geri gönderir
#result = result.string() # aradığı string bilgiyi yazdırır




# regular expression

'''
[] - köşeli parantezler arasına yazılan bütün karakterler aranır.
    [abc] => a      : 1 match
             ac     : 2 match
             Python : no matches
        [a-e] => [abcde]
        [1-5] => [12345]
        [0-39]=> [01239]

        [^abc]  => abc dışndaki karakterler.
        [^0-9]  => rakam olmayan karakterler.
'''
result = re.findall("[abc]" , str) # bulduğu bütün abc karakterlerini dönderir
result = re.findall("[sat]",str)
result = re.findall("[a-z]",str) #ilgili str içindeki a dan z ye tüm karakterleri arar
result = re.findall("[^abc]" , str)
result = re.findall("[^0-9]" , str)

"""
. - Her hangi bir tek karakteri belirtir.
    .. => a     : no match
          ab    : 1 match
          abc   : 1 match
          abcd  : 2 match

""" # bütün 3 basamaklı ifadeleri geri gönderir
result = re.findall("..." , str)
result = re.findall("py..on" , str)

"""
^ - Belirtilen string karakterlerle başlıyor mu?

^a =>     a     : 1 match
          abc    : 1 match
          bac   : no match

"""
result = re.findall("^p" , str)

"""
$ - Belirtilen string karakterle bitiyor mu ?

a$ =>     a     : 1 match
          lambda: 1 match
          Python: no match

"""
result = re.findall("t$", str) #t ile biten ifadeyi dönderir
result = re.findall("saat$",str) # saat ile biten ifadeyi dönderir
result = re.findall("saatt$",str) # ilgili ifade yoksa boş liste dönderir
 


"""
 * - Bir karakterin sıfır ya da daha fazla sayıda olmasını kontrol eder.
     ma*n => mn   : 1 match
             man  : 1 match
             maaan: 1 match
             main : No match (a'nın arkasına n gelmiyor)

"""
result = re.findall("sa*t",str)
result = re.findall("sa+t",str) #a dan en az 1 tane ya da daha fazla olmalı.
"""
  {} - Karakter sayısını kontrol eder.
       a1{2} => a karakterinin arkasına 1 karakteri 2 kez tekrarlanmalı.
       a1{2,3} => a karakterinin arkasına 1 karakteri en az 2 en fazla 3 kez tekrarlanmalı.
       [0-9]{2,4} => en az 2 en çok 4 basamaklı sayılar.
"""
result = re.findall("a{2}",str) # a dan 2 tane içerenler
result = re.findall("a{2,3}",str) # en az 2 en fazla 3 tane içerenler
result = re.findall("[0-9]{2}",str) # 2 basamaklı sayı
"""
   | - alternatif seçeneklerden birinin gerçekleşmesi gerekir.
       a|b => a ya da b

           cde    => no match
           ade    => 1 match
           acdbea => 3 match
"""
"""
    () - gruplamak için kullanılır.
         (a|b|c)xz => a,b,c karakterlerinin arkasına xz gelmelidir.
"""
#result = re.findall(r"\Apython",str) # verilen ifadenin en başındaki ifade python mu?
#result = re.findall(r"saat\Z" , str) # verilen ifadenin en sonundaki ifade saat mi?
"""
     \ - özel karakterleri aramamızı sağlar.
         \$a => $ karakterinin arkasına a karakterini arar. Yani 
         $ regular exp. engine tarafından yorumlanmaz.
"""
"""
    \A - Belirtilen karakter string in başında mı?
         \Athe => the string in başında mı?

    \Z - Belirtilen karakter string in sonunda mı?
         the\Z => the string in sonunda mı
    \b-  Belirtilen karakter kelimenin in başında ya da sonunda mı?
         \bthe => the kelimenin in başında mı?
         the\b => the kelimenin in sonunda mı?
    
    \B - Belirtilen karakter kelimenin in başında ya da sonunda değil mi?
         \Bthe => the kelimenin in başında değil mi?
         the\B => the kelimenin in sonunda değil mi?

     \d - [^0-9] ile aynı anlama gelir yani rakam olmayanları arar.
          \D => 1ab44_50

     \s - Boşluk karakterlerini arar.
     \S - Boşluk karakterleri dışındakiler
     \w - Alfabetik karakterler, rakamlar ve alt çizgi karakteri
     \W - \w nin tam tersi

"""



print(result)