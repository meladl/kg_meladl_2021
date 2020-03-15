//AUTHOR: MOHAMED ELADL
//ONE TO ONE MATCHING PROJECT
//Date: March 13, 2020 

import java.util.Arrays; 

public class OneToOneMatching {

    private String input; //INSTANCE VARIABLE DECLARATION
    private final int MAXSIZE = 256; // MAXIMUM STRING VALUE

    public OneToOneMatching(String value){ //CLASS CONSTRUCTOR 
        input = value; //INSTANCE VARIABLE INITIALIZATION
    }// CONSTRUCTOR END

    public boolean stringOneToOne (OneToOneMatching input2){

        int string1Size = this.input.length(); //INITIALIZATION OF STRING1 SIZE VARIABLE  
        int string2Size = input2.input.length(); //  INITIALIZATION OF STRING2 SIZE VARIABLE 
        Boolean[] visited = new Boolean[MAXSIZE]; // INITIALIZATION OF BOOLEAN ARRAY OBJECT FOR VISITED CHARACTERS IN STRING2
        Arrays.fill(visited, Boolean.FALSE); //  FILLING VISITED CHARACTER ARRAY WITH FALSE AS DEFAULT
        int[] mapping = new int[MAXSIZE]; //  INITIALIZATION OF INTEGER ARRAY OBJECT FOR EVERY CHARACTER LOCATION FROM STRING1 TO THAT OF STRING2
        Arrays.fill(mapping, -1); // FILLING MAPPING OF CHARACTERS ARRAY WITH -1 AS DEFAULT

        // RETURN FALSE IF BOTH STRING ARE NOT SAME SIZE
        if( string1Size != string2Size){ 
            return false;
        } 

        // FOR LOOP TO PROCESS EACH CHARACTER 
        for(int i = 0; i < string2Size; i++){ 

            // CHECKS IF THE CHARACTER IN STRING1 IS NOT VISITED BEFORE
            if(mapping[this.input.charAt(i)]== -1){ 

                /*
                RETURN FALSE IF THE CHARACTER IN STRING2 WAS VISITED  BEFORE 
                BECAUSE ONE TO ONE MAPPING IS NOT POSSIBLE
                 */
                if(visited[input2.input.charAt(i)] == true){ 
                    return false;
                }
                visited[input2.input.charAt(i)] = true; //MARK CURRENT CHARACTER OF STRING2 AS VISITED 
                mapping[this.input.charAt(i)] = input2.input.charAt(i); // STORE MAPPING OF CURRENT CHARACTERS
            }   

            /*
            RETURN FALSE IF THIS IS NOT FIRST VISIT OF CURRENT CHARACTER IN STRING1, 
            THEN CHECK IF PAST VISITS WERE MAPPED TO SAME CHARACTER OF STRING2
             */
            else if(mapping[this.input.charAt(i)] != input2.input.charAt(i)){
                return false;
            }  
        } //FOR LOOP END
        return true;
    }  // MAPPING METHOD END

}// CLASS END