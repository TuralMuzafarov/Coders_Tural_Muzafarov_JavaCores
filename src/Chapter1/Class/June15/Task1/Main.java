package Chapter1.Class.June15.Task1;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //Method 1
//        File file = new File("C:\\Users\\Tural\\Desktop\\demo.txt");
//        System.out.println(file.exists());

        //Method 2
        String parentUrl = "C:\\Users\\Tural\\Desktop";
        File file = new File(parentUrl , "demo.txt");
        System.out.println(file.exists());
//        file.delete();
//        System.out.println(file.exists());
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getName());
//        System.out.println(file.getParent());
//        System.out.println(file.isDirectory());
//        System.out.println(file.lastModified());
//        System.out.println(file.length()); // Retrieve number of the bytes in the file
//        File file1 = new File(parentUrl);
//        for (File _file : file1.listFiles())
//        {
//            System.out.println(_file.getName());
//        }

        File newFile = new File(parentUrl);
        newFile.mkdir();









    }
}
