/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmodul5_kel38;
import java.util.Scanner;
/**
 *
 * @author Kukuh
 */
public class TugasModul5_Kel38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int materi;
       System.out.println("----------------------------");
       System.out.println("|PROGRAM BELAJAR MENGHITUNG|"); 
       System.out.println("----------------------------");
       System.out.print("Masukkan Namamu : ");
       String nama = input.next();
       System.out.print("Masukkan Usia :");
       int usia=input.nextInt();
       System.out.println("Hai "+nama);
       System.out.println("Ayo belajar menghitung bareng:3");
       System.out.println("Berikut ini adalah materinya");
       System.out.println("\b");
       System.out.println("1. Penjumlahan (+)");
       System.out.println("2. Pengurangan (-)");
       System.out.println("3. Perkalian (x)");
       System.out.println("4. Pembagian (/)");//apa itu pembagian?
       System.out.print("Silahkan masukkan nomernya (1-4): ");
       materi = input.nextInt();
       switch (materi){
            case 1:
                Penjumlahan objec = new Penjumlahan();
                 objec.penjumlahan();  
                return;    
            case 2:
                Pengurangan obyek = new Pengurangan();
                obyek.pengurangan();
                return;
            case 3:
                Perkalian obyec = new Perkalian();
                obyec.perkalian();
                return;
            case 4:
                Pembagian object = new Pembagian();
                object.pembagian();
                return;
            default:
                System.out.println("Dikarenakan anda tidak membaca instruksi dengan baik maka mohon maaf program berhenti disini :(");
                break;
        }        
    }
}
