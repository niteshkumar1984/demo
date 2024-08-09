import java.util.Arrays;

public class findKey {
    public static void main(String[] args) {
        int input1=3521;
        int input2=2452;
        int input3=1352;

        int arr[]={input1,input2,input3};
        int sum=0;

        for(int i=0;i<arr.length;i++){
            char ch[]=String.valueOf(arr[i]).toCharArray();
            Arrays.sort(ch);
            sum+=Integer.parseInt(Character.toString(ch[3]))+
                    Integer.parseInt(Character.toString(ch[2]));
        }

        System.out.println(sum);
    }
}
