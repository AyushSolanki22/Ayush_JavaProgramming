//Aap aaram se maximum capcity ke hisaab se apna array bana skte , auur utilise kr skte, 
//not compulsory to fill whole array with data. 
import java.util.*;
public class input_output_update {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc= new Scanner(System.in);
        // int phy;
        // phy = sc.nextInt();
        
        marks[0] = sc.nextInt(); //phy
        marks[1] = sc.nextInt(); //chem
        marks[2] = sc.nextInt(); //math
        System.out.println("phy: "+marks[0]);
        System.out.println("chem: "+marks[1]);
        System.out.println("math: "+marks[2]);

        marks[2]+=5; //Math mark update -- bonus
        System.out.println("math: "+marks[2]);

        float percentage= (marks[0]+marks[1]+marks[2])/3.0f;   //float division only gives float precised values ,,,,, or cast numerator/denominator to float as Casting forces the result to be float before division
        System.out.println("percentage=: "+percentage+"%");

        

        System.out.print("Length of array: "+marks.length);  //array length
    }    
}
