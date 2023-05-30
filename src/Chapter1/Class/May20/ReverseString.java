package Chapter1.Class.May20;

public class ReverseString {
    protected static StringBuilder reverseString(String str , StringBuilder newString , int size)
    {
        if(size == 0) return  newString;
        size = size - 1;
        newString.append(str.charAt(size));
        return reverseString(str , newString , size);
    }

    public static void main(String[] args) {
        String str = "Tural";
        StringBuilder str1 = new StringBuilder();
        System.out.println(reverseString(str ,str1 ,str.length()));
    }

}
