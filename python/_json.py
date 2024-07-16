import json
# dict

person_string = '{"name": "Ali", "languages": ["python","C#"]}'

#JSON string to Dict

#result = json.loads(person_string)
#result = result["name"]
#result = result["languages"]
#print(type(result))

#with open("person.json") as f:
    #data = json.load(f)
#print(data)
#print(data["name"])

#Dict to JSON string

person_dictionary ={
    "name": "Ali",
    "languages" : ["Python","C#"]
}
result = json.dumps(person_dictionary)
#print(type(result))
#json dosaysının üzerine yazma
with open("person.json","w") as f:
    json.dump(person_dictionary,f)

person_dictionary = json.loads(person_string) # içeriye doğru 4 karakterlik boşluk bırakır
result = json.dumps(person_dictionary, indent= 4, sort_keys=True)
print(person_dictionary)
print(result)