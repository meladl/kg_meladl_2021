
import java.util.Arrays;

//Author: Mohamed Eladl
//Main Class
//ONE TO ONE MATCHING PROJECT
//Date: March 13, 2020 

public class Main {

    public static void main(String[] args){

        
        System.out.println("\n[+] Author: Mohamed Eladl \n\n[+]One To One Mapping of Two String Objects Program");

        OneToOneMatching string1 = new OneToOneMatching(args[0]);// OBJECT INITIALIZATION AND CALL TO CONSTRUCTOR
        OneToOneMatching string2 = new OneToOneMatching(args[1]);// OBJECT INITIALIZATION AND CALL TO CONSTRUCTOR

        System.out.println("\nResult is: " + string1.stringOneToOne(string2));// PRINTING RESULTS AND METHOD CALLING 

    }
}
     
     

//End of Program
