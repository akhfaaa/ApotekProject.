/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apotek;

/**
 *
 * @author USER
 */
public class kategori {
    
    String idkategori;
    String namakategori;
    
    public kategori (){
        
    }
    
    public kategori (String idkategori){
        this.idkategori=idkategori;
    }
    
    public kategori (String idkategori, String namakategori){
        this.idkategori=idkategori;
        this.namakategori=namakategori;
    }
    
    public void setIdKategori (String idkategori){
        this.idkategori=idkategori;
    }
    
    public String getIdKategori (){
        return this.idkategori;
    }
    
    public void setNamaKategori (String namakategori){
        this.idkategori=idkategori;
    }
    
    public String getNamaKategori (){
        return this.namakategori;
    }
}
