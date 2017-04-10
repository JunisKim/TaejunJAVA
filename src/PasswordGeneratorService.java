/**
 * Created by danawacomputer on 2017-04-07.
 */
public class PasswordGeneratorService {
    public String makePassword(String targetStr, String prefix, String postfix) {
        int squarelengthOfChar = targetStr.length() * targetStr.length();

        targetStr = targetStr.substring(0,1).toUpperCase() + targetStr.substring(1);

        String passwordGenerated = prefix + squarelengthOfChar + targetStr+ postfix ;

        return passwordGenerated;
    }
}
