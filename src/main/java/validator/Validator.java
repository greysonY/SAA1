package validator;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 * Created by greyson on 25/3/17.
 */
public class Validator {


    public void checkForNullEmpty(Object obj) {
        if (null == obj) {
            throw new IllegalArgumentException(" cannot be null.");
        }
        if (obj.toString().trim().equals("")) {
            throw new IllegalArgumentException(" cannot be empty.");
        }
    }

    public void checkEmailFormat(String email) {
        String patternString = ".+@.+\\..+";
        Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        boolean matches = matcher.matches();
        if (matches == false) {
            throw new IllegalArgumentException(" illegal email format.");
        }
    }

    public void checkPassword(String password) {
        if (password.trim().length() <= 9 || password.trim().length() >= 13) {
            throw new IllegalArgumentException(" password length must between 10-12 characters. and no empty");
        }
    }

    public void checkUsername(String userName) {
        if (userName.trim().length() <= 4 || userName.trim().length() >= 17) {
            throw new IllegalArgumentException(" username length must between 5-16 characters. and no empty");
        }
    }

    public void checkNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException(" this number can not be negative");
        }
    }
}
