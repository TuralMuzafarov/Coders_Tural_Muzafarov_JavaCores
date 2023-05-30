package  Chapter1.Class.May13.Practice.Algotihmic;
public class Task5 {
    public static void main(String[] args) {
        String text = "tural muzafarov is at coders!";
        String capitalizedText = capitalizeFirstLetter(text);
        System.out.println("Capitalized Text: " + capitalizedText);
    }

    private static String capitalizeFirstLetter(String text) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                if (capitalizeNext) {
                    result.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    result.append(Character.toLowerCase(c));
                }
            } else {
                result.append(c);

                if (c == ' ' || c == '\t' || c == '\n' || c == '\r') {
                    capitalizeNext = true;
                }
            }
        }

        return result.toString();
    }
}
