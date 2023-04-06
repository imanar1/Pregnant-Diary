/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttree;

/**
 *
 * @author Manar
 * @param
 */

public class NodeTree  {
   private Feeling data;
    private NodeTree leftCh;
    private NodeTree rightCh;

    public NodeTree(Feeling data) {
        this.data = data;
        this.leftCh= null;
        this.rightCh= null;
    }
    public Feeling getData() {
        return data;
    }

    public void setData(Feeling data) {
        this.data = data;
    }

    public NodeTree getLeftCh() {
        return leftCh;
    }

    public void setLeftCh(NodeTree leftChild) {
        this.leftCh = leftChild;
    }

    public NodeTree getRightChild() {
        return rightCh;
    }

    public void setRightChild(NodeTree rightChild) {
        this.rightCh = rightChild;
    }
  
    
    @Override
    public String toString() {
        if (data == null && (this.getLeftCh() == null  && this.getRightChild() == null)) {
            return "";
        } else {
            return "Node [   "+rightCh.getData()+ " <  " + data + "  > " +leftCh.getData() + "]";
        }
    }
  
    
}




 

