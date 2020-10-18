
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anggita
 */
public class Mahasiswa {
        
        Scanner input = new Scanner(System.in);
        
        
        String nama,nim,alamat;
        char jawab;
        float uts, uas, nilai;
        int pilih;
        
        void Biodata(){
            
            System.out.print("Masukkan Nama\t : ");
            nama = input.nextLine();
            System.out.print("Masukkan NIM\t : ");
            nim = input.nextLine();
            System.out.print("Masukkan Alamat\t : ");
            alamat = input.nextLine();
            System.out.print("Masukkan Nilai UTS : ");
            uts = input.nextFloat();
            System.out.print("Masukkan Nilai UAS : ");
            uas = input.nextFloat();
        }
        
        void Output(){
            
            System.out.println("Nama\t : " + nama);
            System.out.println("NIM\t : " + nim);
            System.out.println("Alamat\t : " + alamat);
            System.out.println("Nilai\t : " + (uts+uas)/2);
        }
        
        void Edit(){
            
            System.out.println("Edit Data");
            input.nextLine();
            System.out.print("Masukkan Nama\t : ");
            nama = input.nextLine();
            System.out.print("Masukkan NIM\t : ");
            nim = input.nextLine();
            System.out.print("Masukkan Alamat\t : ");
            alamat = input.nextLine();
            System.out.print("Masukkan Nilai UTS : ");
            uts = input.nextFloat();
            System.out.print("Masukkan Nilai UAS : ");
            uas = input.nextFloat();
        }
}
