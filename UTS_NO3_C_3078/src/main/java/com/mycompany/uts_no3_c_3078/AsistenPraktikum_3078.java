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

public class AsistenPraktikum_3078 extends Mahasiswa_3078{
    
    String mkAsisten;
    int jmlPertemuan;
    
    public double totalPendapatan(){
        return(jmlPertemuan * 50000);
    }
    public void tampilDataAsistenPraktikum() {
        super.tampilDataMhs();
        System.out.println("Mata Kuliah                    : " + mkAsisten);
        System.out.println("Jumlah Pertemuan               : " + jmlPertemuan);
        System.out.println("Total Pendapatan               : " + totalPendapatan());
    }
}
