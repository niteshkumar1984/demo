public class encodeTwoStrings {
    public static void main(String[] args) {
        String input1="MACHINE";
        String input2="LEARNING";
        String res="";

        res=input2.substring(0,input2.length()/3) +
            input1.substring(0,input1.length()/3) +
            input1.substring(input1.length()-input1.length()/3)+
            input2.substring(input2.length()-input2.length()/3);

        System.out.println(res);
    }
}
