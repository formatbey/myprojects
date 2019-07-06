package com.personelekle;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
public class main {
  public static void personel_ekle(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Personel sayisi:");
    int personelsayisi = scanner.nextInt();
    ArrayList personeller = new ArrayList<String>();
    int personelSay=0;
    String ic = " >>>> ";
    for(int i = 0; i<personelsayisi; i++){
    System.out.println("Personel adi:");
    String ad = scanner.next();
    
    scanner.nextLine();
    
    System.out.println("Personel mevki:");
    String mevki = scanner.next();
    personelSay+=1;
    if(ad.isEmpty() || mevki.isEmpty()){
      System.out.println("Personel bilgilerini eksiksiz giriniz!");
    }
    else{
      personeller.add(ad+ic+mevki);
    }
    }
    System.out.println("Ekleme basariyla gerceklesti !");
    System.out.println("eklediginiz personel sayisi:"+"("+personelSay+")");
    System.out.println("///////////////////////////");
    System.out.println("(g) Göster");
    String goster = scanner.next();
    int sira = 1;
    if(goster.equals("g")){
      for(Object personel:personeller){
        System.out.println("["+sira+"]"+" "+personel);
        sira+=1;
      }
    }
    else{
      System.out.println("Boyle bir secenek mevcut degil!");
    }
  }
  public static void main(String[] args) {
   java.util.Date date = new java.util.Date();
   System.out.println("[Tarih :"+date+"]");
   System.out.println("(+) P E R S O N E L / E K L E");
   personel_ekle();
  }
}




