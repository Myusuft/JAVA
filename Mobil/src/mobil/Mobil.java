/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

/**
 *
 * @author MSI
 */
public class Mobil { /** Sebuah class**/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { /** Main method**/
        // TODO code application logic here
        
        MobilMatic mobil1 = new MobilMatic("AB123BA"); /** Input plat nomor mobil dalam bentuk string**/
        
        System.out.println(mobil1);/** Mencetak kecepatan awal, posisi porseneleng dan plat mobil1 diawal **/
        System.out.println("------------"); /** Pembatas**/
        mobil1.oper("R"); /** Mobil1 dioper gigi dari N ke R maka kecepatan berubah menjadi negatif dan posisi poerseneling di R**/
        mobil1.gas(); /** ketika dirunning, kecepatan akan dikurangi 1 dan posisi porseneling di R**/
        mobil1.gas();/** ketika dirunning, kecepatan akan dikurangi 1 dan posisi porseneling di R**/
        mobil1.rem();/** ketika dirunning, kecepatan akan ditambah 1 dan posisi porseneling di R**/
        mobil1.rem();/** ketika dirunning, kecepatan akan ditambah 1 dan posisi porseneling di R**/
        mobil1.oper("D"); /** porseneling mobil dioper dari posisi R ke posisi D, sehingga kecepatan bernilai positif dan posisi porseneling di D**/
        mobil1.gas(); /** ketika dirunning, kecepatan akan ditambah 1 dan posisi porseneling di D**/
        mobil1.rem(); /** ketika dirunning, kecepatan akan dikurangi 1 dan posisi porseneling di D**/
        System.out.println(mobil1);/** mencetak kecepatan dan posisi porseneling mobil1 saat ini**/
        mobil1.setNoPlat("AB111AA");/** mencetak kecepatan, posisi porseneling dan nomor plat mobil yang baru**/
        System.out.println(mobil1); /**mencetak kecepatan, posisi porseneling dan nomor plat mobil yang baru**/
    }
    
}
