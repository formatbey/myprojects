package com.javanetworking;
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class main {

  public static void main(String[] args) {
   try{
   while(true){
     Scanner scan = new Scanner(System.in);
     System.out.println("[ SİTE BİLGİ AL ]");
     System.out.println("(y) yardım");
     System.out.println("(b) başlat");
    
     System.out.println("islem:");
     String islem = scan.nextLine();
     if(islem.isEmpty()){
       System.out.println("İslem giriniz!!");
     }
     else if(islem.equals("y") || islem.equals("Y")){
       System.out.println("\n");
       System.out.println("[ Yardim ]");
       System.out.println("website urlsini basinda http:// veya https:// yazarak giriniz");
       System.out.println("\n");
     }
     else if(islem.equals("b") || islem.equals("B")){
       System.out.println("Website url :");
       String adress = scan.nextLine();
       URL url = new URL(adress);
       System.out.println("\n");
       System.out.println("[ Site Bilgileri ]");
       System.out.println("Protokol :"+url.getProtocol());
       System.out.println("Host :"+url.getHost());
       System.out.println("Port:"+url.getPort());
       if(url.getFile().isEmpty()){
         System.out.println("Dosya adi: yok");
       }
       else{
       System.out.println("Dosya adi:"+url.getFile());
       }
       System.out.println("\n");
      
     }
     else{
       System.out.println("Boyle bir islem yok!");
     }
     }
   }catch(Exception e){
     System.out.println("Bir Hata Oluştu:"+e);
        }
  }
}
