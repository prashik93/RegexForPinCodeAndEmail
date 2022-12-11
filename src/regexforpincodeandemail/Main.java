package regexforpincodeandemail;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Regex!");
        new Main().creatingRegexPattern();
    }

    public void creatingRegexPattern() {
        System.out.println("\nSix digit number for Pin code : " + Pattern.matches("^[0-9]{6}", "400088"));
    }
}