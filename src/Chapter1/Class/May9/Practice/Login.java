package Chapter1.Class.May9.Practice;

import java.util.Random;

public class Login {
    public String username;
    private String password = "";

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public Login LoginGenerator(User user)
    {
        this.username = user.getName() + "_" + user.getSurname();
        Random random = new Random();
        int size = random.nextInt(8)+ 10;
        for(int i = 0 ; i < size ; i++)
        {
            this.password += (char) random.nextInt(256);
        }
        return this;
    }


}
