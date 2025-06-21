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
public class penjualan {
    
    private String idpenjualan;
    private int nopenjualan;
    private String iduser;
    private int total;
    private int bayar;
    
    public penjualan () {
    }
    
    public penjualan (String idpenjualan){
        this.idpenjualan=idpenjualan;
    }
    
    public penjualan (String Idpenjualan, int nopenjualan){
        this.idpenjualan=idpenjualan;
        this.nopenjualan=nopenjualan;
    }
    
    public penjualan (String Idpenjualan, int nopenjualan, String iduser){
        this.idpenjualan=idpenjualan;
        this.nopenjualan=nopenjualan;
        this.iduser=iduser;
    }
    
    public penjualan (String Idpenjualan, int nopenjualan, String iduser, int total){
        this.idpenjualan=idpenjualan;
        this.nopenjualan=nopenjualan;
        this.iduser=iduser;
        this.total=total;
    }
    
    public penjualan (String Idpenjualan, int nopenjualan, String iduser, int total, int bayar){
        this.idpenjualan=idpenjualan;
        this.nopenjualan=nopenjualan;
        this.iduser=iduser;
        this.total=total;
        this.bayar=bayar;
    }
    
    public void setIdPenjualan(String idpenjualan){
        if (idpenjualan.equals("")){
            JOptionPane.showMessageDialog(null, "ID Penjualan Belum Diisi");
        }else{
        this.idpenjualan=idpenjualan;
        }
    }
    
    public String getIdpenjualan(){
        return this.idpenjualan;
    }
    
    public void setNoPenjualan(int nopenjualan){
        this.nopenjualan=nopenjualan;
    }
    
    public int getNoPenjualan(){
        return this.nopenjualan;
    }
    
    public void setIdUser(String iduser){
        this.iduser=iduser;
    }
    
    public String getIdUser(){
        return this.iduser;
    }
    
    public void setTotal (int total){
        this.total=total;
    }
    
    public int getTotal(){
        return this.total;
    }
    
    public void setBayar (int bayar){
        this.bayar=bayar;
    }
    
    public int getBayar(){
        return this.bayar;
    }
    
    public void infoSale(){
        String sale = "ID Bayar :"+getIdpenjualan()+
                     "\n No Pembayaran :"+getNoPenjualan()+
                     "\n ID User"+getIdUser()+
                     "\n Total :"+getTotal()+
                     "\n Bayar :"+getBayar();
        JOptionPane.showMessageDialog(null, sale);
    }
}
