/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flattenarray;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASammour
 */
public class Controller {
    
    /*
        This method will convert the array passed in the parameters
        to a single list, and then print it.
    */
    public static void flattnArray (int [][] array){
        List l = new ArrayList ();
        for (int[] multi1 : array) {
            for (int c = 0; c < multi1.length; c++) {
                l.add(multi1[c]);
            }
        }
        System.out.println(l);
    }
}
