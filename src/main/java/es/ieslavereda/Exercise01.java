package es.ieslavereda;

public class Exercise01 {

    //to be tested with JUnit --> Exercise01Test

    public static int count55(String str) {
        if(str.length() <= 1)
            return 0;
        if(str.startsWith("55"))
            return 1+ count55(str.substring(2));
        return count55(str.substring(1));
    }

    public static int count55itera(String str) {
        int sum = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if(str.substring(i,i+2).equals("55")){
                sum++;
                i++;
            }
        }
        return sum;
    }

    public static int strCount(String str, String sub) {
        if(str.length()<sub.length())
            return 0;
        if(str.substring(0,sub.length()).equals(sub))
            return 1 + strCount(str.substring(sub.length()),sub);
        return strCount(str.substring(1),sub);
    }


    public static int strCountItera(String str, String sub) {
        int sum=0;
        for (int i = 0; i <= str.length()-sub.length(); i++) {
            if(str.substring(i,i+sub.length()).equals(sub)){
                sum++;
                i=i+sub.length()-1;
            }
        }
        return sum;
    }


}