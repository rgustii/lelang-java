/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lelangbarang2;

import java.util.ArrayList;

/**
 *
 * @author rafig
 */
public class barang {
    private ArrayList<Integer> idMasyarakat = new ArrayList<Integer>();
    private ArrayList<String> namabarang = new ArrayList<String>();
    private ArrayList<Integer> hargaawal = new ArrayList<Integer>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();
    main m = new main();
    
    public barang(){
        this.namabarang.add(" 0. gerobak ducati ");
        this.hargaawal.add(200000);
        this.status.add(true);
        
        this.namabarang.add(" 1. ban cacing ");
        this.hargaawal.add(500000);
        this.status.add(true);
        
    }
    
    public void setIdMasyarakat(int IdMasyarakat){
        this.idMasyarakat.add(IdMasyarakat);
    }
}
