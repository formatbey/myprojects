#sezar şifreleme
dongu = 1
menu ="""
Python sezar şifreleme
örnek : özjğpglu
////////////////
[1] Şifrele
[2] Şifre çöz
[3] Çıkış
"""
while dongu == 1:
    print(menu)
    sorgu = input(">>")
    if(sorgu == ""):
        print("boş bırakmayınız !")
    elif(sorgu == "1"):
        kelimen = []
        harfler = ["a","b","c","ç","d","e","f","g","ğ","h","ı","i","j","k","l","m","n","o","ö","p","r","s","ş","t","u","ü","v","y","z","q","w"," x"]
        kelime = input("kelime:")
        for harf in kelime:
            if(harf in harfler): 
                sıra = harfler.index(harf) + 3
                kelimen.append(harfler[sıra])
                print(*kelimen)
            else:
                print("böyle bir harf yok!")
    elif(sorgu == "2"):
        kelimen = []
        harfler = ["a","b","c","ç","d","e","f","g","ğ","h","ı","i","j","k","l","m","n","o","ö","p","r","s","ş","t","u","ü","v","y","z","q","w"," x"]
        kelime = input("kelime:")
        for harf in kelime:
            if(harf in harfler): 
                sıra = harfler.index(harf) - 3
                kelimen.append(harfler[sıra])
                print(*kelimen) 
            else:
                print("böyle bir harf yok!")
    elif(sorgu == "3"):
        print("program kapatıldı!")
        dongu = 0
    else:
        print("böyle bir komut yok!")
