/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.uts_no3_c_3078;

/**
 * @author Syamsa Shahira Julyinda
 * NIM : 21103078
 * KELAS : S1SI-05-C
 */

public class StudentStaff_3078 extends Mahasiswa_3078 implements iPendapatan{
    
    //Atribut
    String unitKerja_3078; 
    int jamKerja_3078;
    
    //Method totalPendapatan
    public double totalPendapatan_3078(){
        return (jamKerja_3078 * 30000);
    }
    
    //Method tampil
    public void tampilDataStudentStaff_3078(){
        super.tampilDataMhs_3078();
        System.out.println("Unit Kerja        : " + unitKerja_3078);
        System.out.println("Jam Kerja         : " + jamKerja_3078);
        System.out.println("-------------------------------------");
        System.out.println("Total Pendapatan  : Rp. " + totalPendapatan_3078());
    }
    
}