/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package toxml_interface;

/**
 *
 * @author Shvyrov
 */
public class Product implements Comparable, ToXmlable {

   private String name;
   private int year;
   private String city;
   
   public Product(String name, int year,String city) {
      this.name = name;
      this.year = year;
      this.city = city;
   }

   public String toString() {
      return "[Name=" + name + ", Year=" + year + ", City="+ city +"]";
   }

   public String toXmlString() {
      return "<Item>\n"
              + "<Name> " + name + " </Name> \n"
              + "<Year> " + year + " </Year>\n"
              + "<City> " + city + " </City>\n"
              + "</Item>\n";
   }

   public int compareTo(Comparable other) {

      Product otherItem = (Product) other;
      return (year > otherItem.year ? 1 : (year < otherItem.year ? -1 : 0));
   }
}
