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

public class AsistenPraktikum_3078 extends Mahasiswa_3078 implements iPendapatan{
    
    //Atribut
    String mkAsisten_3078;
    int jmlPertemuan_3078;
    
    //Method totalPendapatan
    public double totalPendapatan_3078(){
        return(jmlPertemuan_3078 * 50000);
    }
    
    //Method tampil
    public void tampilDataAsistenPraktikum_3078() {
        super.tampilDataMhs_3078();
        System.out.println("MK Asistensi      : " + mkAsisten_3078);
        System.out.println("Jumlah Pertemuan  : " + jmlPertemuan_3078);
        System.out.println("-------------------------------------");
        System.out.println("Total Pendapatan  : Rp. " + totalPendapatan_3078());
    }
    
}
