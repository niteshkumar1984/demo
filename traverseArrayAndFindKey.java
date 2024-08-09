import java.util.Arrays;

/*
Example 1 –
If the array input 1 is 74 -56 15 71 92 23 and input2 is 6
First array element = 74
Here, KEY = 7
NEXT_ADDRESS – 4
4th array element = 92 (NOTE THAT ARRAY ELEMENT ADDRESS STARTS FROM 0, SO 4th
element is 92)
Here, KEY = 9 NEXT ADDRESS = 2
2nd array element 15
Here, KEY = 1, NEXT ADDRESS = 5
5th array element – 23
Here KEY = 2 NEXT ADDRESS = 3
3rd array element 71
Here, KEY 7, NEXT ADDRESS =1
1st array element =-56
Here, KEY = 5 NEXT ADDRESS -STOP (because we have reached a negative number).
FINAL RESULT = Alternatively Add and Subtract the keys = 7+9-1+ 2-7+5= 15
 */
public class traverseArrayAndFindKey {
    public static void main(String[] args) {
        int input1[]={ 74, -56, 15, 71, 92, 23};
        int input2 = 6;
        int flag=0;

        for(int i:input1){
            if(i<0) {
                flag = 1;
                break;
            }
        }

        int sum=0;

        if(flag==0){
            Arrays.sort(input1);
            sum=input1[0];
        }
        else{
            int key=input1[0]/10;
            int value=input1[0]%10;
            sum+=key;
            int ind=0;

            do{
                key=input1[value]/10;
                value=input1[value]%10;

                if(ind%2 == 0)
                    sum+=key;
                else
                    sum-=key;

                ind++;

            }while(input1[value]>0);

            if(ind%2 == 0)
                sum+=-1*input1[value]/10;
            else
                sum-=-1*input1[value]/10;
        }

        System.out.println(sum);


    }
}
