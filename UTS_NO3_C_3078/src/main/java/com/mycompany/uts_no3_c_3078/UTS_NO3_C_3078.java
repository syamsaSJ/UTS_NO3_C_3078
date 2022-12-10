/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no3_c_3078;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Syamsa Shahira Julyinda
 * NIM : 21103078
 * KELAS : S1SI-05-C
 */

public class UTS_NO3_C_3078 {

    public static void main(String[] args) {
        
        //Pembuatan objek
        AsistenPraktikum_3078[] ap = new AsistenPraktikum_3078[1];
        StudentStaff_3078[] ss = new StudentStaff_3078[1];
        
        //array
        ap[0] = new AsistenPraktikum_3078();
        ss[0] = new StudentStaff_3078();
        
        //program input menggunakan buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        try {
            System.out.print("\nJumlah Asisten Praktikum : 1");
            System.out.println("\n== INPUT DATA ASISTEN PRAKTIKUM ==");
            for(int i = 0; i < 1; i++){
                System.out.print("NIM               : ");
                ap[i].nim_3078 = br.readLine();
                System.out.print("Nama              : ");
                ap[i].nama_3078 = br.readLine();
                System.out.print("Jurusan           : ");
                ap[i].jurusan_3078 = br.readLine();
                System.out.print("IPK               : ");
                ap[i].ipk_3078 = Integer.parseInt(br.readLine());
                System.out.print("MK Asistensi      : ");
                ap[i].mkAsisten_3078 = br.readLine();
                System.out.print("Jumlah Pertemuan  : ");
                ap[i].jmlPertemuan_3078 = Integer.parseInt(br.readLine());
                System.out.println();
            }

            System.out.println("Jumlah Student Staff     : 1");
            System.out.println("== INPUT DATA STUDENT STAFF ==");
            for(int i = 0; i < 1; i++){
                System.out.print("NIM               : ");
                ss[i].nim_3078 = br.readLine();
                System.out.print("Nama              : ");
                ss[i].nama_3078 = br.readLine();
                System.out.print("Jurusan           : ");
                ss[i].jurusan_3078 = br.readLine();
                System.out.print("IPK               : ");
                ss[i].ipk_3078 = Integer.parseInt(br.readLine());
                System.out.print("Unit Kerja        : ");
                ss[i].unitKerja_3078 = br.readLine();
                System.out.print("Jam Kerja         : ");
                ss[i].jamKerja_3078 = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            System.out.println("=== DATA ASISTEN PRAKTIKUM ===");
            for(AsistenPraktikum_3078 AP : ap){
                AP.tampilDataAsistenPraktikum_3078();
                System.out.println("");
            }
            
            System.out.println("=== DATA STUDENT STAFF ===");
            for(StudentStaff_3078 SS : ss){
                SS.tampilDataStudentStaff_3078();
                System.out.println("");
            }
        } 
        catch (Exception ex){ // menangkap kesalahan
            System.out.println(ex);
        }
    
    }

}