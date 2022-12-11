package regexforpincodeandemail;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Regex!");
        new Main().creatingRegexPatternForPinCode();
        new Main().creatingRegexPatternForEmail();
    }

    public void creatingRegexPatternForPinCode() {
        System.out.println("\nSix digit number for Pin code : " + Pattern.matches("^(([0-9]{6})|([0-9]{3}[\s][0-9]{3}))$", "400 088"));
    }

    public void creatingRegexPatternForEmail() {
        System.out.println("\nValidating the first mandatory part : " + Pattern.matches("^[a-z]{3}", "abc"));
    }
}