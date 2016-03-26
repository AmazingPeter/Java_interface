/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package toxml_interface;

/**
 *
 * @author Shvyrov
 */
public class ToXml_interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Product[] toXmlables = new Product[5];

      toXmlables [0] = new Product("Shoes", 20, "Ярославль");
      toXmlables [1] = new Product("Raincoat", 25, "Москва");
      toXmlables [2] = new Product("Shirt", 40, "Владимир");
      toXmlables [3] = new Product("Jacket", 30, "Сочи");
      toXmlables [4] = new Product("Coat", 10, "Краснодар");
      
      GetComparables.sort(toXmlables);
      
      System.out.println("Array contents: ");
      for (ToXmlable t : toXmlables)
         System.out.println(t);
     
      System.out.println();
      System.out.println("Array as XML: ");
      String xml = ArrayToXml.getXml(toXmlables);
      System.out.println(xml);

    }
}
