package UsingRegex;

public class usingSplit {
    public static void main(String[] args) {

        String s = "One,Two;Three|Four\tFive";
        String regex = "[,;|\\t]";
        String strings[] = s.split(regex);
        for (String word : strings)
            System.out.println(word);
    }
}
