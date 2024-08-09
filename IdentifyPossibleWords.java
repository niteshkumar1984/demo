import java.util.*;

public class IdentifyPossibleWords {
    public static void main(String[] args) {
        String str1 = "Fi_er";
        String str2 = "Fever:filer:Filter:Fixer:fiber:fibre:tailor:offer";

        String str[] = str2.toUpperCase().split(":");
        int ind = 0;
        for (int i = 0; i < str.length; i++) {
            if (str1.charAt(i) == '_') {
                ind = i;
                break;
            }
        }

        String res ="";

        for (int i = 0; i < str.length; i++) {
            if (str1.toUpperCase().substring(0, ind).equals(str[i].substring(0, ind)) &&
                    str1.toUpperCase().substring(ind+1,str1.length()).equals(str[i].substring(ind + 1, str[i].length()))) {

                if(res.length()>0)
                    res +=":";
                res += str[i];
            }

        }

        System.out.println(res);
    }
}
