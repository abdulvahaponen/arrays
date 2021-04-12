package dizi;

import jdk.internal.org.objectweb.asm.commons.StaticInitMerger;

public class LinearSearch {
public static void main(String[] args) {
	int[] liste= {1,4,99,2,5,-3,2,6,-49,52};
	int sayiIndex=linearrSearch(liste,53);
	if (sayiIndex!=-1) {
		System.out.println("aranan sayýnýn indeksi:"+sayiIndex);
		
	}else {
		System.out.println("aranan sayý bulunamadý");
	}
}
private static int linearrSearch(int[] liste,int arananSayi) {
	for (int i = 0; i <liste.length; i++) {
		if (liste[i]==arananSayi) {
			return i;
		}
	}
	return -1;
}
}
