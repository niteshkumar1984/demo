import java.util.*;
public class stringReverse{
    public static void main(String args[]){

        Scanner input=new Scanner (System.in);

        System.out.println("Enter the string");

        String str=input.nextLine();

        char ch;

        String strNew="";

        for(int ind=0;ind<str.length();ind++){
            ch=str.charAt(ind);
            strNew=ch+strNew;
        }

        System.out.println("The new reversed string is "+strNew);

        input.close();

    }
}