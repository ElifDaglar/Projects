from datetime import datetime
from datetime import time
from datetime import timedelta
import datetime 

simdi = datetime.datetime.now()
simdi=datetime.datetime.today()

result= datetime.datetime.now()
result = simdi.year
result = simdi.month
result = simdi.day
result = simdi.hour
result = simdi.minute
result = simdi.second
result = datetime.datetime.ctime(simdi)
result = datetime.datetime.strftime(simdi,'%Y') #sadce yıl
result = datetime.datetime.strftime(simdi,'%X') #sadece saat bilgisi
result = datetime.datetime.strftime(simdi,'%d') #saadece gün bilgisi
result = datetime.datetime.strftime(simdi,'%A') #gün bilgisini string verir
result = datetime.datetime.strftime(simdi,'%B') #ay bilgisini string verir
result = datetime.datetime.strftime(simdi,'%Y %B %A')

t = '15 April 2019 hour 10:12:30'
result = datetime.datetime.strptime(t, '%d %B %Y hour %H:%M:%S')
result = result.year
#result = dir(datetime)

birthday = datetime.datetime(1983,5,9,12,30,21)

result = datetime.datetime.timestamp(birthday) #ilgili tarih objesi saniye cinsinden
result = datetime.datetime.fromtimestamp(result) # saniye to datetime
result = datetime.datetime.fromtimestamp(0)

result = simdi - birthday #timedelta

#result = result.days
#result = result.seconds
#result = result.mikroseconds
 
result = simdi + timedelta(days=10)
result = simdi - timedelta(days=10)


print(result)