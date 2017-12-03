package day8_matchsticks;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("Duplicates")
public class Part1 {
    private static final String input = "aaa\"aaa";
    private static final Pattern chars = Pattern.compile("\\w");
    private static final Pattern slashes = Pattern.compile("\\\\");
    private static final Pattern quotes = Pattern.compile("\\\"");
    private static final Pattern hexidecimal = Pattern.compile("\\\\x\\w{2}");

    public static void main(String[] args) {
        System.out.println(getCodeLength(input));
    }

    private static Integer getCodeLength(String str) {
        Integer codeLength = 0;
        Matcher charsM = chars.matcher(str);
        Matcher slashesM = slashes.matcher(str);
        Matcher quotesM = quotes.matcher(str);
        Matcher hexidecimalM = hexidecimal.matcher(str);

        while (charsM.find()) codeLength += 1;
        while (slashesM.find()) codeLength += 2;
        while (quotesM.find()) codeLength += 2;
        while (hexidecimalM.find()) codeLength += 4;

        return codeLength + 2;
    }

    private static Integer getMemLength(String str) {
        Integer memLength = 0;
        Matcher charsM = chars.matcher(str);
        Matcher slashesM = slashes.matcher(str);
        Matcher quotesM = quotes.matcher(str);
        Matcher hexidecimalM = hexidecimal.matcher(str);

        while (charsM.find()) memLength += 1;
        while (slashesM.find()) memLength += 1;
        while (quotesM.find()) memLength += 1;
        while (hexidecimalM.find()) memLength += 1;

        return memLength;
    }
}
