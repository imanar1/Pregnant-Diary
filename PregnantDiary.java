/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttree;

import java.util.Scanner;

/**
 *
 * @author Manar
 */
public class PregnantDiary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
  
        ProjectTree allfeeling = new ProjectTree();
        allfeeling.root = new NodeTree(new Feeling("2022"));
        
        NodeTree firstsem = allfeeling.add(allfeeling.root, new Feeling("first Simester"), true);
        NodeTree secsem = allfeeling.add(allfeeling.root, new Feeling("second Simester"), false);
        
        NodeTree fmonth = allfeeling.add(firstsem, new Feeling("first month"), true);
        NodeTree lmonth = allfeeling.add(firstsem, new Feeling("second month"), false);
        
        NodeTree fwee = allfeeling.add(fmonth, new Feeling("first week"), true);
        NodeTree sweek = allfeeling.add(fmonth, new Feeling("second week"), false);
        NodeTree thirdweek = allfeeling.add(lmonth, new Feeling("third week"), true);
        NodeTree foweek = allfeeling.add(lmonth, new Feeling("forth week "), false);

        
        NodeTree fmonth2 = allfeeling.add(secsem, new Feeling("first month"), true);
        NodeTree lmonth2 = allfeeling.add(secsem, new Feeling("second month"), false);
        NodeTree fweek2 = allfeeling.add(fmonth2, new Feeling("first week"), true);
        NodeTree sweek2 = allfeeling.add(fmonth2, new Feeling("second week"), false);
        NodeTree thirdweek2 = allfeeling.add(lmonth2, new Feeling("third week"), true);
        NodeTree foweek2 = allfeeling.add(lmonth2, new Feeling("forth week "), false);
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the pregnant diary,Great MOMs! \nHere you can express yourself, your feelings and more...\nHave fun in these special moments :) ");
        System.out.println("----------------------------------------------");
        int ch = 0;
        while (ch != 15) {
            System.out.println("- please choose a number");
            System.out.println("1.Add Feeling\n"
                    + "2.Delete Feeling\n"
                    + "3.Find specific Feeling \n"
                    +"4.Find feeling specific happen\n"
                    + "5.Print all Feeling\n"
                    + "6.Exit");
            ch = scan.nextInt();
            scan.nextLine();
            switch (ch) {
                case 1:
                    System.out.println("Tell us your Feeling here:  ");
                    String er = scan.nextLine();
                     System.out.println("-------------- We'll be glad if you enter your choices with numbers-------------");
                    allfeeling.add(er);
                    System.out.println("We are glad you chose us to share your wonderful feelings <3 ");
                    break;
                case 2:
                    allfeeling.Delete();
                    break;
                case 3:
                    System.out.println("Write the Feeling you wanna find here: ");
                    String er2 = scan.nextLine();
                     System.out.println("-------------- We'll be glad if you enter your choices with numbers-------------");
                  allfeeling.Search(er2);
                    break;
                case 4:
                   allfeeling.SearchHappen();
                    break;
                     case 5:
                    allfeeling.Printfeeling();
                    break;
                case 6:
                     System.out.println("Thank you for choosing us,you will be the graetest mom ever.");
                    System.exit(0);
                    break;
                   

            } // switch
        } // while
    }
}


