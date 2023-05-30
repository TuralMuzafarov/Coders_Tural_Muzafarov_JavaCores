package Chapter1.Class.May20.Subfolder;
import java.util.StringJoiner;
public class Main {
    protected static Folder Folders(String str , int start)
    {
        String[] arr = str.split("/");
        if(start == arr.length - 1) return null;
        start = start + 1;
        return new Folder(arr[start] , Folders(str , start));
    }

//    protected  static Folder Folders(String str)
//    {
//        return Folders(str.split("/") , 0);
//    }
    protected  static  Folder Folders(String str)
    {
        return  Folders(str , 0);
    }


    public static void main(String[] args) {
        String str = "/baba/ata/ogul/neve";
        System.out.println(Folders(str));
    }
}
