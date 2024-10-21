import java.util.regex.*;

class Functions {
    public static boolean check_password(String password)
    {
        Pattern p = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9_]{8,}$");
        Matcher check = p.matcher(password);

        return check.matches();
    }
}
