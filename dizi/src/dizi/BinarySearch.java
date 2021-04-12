package dizi;

import java.util.List;

import jdk.internal.org.objectweb.asm.commons.StaticInitMerger;

public class BinarySearch {
	 public static void main(String args[]){
	        int[] liste = {2, 4, 7, 10, 11, 45, 50, 52, 59, 60, 66, 69, 70, 79}; //Arrayimizi Sýralý biçimde oluþturduk
	 
	        int sayiIndex = binarrySearch(liste,52); //binarySearch methoduna dizimizi ve aradýðýmýz sayýyý gönderiyoruz
	        if(sayiIndex != -1){ //method -1 dönmediyse sayý bulunmuþtur
	            System.out.println("Aranan sayýnýn index'i :"+sayiIndex);
	        }else{ //-1 döndüðünde -1 dönecek ve else düþecek
	            System.out.println("Aranan sayý bulunamadý");
	        }
	    }
	private static int binarrySearch(int[] list, int key) {
        int baslangic = 0; //dizinin baþlangýç index'i
        int son = list.length-1; //dizinin bitiþ index'i
        int orta; //dizinin ortanca index'i
 
        while (baslangic<=son){ //baslangic sondan büyük olana kadar devam edecek , zaten baþlangýç deðeri sondan büyðk olursa aradýðýmýz eleman dizide yok demektir
            orta = (int)(baslangic+son)/2; //her seferinde ortanca deðer bulunucak
            if(list[orta]>key) { //ortanca deðer aranan deðerden büyükse array ikiye bölünecek 
                son = orta - 1; //son deðer, ortanca deðerden 1 önceki deðer olacak
            }
            else if(list[orta]==key) { //aranan bulundu
                return orta;//indexi dön
            }
            else {//ortanca deðer aranan deðerden küçükse
                baslangic = orta + 1; //baslangýç deðeri, ortanca deðerden 1 sonraki deðer olacak
            }
        }
 
        return -1;//sonuç bulunamazsa -1 dönecek
    }
}
