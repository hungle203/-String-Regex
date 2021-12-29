package thuchanh.account;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {

    private static final String ACCOUNT_REGEX1= "\"^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$\"";
    public AccountExample() {

    }
    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX1);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
