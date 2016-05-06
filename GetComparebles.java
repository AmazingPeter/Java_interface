/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package toxml_interface;

/**
 *
 * @author Shvyrov
 */
class GetComparables {
   public static void sort(Comparable[] elems) {
        for(int i = 1;i < elems.length;i++){
            int j = i;
            while((j>=1)&&(elems[i].compareTo(elems[j-1]) != 1))
                j--;

            if(i != j){
                Comparable elemi = elems[i];
                for (int k = i; k >= j+1; k--)
                    elems[k] = elems[k - 1];

                elems[j] = elemi;
            }
        }
    }
}
