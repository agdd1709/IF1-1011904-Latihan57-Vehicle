/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg1011904.latihan57.vehicle;

/**
 *
 * @author User
 * Nama : Agus Deri Dermawan
 * NIM  : 10119040
 * Kelas: IF1
 * program ini berisi program menenampilkan inputan bicycle, skatebord
 * dengan metode pendekatan berbasis objek
 */
public class Bicycle extends Vehicle {
    private int mygearcount;

    public void bicycle() {
        System.out.println("Bicycle");
        System.out.println("Brand : "+getMybrand());
        System.out.println("Model : "+getMymodel());
        System.out.println("Jumlah Gear : "+mygearcount);
    }

    public int getMygearcount() {
        
        return mygearcount;
    }

    public void setMygearcount(int mygearcount) {
        this.mygearcount = mygearcount;
    }
}
