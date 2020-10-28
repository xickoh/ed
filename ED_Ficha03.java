/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_ficha03;

/**
 *
 * @author franc
 */
public class ED_Ficha03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayStack as = new ArrayStack();

        String s1 = "Elemento 1";
        String s2 = "Elemento 2";
        String s3 = "Elemento 3";
        String s4 = "Elemento 4";
        String s5 = "Elemento 5";

        as.push(s1);
        as.push(s2);
        as.push(s3);
        as.push(s4);
        as.push(s5);

        try {
            System.out.println(as.pop());
            System.out.println(as.peek());
        } catch (EmptyCollectionException ex) {
            System.out.println(ex);
        }

        System.out.println(as.size());
        
        LinkedStack ls = new LinkedStack();

        ls.push(s1);
        ls.push(s2);
        ls.push(s3);
        ls.push(s4);
        ls.push(s5);

        try {
            System.out.println(ls.pop());
            System.out.println(ls.peek());
        } catch (EmptyCollectionException ex) {
            System.out.println(ex);
        }

        System.out.println(ls.size());
        
        
    }

}
