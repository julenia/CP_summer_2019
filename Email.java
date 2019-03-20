public class Email {
    public static void main(String[] args) {
        String email ="julia.jankowska@onet.eu";
        System.out.println("The email address is "+email);
        if (!email.contains("@"))System.out.println("The email address is invalid - no @ sign");
        else{
            if (email.indexOf('.')==-1)System.out.println("The email address is invalid - no . sign");
            else{
                if (email.length()<6) System.out.println("The email address is invalid - too short");
                else{
                    if (Character.getNumericValue(email.charAt(0)) == Character.getNumericValue('@')
                            || Character.getNumericValue(email.charAt(0)) == Character.getNumericValue('.')
                            || Character.getNumericValue(email.charAt(0)) == Character.getNumericValue(' ')
                            || Character.getNumericValue(email.charAt(0)) == Character.getNumericValue('=')
                            || Character.getNumericValue(email.charAt(0)) == Character.getNumericValue('+')
                            || Character.getNumericValue(email.charAt(0)) == Character.getNumericValue('`')
                            || Character.getNumericValue(email.charAt(0)) == Character.getNumericValue('?')
                            || Character.getNumericValue(email.charAt(0)) == Character.getNumericValue('<')
                            || Character.getNumericValue(email.charAt(0)) == Character.getNumericValue('>')
                            || Character.getNumericValue(email.charAt(0)) == Character.getNumericValue('"')
                            || Character.getNumericValue(email.charAt(0)) == Character.getNumericValue('{')
                            || Character.getNumericValue(email.charAt(0)) == Character.getNumericValue('}')
                            || Character.getNumericValue(email.charAt(0)) == Character.getNumericValue('[')
                            || Character.getNumericValue(email.charAt(0)) == Character.getNumericValue(']')
                            || Character.getNumericValue(email.charAt(0)) == Character.getNumericValue('(')
                            || Character.getNumericValue(email.charAt(0)) == Character.getNumericValue(')')
                            || Character.getNumericValue(email.charAt(0)) == Character.getNumericValue('*')
                    ) {
                        System.out.println("The email address is invalid - forbidden signs");
                    } else System.out.println("Email address is valid");
                }

            }
        }
    }
}

