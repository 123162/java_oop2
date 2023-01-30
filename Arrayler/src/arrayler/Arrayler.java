package arrayler;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayler {

    public static void arrayiBastir(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ".eleman:" + array[i]);
        }
    }

    public static double ortalamaBul(int arr[]) {
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }
        return ((double) toplam / arr.length);
    }

    public static int[] arrayDoldur(int sayi) {
        Scanner ar = new Scanner(System.in);
        int dizi[] = new int[sayi];
        for (int i = 0; i < sayi; i++) {
            System.out.print("dizi elemanı:");
            dizi[i] = ar.nextInt();
        }
        return dizi;
        
    }

    public static void arraySort(int array[]) {
        Arrays.sort(array);
        arrayiBastir(array);
    }

    public static void main(String[] args) {
        int arr1[] = arrayDoldur(5);
        
        System.out.println("sıralı dizimiz:");
        arraySort(arr1);
        /* Scanner sn=new Scanner(System.in);
        System.out.print("lütfen dizinin boyutunu giriniz:");
        int arrays=sn.nextInt();
        int arr[]=new int[arrays];
        for(int i=0;i<arrays;i++){
            System.out.print("dizi elamanlarını giriniz:");
            arr[i]=sn.nextInt();
            
        }
        arrayiBastir(arr);
        System.out.println("dizimizin ortalaması."+ortalamaBul(arr));*/
        
        
    }
    
}
