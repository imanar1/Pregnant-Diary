/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttree;

/**
 *
 * @author  Manar
 */
import java.util.LinkedList;
public class Feeling {

/**
 * The idea of ​​this class :
Each node in the tree will have its data of this class and it contains a 
library and a variable of its type String - then the option is available 
to use an object from this class so that the last node in the tree is of the type 
of linked list and above it is string 
 * @author USER
 */
private String NodeName;
LinkedList<String> feelling= new LinkedList<String>();

    public Feeling(String NodeName) {
        this.NodeName = NodeName;
    }
    public String getNodeName() {
        return NodeName;
    }

    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    public LinkedList<String> getFeelling() {
        return feelling;
    }

    public void setFeelling(LinkedList<String> feelling) {
        this.feelling = feelling;
   }
   
    @Override
    public String toString() {
        String s= "{| ";
                for(int i=0;i<feelling.size();i++)
                {s+= feelling.get(i)+" | ";}
               s+="}";
               return s;
    }
  
    

}



