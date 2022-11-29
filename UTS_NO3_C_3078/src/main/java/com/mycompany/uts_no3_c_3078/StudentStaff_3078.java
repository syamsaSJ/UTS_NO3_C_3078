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

public class StudentStaff_3078 extends Mahasiswa_3078{
    
    String unitKerja; 
    int jamKerja;
    
    public double totalPendapatan(){
        return (jamKerja * 30000);
    }
    public void tampilDataStudentStaff(){
        super.tampilDataMhs();
        System.out.println("Unit Kerja                     : " + unitKerja);
        System.out.println("Jam Kerja                      : " + jamKerja);
        System.out.println("Total Pendapatan Student Staff : " +totalPendapatan());
    }
    
}
