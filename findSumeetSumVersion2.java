import java.util.Arrays;

/*      Example-1
        If the 5 input numbers are 23792,37221,10270,73391 and 12005
        The smallest numbers that can be produced using 3 digits from each of these are
        223,122,001,133 and 001 respectively, and the sum of these smallest numbers will be 480.
        Therefore, the expected result is 480
 */

public class findSumeetSumVersion2 {
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
            numArr[i]=Integer.parseInt((Character.toString(charArr[0])+Character.toString(charArr[1])+Character.toString(charArr[2])));
            sum+=numArr[i];
        }

        for (int i:numArr) {
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println(sum);


    }
}
