import java.util.Arrays;
import java.util.Scanner;
public class largestTwoNoAdd {
    public static void main(String args[]) {

    Scanner input=new Scanner(System.in);
    
    int num1,num2,num3;

    System.out.println("Enter the three numbers");
    num1=input.nextInt();
    num2=input.nextInt();
    num3=input.nextInt();

    int numArr1[]=new int[4];
    int numArr2[]=new int[4];
    int numArr3[]=new int[4];

    for(int ind=0;ind<4;ind++,num1/=10,num2/=10,num3/=10){
        numArr1[ind]=num1%10;
        numArr2[ind]=num2%10;
        numArr3[ind]=num3%10;
    }
    Arrays.sort(numArr1);
    Arrays.sort(numArr2);
    Arrays.sort(numArr3);
    
    int sum=0;
    for(int ind=3;ind>=2;ind--){
        sum=sum+(numArr1[ind]+numArr2[ind]+numArr3[ind]);

        //System.out.println(numArr1[ind]+" "+numArr2[ind]+" "+numArr3[ind]);
    }
    System.out.println(sum);
    input.close();
}
}