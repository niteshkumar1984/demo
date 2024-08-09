import java.util.Scanner;
public class alternateAddSubKeyAddress {
    public static void main(String args[]) {

    Scanner input=new Scanner(System.in);
    
    int arr[]=new int[1000];
    
    System.out.println("Enter the array element");
    int ind;
    for(ind=0;ind<100 ;ind++){
        arr[ind]=input.nextInt();
        if(ind==arr[ind]){
            //System.out.println(ind +" "+arr[ind]);  
            break;
        }
        
        //System.out.println(ind +" "+arr[ind]);  
    }
  
    int num=arr[ind];
    
    
    int keys[]=new int[num];
    int addresses[]=new int[num];
    ind=0;
    int i=0;
    int j=0;

    do{

        int key=arr[ind]/10;
        int address=arr[ind]%10;
        keys[i++]=key;
        addresses[j++]=address;
        ind=address;

    }while(ind>0);

    /* 
    System.out.println("ADDRESS");
    for(ind=0;ind<addresses.length;ind++){
        System.out.println(addresses[ind]);
    }
    System.out.println("KEYS");
    for(ind=0;ind<keys.length;ind++){
        System.out.println(keys[ind]);
    }
    */
    int sum=0;
    for(ind=0;ind<keys.length;ind++){
        
        
        if(ind==0)
            sum+=Math.abs(keys[ind]);
        if(addresses[ind]<0)
            break;
        if(ind%2==0)
            sum-=Math.abs(keys[ind]);
        else
            sum+=Math.abs(keys[ind]);
        
        System.out.println("KEYS "+keys[ind]);
        System.out.println("SUM "+sum);
    }

    System.out.println("The final result is "+sum);
    
    
    input.close();
}
}