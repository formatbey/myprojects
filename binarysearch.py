sayilar = [2,5,8,12,16,24,38,56,72]
sol = len(sayilar) - len(sayilar)
sag = len(sayilar) - 1
orta = sol+sag // 2 #4 #orta nokta 16
x = int(input(">>"))
for i in range(0,len(sayilar)):
    if(x == sayilar[orta]):
        print("aradiginiz eleman:",orta,".sirada")
    elif(x < sayilar[orta]):
        orta-=1
        sol = orta
        print(sol)
    elif(x > sayilar[orta]):
        orta+=1
        sag = orta
        print(sag)
