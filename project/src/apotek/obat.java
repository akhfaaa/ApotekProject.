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
public class obat {
    
    private String idobat;
    private String namaobat;
    private String idkatagori;
    private int stok;
    private int hargabeli;
    private int presentasejual;
    private int hargajual;
    
    public obat(){}
    
    public obat(String idobat){
        this.idobat=idobat;
    }
    
    public obat(String idobat, String namaobat){
        this.idobat=idobat;
        this.namaobat=namaobat;
    }

    public obat(String idobat, String namaobat, String idkatagori){
        this.idobat=idobat;
        this.namaobat=namaobat;
        this.idkatagori=idkatagori;
    }
    
    public obat(String idobat, String namaobat, String idkatagori,int stok){
        this.idobat=idobat;
        this.namaobat=namaobat;
        this.idkatagori=idkatagori;
        this.stok=stok;
    }
    
    public obat(String idobat, String namaobat, String idkatagori,int stok, int hargabeli){
        this.idobat=idobat;
        this.namaobat=namaobat;
        this.idkatagori=idkatagori;
        this.stok=stok;
        this.hargabeli=hargabeli;
    }
    
    public obat(String idobat, String namaobat, String idkatagori,int stok, int hargabeli,int presentasejual){
        this.idobat=idobat;
        this.namaobat=namaobat;
        this.idkatagori=idkatagori;
        this.stok=stok;
        this.hargabeli=hargabeli;
        this.presentasejual=presentasejual;
    }
    
    public obat(String idobat, String namaobat, String idkatagori,int stok, int hargabeli,int presentasejual,int hargajual){
        this.idobat=idobat;
        this.namaobat=namaobat;
        this.idkatagori=idkatagori;
        this.stok=stok;
        this.hargabeli=hargabeli;
        this.presentasejual=presentasejual;
        this.hargajual=hargajual;
    }
    
    public void setIdObat (String idobat){
        if(idobat.equals("")){
            JOptionPane.showMessageDialog(null, "ID Obat Belum Diisi");
        }else{
         this.idobat=idobat;   
        }
    }
    
    public String getIdObat (){
        return this.idobat;
    }


    public void setNamaObat (String namaobat){
        this.namaobat=namaobat;
    }
    
    public String getNamaObat (){
        return this.namaobat;
    }
    
    public void setIdKatagori (String idkatagori){
        this.idkatagori=idkatagori;
    }
    
    public String getIdKatagori (){
        return this.idkatagori;
    }
    
    public void setStok (int stok){
        this.stok=stok;
    }
    
    public int getStok (){
        return this.stok;
    }
    
    public void setHargaBeli (int hargabeli){
        this.hargabeli=hargabeli;
    }
    
    public int getHargaBeli (){
        return this.hargabeli;
    }
    
    public void setPresentaseJual (int presentasejual){
        this.presentasejual=presentasejual;
    }
    
    public int getPresentaseJual (){
        return this.presentasejual;
    }
    
    public void setHargaJual (int hargajual){
        this.hargajual=hargajual;
    }
    
    public int getHargaJual (){
        return this.hargajual;
    }
    
    public void infoObat(){
        String medicine = "ID Obat :"+getIdObat()+
                          "\nNama Obat :"+getNamaObat()+
                          "\nID Katagori :"+getIdKatagori()+
                          "\nStok :"+getStok()+ 
                          "\nHarga Beli :"+getHargaBeli()+
                          "\nPresentase Jual :"+getPresentaseJual()+
                          "\n Harga Jual :"+getHargaJual();
        JOptionPane.showMessageDialog(null, medicine);
    }
}