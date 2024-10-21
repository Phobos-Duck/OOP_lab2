import java.util.regex.*;

class Functions {
    public static double check_password(String password)
    {
        Pattern p1 = Pattern.compile("([a-z]+)");
        Pattern p2 = Pattern.compile("([A-Z]+)");
        Pattern p3 = Pattern.compile("([0-9]+)");
        Matcher check = p1.matcher(password);

        if (check.find())
        {
            return 1;
        }
        else{
            return 0;
        }
    }
}
