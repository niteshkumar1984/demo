import java.util.Scanner;
public class reverseNumber {
    public static void main(String args[]) {

    Scanner input=new Scanner(System.in);
    
    System.out.println("Enter the no to be reversed");
    int num=input.nextInt();
    int tempNum=num;
    int newNum=0;
    
    while(tempNum!=0){
        int remainder=tempNum%10;
        newNum=newNum*10+remainder;
        tempNum=tempNum/10;
    }
    System.out.println("The reversed no is "+newNum);
    
    input.close();
}
}