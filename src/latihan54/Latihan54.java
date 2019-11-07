/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan54;

/**
 *
 * @author lutfi
 * NAMA : LUTFI RAMADHAN
 * NIM  : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat wk = new WarnaKoordinat(10,4, "Jingga");
        System.out.println("Warna Koordinat "+wk.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+wk.getX()+", y : "+wk.getY());
    }

}
