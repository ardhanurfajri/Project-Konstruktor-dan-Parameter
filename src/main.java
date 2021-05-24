/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ardha Nur Fajri
 */
public class main {
    int p;
    int l;
    void main(int p,int l){
        this.p=p;
        this.l=l;
    }
    int persegiPanjang(){
        int luas=p*l;
        System.out.println("luas persegi panjang: "+luas);
        return luas;
    }
    public static void main(String[]args){
        main program=new main();
        program.main(3,5);
        program.persegiPanjang();
        
    }
}
