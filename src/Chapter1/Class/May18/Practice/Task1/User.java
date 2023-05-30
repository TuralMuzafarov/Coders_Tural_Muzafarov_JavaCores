package Chapter1.Class.May18.Practice.Task1;
import java.util.regex.Matcher;
import  java.util.regex.Pattern;

public class User {
    private String email;
    private  String password;



    public User(String email , String password)
    {
        this.password = password;
        this.email = email;
        Pattern patternEmail = Pattern.compile("^(.+)@(.+)$");
        Matcher matcher1 = patternEmail.matcher(email);

        Pattern patternPassword = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$");
        Matcher matcher2 = patternPassword.matcher(password);
        if(!matcher1.matches())
        {
            throw new IllegalArgumentException("Email doğru daxil edilməyib");
        }
        if(!matcher2.matches())
        {
            throw new IllegalArgumentException("Şifrə doğru daxil edilməyib");
        }
    }
}
