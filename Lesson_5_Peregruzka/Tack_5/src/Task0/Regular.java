package Task0;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {

    public static boolean test(String testString)
    {
        Pattern p = Pattern.compile("[A-Z]{0,4}");
        Matcher m = p.matcher(testString);
        return m.matches();
    }

    public static boolean test1(String testString)
    {
        Pattern p = Pattern.compile(".{4}");
        Matcher m = p.matcher(testString);
        return m.matches();
    }

}
