import java.util.Arrays;

/*
Input1 – 23792 – From these the smallest number that can be formed is 22.
Input2 – 37221 – From these the smallest number that can be formed is 12.
Input3 – 10270 – From these the smallest number that can be formed is 00.
Input4 – 73391 – From these the smallest number that can be formed is 13.
Input5 – 12005 – From these the smallest number that can be formed is 00.
The second part of our task is to find the sum of all these smallest 2-digit numbers and the result
is 47.
 */
public class findSumeetSum {
    public static void main(String[] args) {
        int input1=23792;
        int input2=37221;
        int input3=10270;
        int input4=73391;
        int input5=12005;

        int arr[]={input1,input2,input3,input4,input5};
        int numArr[]=new int[5];
        int sum=0;

        for (int i=0;i<5;i++){
            char charArr[]=String.valueOf(arr[i]).toCharArray();
            Arrays.sort(charArr);
            numArr[i]=Integer.parseInt(Character.toString(charArr[0])+Character.toString(charArr[1]));
            sum+=numArr[i];
        }

        for (int i:numArr) {
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println(sum);


    }
}
