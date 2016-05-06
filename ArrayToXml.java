/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package toxml_interface;

/**
 *
 * @author Shvyrov
 */
public class ArrayToXml {
   static String getXml(ToXmlable[] toXML){

      StringBuilder sb = new StringBuilder("<EmployeeObject>\r\n");
      
      for(ToXmlable t : toXML) {
         sb.append(t.toXmlString());         
      }
      
      sb.append("</EmployeeObject>\r\n");
      
      return sb.toString();
   }
}
