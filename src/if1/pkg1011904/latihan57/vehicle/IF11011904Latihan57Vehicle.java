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
public class IF11011904Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.setMybrand("Trek Bike");
        bicycle.setMymodel("7.4FX");
        bicycle.setMygearcount((int) 23);
        bicycle.bicycle();
        System.out.println("");
        Skateboard skateboard = new Skateboard();
        skateboard.setMybrand("Ally Skate");
        skateboard.setMymodel("rocket");
        skateboard.setMyboardlength((double)54.5);
        skateboard.skateboard(); 
    }
    
}
