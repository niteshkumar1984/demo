import java.util.Scanner;
public class vowelsManupulation {
    public static void main(String args[]) {

    Scanner input=new Scanner(System.in);

    System.out.println("Enter the string ");
    String str=input.next();
    
    //System.out.println(find(str));
    if(find(str)==true)
        System.out.println("The given string contains vowels");
    else
        System.out.println("The given string does not contain vowels");
    input.close();

    System.out.println("The new String after removing vowels is "+remove(str));


}
    //Class to check for vowels
    public static boolean find(String str){
        return str.toLowerCase().matches(".*[aeiou].*");
}

    //Class to remove vowels form string
    public static String remove(String str){
        char ch[]=str.toCharArray();
        String strNew="";
        for(int ind=0;ind<str.length();ind++){

            if(ch[ind]=='A'||ch[ind]=='E'||ch[ind]=='I'||ch[ind]=='O'||ch[ind]=='U'||
             ch[ind]=='a'||ch[ind]=='e'||ch[ind]=='i'||ch[ind]=='o'||ch[ind]=='u' )

                continue;

            strNew=strNew+ch[ind];
        }

        return strNew;
    }
}
    