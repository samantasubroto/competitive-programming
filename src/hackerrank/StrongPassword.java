package hackerrank;

public class StrongPassword {
    public static int check(String password){
        String regex_a = "^.*[a-z].*$";
        String regex_A = "^.*[A-Z].*$";
        String regex_1 = "^.*[0-9].*$";
        String regex_sep = "^.*[!@#$%^&*()+-].*$";
        int need_to_add = 0;
        if(!password.matches(regex_a))
            need_to_add++;
        if(!password.matches(regex_A))
            need_to_add++;
        if(!password.matches(regex_1))
            need_to_add++;
        if(!password.matches(regex_sep))
            need_to_add++;
        if(password.length() < 6) {
            if(6 - password.length() > need_to_add)
                return  (6 - password.length());
        }
        return need_to_add;
    }
    public static void main(String[] args){
        System.out.println(check("AUzs-nV"));
    }
}
