package dizi;

import java.util.List;

import jdk.internal.org.objectweb.asm.commons.StaticInitMerger;

public class BinarySearch {
	 public static void main(String args[]){
	        int[] liste = {2, 4, 7, 10, 11, 45, 50, 52, 59, 60, 66, 69, 70, 79}; //Arrayimizi S�ral� bi�imde olu�turduk
	 
	        int sayiIndex = binarrySearch(liste,52); //binarySearch methoduna dizimizi ve arad���m�z say�y� g�nderiyoruz
	        if(sayiIndex != -1){ //method -1 d�nmediyse say� bulunmu�tur
	            System.out.println("Aranan say�n�n index'i :"+sayiIndex);
	        }else{ //-1 d�nd���nde -1 d�necek ve else d��ecek
	            System.out.println("Aranan say� bulunamad�");
	        }
	    }
	private static int binarrySearch(int[] list, int key) {
        int baslangic = 0; //dizinin ba�lang�� index'i
        int son = list.length-1; //dizinin biti� index'i
        int orta; //dizinin ortanca index'i
 
        while (baslangic<=son){ //baslangic sondan b�y�k olana kadar devam edecek , zaten ba�lang�� de�eri sondan b�y�k olursa arad���m�z eleman dizide yok demektir
            orta = (int)(baslangic+son)/2; //her seferinde ortanca de�er bulunucak
            if(list[orta]>key) { //ortanca de�er aranan de�erden b�y�kse array ikiye b�l�necek 
                son = orta - 1; //son de�er, ortanca de�erden 1 �nceki de�er olacak
            }
            else if(list[orta]==key) { //aranan bulundu
                return orta;//indexi d�n
            }
            else {//ortanca de�er aranan de�erden k���kse
                baslangic = orta + 1; //baslang�� de�eri, ortanca de�erden 1 sonraki de�er olacak
            }
        }
 
        return -1;//sonu� bulunamazsa -1 d�necek
    }
}
