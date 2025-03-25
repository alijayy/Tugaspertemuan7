package AliZainalAbidinZaky_2309033_Tugas7;
import java.util.Scanner;

/**
 *
 * @author Ali Zaky
 */

/*Tulis program uji yang mengukur waktu eksekusi pengurutan 100.000 angka menggunakan  selection sort. */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StopWatch stopwatch =  new StopWatch();
        int angka;
        
        System.out.print("Masukkan batas angka : ");
        angka = input.nextInt();
        
        stopwatch.start();
        selectionSortAscending(angka);
        System.out.println("Waktu Eksekusi Ascending : " + stopwatch.getElapsedTime() + "s");
        
        stopwatch.start();
        selectionSortDescending(angka);
        System.out.println("Waktu Eksekusi Descending : " + stopwatch.getElapsedTime() + "s");
    }
    
    public static void selectionSortAscending(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                if (j < i) {
                    int temp = i;
                    i = j;
                    j = temp;
                }
            }
        }
    }
   
    public static void selectionSortDescending(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                if (j > i) {
                    int temp = i;
                    i = j;
                    j = temp;
                }
            }
        }
    }
    
}
