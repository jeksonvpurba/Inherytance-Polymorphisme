/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author jekson viktory purba
 */
public class mulai {
    static void test(binatang x){
        x.makan();
        x.tidur();
    }
    public static void main(String[] args) {

        gajah g=new gajah();
        kerbau k=new kerbau();
        binatang b=new binatang();
        test(k);

        
        binatang [] bin={new kerbau(),new gajah()};
        test(bin[0]);
        test(bin[1]);
        
        
        binatang g=new gajah();
        ((gajah)g).makan();
        
    }
}
