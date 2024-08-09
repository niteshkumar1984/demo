public class AlternateAddSub {
    public static void main(String[] args) {
        int num1=1000;
        int num2=1;
        int sum=0;

        if(num1%2==0){
            if(num2==1)
                sum=even(num1/2) - odd(num1-1);
            else if(num2==2)
                sum=num1 + odd(num1-1) - even((num1-2)/2);
        }
        else{
            if(num2==1)
                sum=odd(num1) - even((num1-1)/2);
            else if(num2==2)
                sum=num1+even((num1-1)/2) - odd(num1-2);
        }

        System.out.println(sum);
    }

    public static int odd(int num){
        return ((num+1)/2)*((num+1)/2);
    }

    public static int even(int num){
        return (num)*(num+1);
    }
}