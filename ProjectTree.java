/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttree;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Manar
 */
public class ProjectTree {

    NodeTree root;
    int size;
    int hight;

    public ProjectTree() {
        this.root = null;
        this.size = 0;
        this.hight = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public NodeTree getRoot() {
        return root;
    }

    public void setRoot(NodeTree root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

// The user can only add her feelings - feelings are of a linked list type, which is a library
    public void add(String data) {
        NodeTree node = choosenode();
        node.getData().feelling.add(data);
    }

//Add - the type of data object - as long as it is true, it will move to the left and vice versa
    public NodeTree add(NodeTree current, Feeling data, boolean left) {
        NodeTree newnode = new NodeTree(data);
        if (left) {
            current.setLeftCh(newnode);
        } else {
            current.setRightChild(newnode);
        }
        return newnode;
    }
//    The options that will show the (which are the nodes in the tree and based on their selection, we will determine the place to add, delete or search)

    public NodeTree choosenode() {
        NodeTree node = root;
        Scanner n = new Scanner(System.in);
        System.out.println("First or second semester ");
        int simister = n.nextInt();
        System.out.println("Start of month or second of month");
        int month = n.nextInt();
        System.out.println("first week or second week");
        int week = n.nextInt();
        if (simister == 1) {
            node = node.getLeftCh();
        } else {
            node = node.getRightChild();
        }
        if (month == 1) {
            node = node.getLeftCh();
        } else {
            node = node.getRightChild();
        }
        if (week == 1) {
            node = node.getLeftCh();
        } else {
            node = node.getRightChild();
        }
        return node;
    }
//    Call the choosenode method and after the user selects his choice, all feelings are displayed in the node and you choose one to delete

    public void Delete() {
        NodeTree node = choosenode();
        System.out.println("Please choose one of the folowing feeling to delete:");
        System.out.println(node.getData().toString());
        System.out.println("Write here what you chose: ");
        Scanner val = new Scanner(System.in);
        String key = val.next();
        node.getData().feelling.remove(key);
    }

// Search for a feeling entered in the linked list
    public void Search(String data) {
        NodeTree choice1 = root.getLeftCh().getLeftCh().getLeftCh();
        NodeTree choice2 = root.getLeftCh().getLeftCh().getRightChild();
        NodeTree choice3 = root.getLeftCh().getRightChild().getLeftCh();
        NodeTree choice4 = root.getLeftCh().getRightChild().getRightChild();

        NodeTree choice5 = root.getRightChild().getLeftCh().getLeftCh();
        NodeTree choice6 = root.getRightChild().getLeftCh().getRightChild();
        NodeTree choice7 = root.getRightChild().getRightChild().getLeftCh();
        NodeTree choice8 = root.getRightChild().getRightChild().getRightChild();
        if (choice1.getData().feelling.contains(data)) {
            System.out.println("your feeling was in first semester,start month,first week");
        } else if (choice2.getData().feelling.contains(data)) {
            System.out.println("your feeling was in first semester,start month,second week");
        } else if (choice3.getData().feelling.contains(data)) {
            System.out.println("your feeling was in first semester,second month,first week");
        } else if (choice4.getData().feelling.contains(data)) {
            System.out.println("your feeling was in first semester,second month,second week");
        } else if (choice5.getData().feelling.contains(data)) {
            System.out.println("your feeling was in second semester,start month,first week");
        } else if (choice6.getData().feelling.contains(data)) {
            System.out.println("your feeling was in second semester,start month,second week");
        } else if (choice7.getData().feelling.contains(data)) {
            System.out.println("your feeling was in second semester,second month,first week");
        } else if (choice8.getData().feelling.contains(data)) {
            System.out.println("your feeling was in second semester,second month,second week");
        } else {
            System.out.println("Sorry, you didn't share these feelings with us,add it if you want. ");
        }
    }
// Call  the choosenode method and after the user selects his choice - Written feelings will be displayed

    public void SearchHappen() {
        NodeTree node = choosenode();
        System.out.println(node.getData().toString());
    }
// print all feeling 

    public void Printfeeling() {
        NodeTree choice1 = root.getLeftCh().getLeftCh().getLeftCh();
        NodeTree choice2 = root.getLeftCh().getLeftCh().getRightChild();
        NodeTree choice3 = root.getLeftCh().getRightChild().getLeftCh();
        NodeTree choice4 = root.getLeftCh().getRightChild().getRightChild();

        NodeTree choice5 = root.getRightChild().getLeftCh().getLeftCh();
        NodeTree choice6 = root.getRightChild().getLeftCh().getRightChild();
        NodeTree choice7 = root.getRightChild().getRightChild().getLeftCh();
        NodeTree choice8 = root.getRightChild().getRightChild().getRightChild();
        System.out.println("Year :" + (getRoot().getData().getNodeName()));
        if (choice1.getData().feelling.size() > 0) {
            System.out.println("in first semester,start month,first week,Your Feelings was: ");
            System.out.println(choice1.getData().toString());
        }
        if (choice2.getData().feelling.size() > 0) {
            System.out.println("your feeling was in first semester,start month,second week");
            System.out.println(choice2.getData().toString());
        }
        if (choice3.getData().feelling.size() > 0) {
            System.out.println("your feeling was in first semester second month first week");
            System.out.println(choice3.getData().toString());
        }
        if (choice4.getData().feelling.size() > 0) {
            System.out.println("your feeling was in first semester,second month,second week");
            System.out.println(choice4.getData().toString());
        }
        if (choice5.getData().feelling.size() > 0) {
            System.out.println("your feeling was in second semester,start month,first week");
            System.out.println(choice5.getData().toString());
        }
        if (choice6.getData().feelling.size() > 0) {

            System.out.println("your feeling was in second semester,start month,second week");
            System.out.println(choice6.getData().toString());
        }

        if (choice7.getData().feelling.size() > 0) {
            System.out.println("your feeling was in second semester,second month,first week");
            System.out.println(choice7.getData().toString());
        }
        if (choice8.getData().feelling.size() > 0) {
            System.out.println("your feeling was in second semester,second month,second week");
            System.out.println(choice8.getData().toString());
        }
    }
}


