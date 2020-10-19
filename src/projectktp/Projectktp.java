/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectktp;
import java.util.Scanner;
/**
 *
 * @author MOKLET1
 */
public class Projectktp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        System.out.println("          PROVINSI JAWA TIMUR          ");
        System.out.println("-------------KOTA JOMBANG-------------");
        
        Scanner input = new Scanner(System.in);
        
        String nik,nama,ttl,gender,agama,alamat,rtrw,desa,kecamatan,darah,kawin,
                pekerjaan,kewarganegaraan,berlaku;
        String[] data = {"NIK : ","Nama :","Tempat/Tgl Lahir :","Jenis Kelammin :","Gol Darah :",
            "Alamat :","    RT/RW :","    Kel/Desa :","    Kecamatan :","Agama :","Status Perkawinan :",
            "Pekerjaan :","Kewarganegaraan :","Berlaku Hingga : SEUMUR HIDUP"};
        
        System.out.print(data[0]);
        nik = input.nextLine();
        
        System.out.print(data[1]);
        nama = input.nextLine();
        
        System.out.print(data[2]);
        ttl = input.nextLine();
        
        System.out.print(data[3]);
        gender = input.nextLine();
        
        System.out.print(data[4]);
        darah = input.nextLine();
        
        System.out.print(data[5]);
        alamat = input.nextLine();
        
        System.out.print(data[6]);
        rtrw = input.nextLine();
        
        System.out.print(data[7]);
        desa = input.nextLine();
        
        System.out.print(data[8]);
        kecamatan = input.nextLine();

        System.out.print(data[9]);
        agama = input.nextLine();
        
        System.out.print(data[10]);
        kawin = input.nextLine();
        
        System.out.print(data[11]);
        pekerjaan = input.nextLine();
        
        System.out.print(data[12]);
        kewarganegaraan = input.nextLine();
        
        System.out.println(data[13]);
       
        
        
    }
    
    
}
