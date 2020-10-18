
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
public class Main {
    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();
        
        
        
        String nama,nim,alamat;
        char jawab;
        float uts, uas, nilai;
        int pilih;
        
        mhs.Biodata();
        
        
        do
        {
            System.out.println("Menu");
            System.out.println("1. Lihat Detail Data");
            System.out.println("2. Edit Data");
            System.out.print("Masukkan Pilihan : ");
            pilih = input.nextInt();
            
            switch(pilih){
                case 1 :
                    mhs.Output();
                break;
                case 2 :
                    mhs.Edit();
                break;
            }
            
            System.out.print("Ingin kembali ke menu?");
            jawab = input.next().charAt(0);
        } while (jawab == 'y');
           
    }
    
}
