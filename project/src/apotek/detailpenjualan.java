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
public class detailpenjualan {
    
    int iddetailpenjualan;
    String idobat;
    String idpenjualan;
    int jumlahjual;
    
    public detailpenjualan() {
        
    }
    
    public detailpenjualan (int iddetailpenjualan) {
        this.iddetailpenjualan=iddetailpenjualan;
    }
    
    public detailpenjualan (int iddetailpenjualan, String idobat) {
        this.iddetailpenjualan=iddetailpenjualan;
        this.idobat=idobat;
    }
    
    public detailpenjualan (int iddetailpenjualan, String idobat, String idpenjualan) {
        this.iddetailpenjualan=iddetailpenjualan;
        this.idobat=idobat;
        this.idpenjualan=idpenjualan;
    }
    
    public detailpenjualan (int iddetailpenjualan, String idobat, String idpenjualan, int jumlahjual) {
        this.iddetailpenjualan=iddetailpenjualan;
        this.idobat=idobat;
        this.idpenjualan=idpenjualan;
        this.jumlahjual=jumlahjual;
    }
    
    public void setIdDetailPenjualan (int iddetailpenjualan){
        this.iddetailpenjualan=iddetailpenjualan;
    }
    
    public int getIdDetailPenjualan () {
        return this.iddetailpenjualan;
    }
    
    public void setIdObat (String idobat){
        this.idobat=idobat;
    }
    
    public String getIdObat (){
        return this.idobat;
    }
    
    public void setIdPenjualan (String idpenjualan){
        this.idpenjualan=idpenjualan;
    }
    
    public String getIdPenjualan (){
        return this.idpenjualan;
    }
    
    public void setJumlahJual (int jumlahjual){
        this.jumlahjual=jumlahjual;
    }
    
    public int getJumlahJual () {
        return this.jumlahjual;
    }
    
    public void infodp(){
        String dp = "ID Detail Penjualan :"+getIdDetailPenjualan()+"\n ID Obat"
                +getIdObat()+"\n ID Penjualan :"+getIdPenjualan()+"\n Jumlah Jual :"
                +getJumlahJual();
        JOptionPane.showMessageDialog(null, dp);
    }
}
