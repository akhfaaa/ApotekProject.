/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apotek;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class kategori {
    
    private String idkategori;
    private String namakategori;
    
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
        if (idkategori.equals("")) {
            JOptionPane.showMessageDialog(null, "ID Kategori Belum Diisi");
        }else{
        this.idkategori=idkategori;
        }
    }
    
    public String getIdKategori (){
        return this.idkategori;
    }
    
    public void setNamaKategori (String namakategori){
        this.namakategori=namakategori;
    }
    
    public String getNamaKategori (){
        return this.namakategori;
    }
    
    public void infoKategori(){
        String kategori = "ID Kategori :"+getIdKategori()+
                          "\nNama Kategori :"+getNamaKategori();
        JOptionPane.showMessageDialog(null, kategori);
    }
}
