Paquet= [
    0,1,1,1,1,1,1,1,1,0,
    0,1,1,1,1,1,1,1,1,0,
    0,1,1,1,1,1,1,1,1,0,
    0,1,1,1,1,1,1,1,1,0
]
for Checker  in range(0,len(Paquet),10):
    if Paquet[Checker]!=Paquet[Checker+9]:
        print("wrong Paquet ")
