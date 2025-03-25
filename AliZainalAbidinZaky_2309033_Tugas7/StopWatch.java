/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AliZainalAbidinZaky_2309033_Tugas7;

/**
 *
 * @author Ali Zaky
 */

/*Rancang Class bernama StopWatch. Class berisi: 
1) Atribut private startTime dan endTime dengan get method (Konsep  Encapsulation).  V
2) Konstruktor tanpa argumen (kosong) yang menginisialisasi startTime dengan waktu  saat ini.  V
3) Sebuah metode bernama start() yang me-reset startTime ke waktu saat ini.  V
4) Metode bernama stop() yang menyetel endTime ke waktu saat ini.  V
5) Metode bernama getElapsedTime() yang mengembalikan waktu yang telah berlalu  untuk stopwatch dalam milidetik.  V
Tulis program uji yang mengukur waktu eksekusi pengurutan 100.000 angka menggunakan  selection sort. 
*/
public class StopWatch {
    private long startTime;
    private long endTime;

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }
    
    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
    
    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    
    // konstruktor tanpa argumen
    StopWatch() {
        this.startTime = System.currentTimeMillis();
    }
    
    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }
    
    public double getElapsedTime(){
//        return endTime - startTime;
        return (System.currentTimeMillis() - startTime) / 1000.0;
    }
}