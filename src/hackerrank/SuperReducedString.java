package hackerrank;

public class SuperReducedString {
    public static String function(String s){
        StringBuilder sb = new StringBuilder(s);
        int count = 1;
        while(count!=0){
            count = 0;
            for(int j=0;j<sb.length();j++){
                if(sb.charAt(j) == sb.charAt(++j)){
                    j--;
                    sb.deleteCharAt(j);
                    sb.deleteCharAt(j);
                    count++;
                    break;
                }
                j--;
            }
            if(count == 0)
                return sb.length() > 0 ? sb.toString() : "Empty String";
        }
        return sb.length() > 0 ? sb.toString() : "Empty String";
    }
    public static void main(String[] args){
        System.out.println(function("baab"));
    }
}
