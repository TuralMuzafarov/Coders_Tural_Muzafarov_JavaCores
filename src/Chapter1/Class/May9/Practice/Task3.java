package Chapter1.Class.May9.Practice;

public class Task3 {
    public static void main(String[] args) {
        User U = new User("Tural", "Muzafarov" , 35);
        Login login = new Login();
        Login a = login.LoginGenerator(U);
        System.out.println(a.username);
        System.out.println(a.getPassword());
    }
}
