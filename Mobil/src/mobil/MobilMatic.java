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
public class MobilMatic { /** Sebuah class**/
    String noPlat; /** Tipe data String nomor plat mobil **/
    int kecepatan;/** Tipe data integer kecepatan mobil**/
    String perseneleng;/** Tipe data String perseneling mobil **/
    
    public MobilMatic(String noPlat){ /** Sebuah construktor**/
        this.noPlat = noPlat;/** nomor Plat mobil**/
        this.kecepatan = 0; /** nilai awal kecepatan mobil**/
        this.perseneleng = "N";/** posisi awal perseneleng mobil **/
    }
    
    public void setNoPlat(String noPlat) {/** Setter untuk nomor plat**/
        this.noPlat = noPlat;
        
    }
    
    public String getNoPlat(){ /** getter untuk NoPlat**/
        return noPlat; /** mereturn nomor plat dalam bentuk String**/
    }
    
    public void oper(String perseneleng){/** Sebuah method over**/
        if(perseneleng == "D" && kecepatan >= 0 ){ /** Sebuah percabangan saat kecepatan >=0 perseneleng diubah ke D**/
            this.perseneleng = perseneleng;
        }
        else if(perseneleng == "R" && kecepatan <=0){ /** Saat kecepatan <=0 perseneleng diubah ke R **/
            this.perseneleng = perseneleng;
        }
        else{
            System.out.println("perseneleng tidak cocok");
        }
        
        System.out.println("kecepatan : "+getKecepatan()+", Posisi Perseneleng : "+getPerseneleng());/** Print kecepatan dan posisi perseneleng
         dengan menggunakan getter**/
    }
    
    public int getKecepatan(){/** getter untuk kecepatan yang bernilai integer**/
        return kecepatan;
    }
    
    public String getPerseneleng(){ /** Getter untuk perseneleng dalam bentuk String**/
        return perseneleng;
    }
    
    public void gas(){ /** Sebuah method gas **/
        if(perseneleng == "D" ){ 
            this.kecepatan+=1;/** jika perseneleng dalam posisi D, maka kecepatan akan bertambah 1**/
        }
        else if(perseneleng == "R"){
            this.kecepatan-=1;/** Jika perseneleng dalam posisi R, maka kecepatan akan dikurangi 1**/
        }
        System.out.println("kecepatan : "+getKecepatan()+", Posisi Perseneleng : "+getPerseneleng()); /** Sebuah 
         print yang memberitahukan kecepatan dan posisi porseneling saat dengan menggunakan getter**/
    }
    
    public void rem(){ /** Sebuah method rem**/
        if(kecepatan < 0){
            this.kecepatan+=1; /** Jika kecepatan mobil kurang dari nol atau negatif, mobil di rem sehingga kecepatan 
             ditambah satu agar kecepatan menuju 0**/
        }
        else if(kecepatan > 0 ){
            this.kecepatan-=1; /** Saat kendaraan di rem dan kecepatan diatas 0, maka kecepatan dikurangi 1 sehinga kecepatan berkurang**/
        }
        System.out.println("kecepatan : "+getKecepatan()+", Posisi Perseneleng : "+getPerseneleng());
        /** Sebuah print kecepatan dan posisi perseneleng dengan menggunakan getter **/

    }
    
    
    public String toString(){ /**Method String toString **/
        return "kecepatan : "+getKecepatan()+", Posisi Perseneleng : "+getPerseneleng()+ " Plat mobil : "+ getNoPlat();/** menampilkan pinrt kecepatan dan posisi perseneleng
         dengan menggunakan getter**/
    }
}
