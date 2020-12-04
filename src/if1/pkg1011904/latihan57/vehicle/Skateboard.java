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
public class Skateboard extends Vehicle {
    private double myboardlength;

    public void skateboard() {
        System.out.println("Skateboard");
        System.out.println("Brand : "+getMybrand());
        System.out.println("Model : "+getMymodel());
        System.out.println("Panjangnya Board : "+myboardlength);
    }

    public double getMyboardlength() {
        return myboardlength;
    }

    public void setMyboardlength(double myboardlength) {
        this.myboardlength = myboardlength;
    } 
}
