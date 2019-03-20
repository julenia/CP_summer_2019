public class Email {
    public static void main(String[] args) {
        String email ="julia.jankowska@onet.eu";
        System.out.println("The email address is "+email);
        if (email.indexOf("@")==-1)System.out.println("The email address is invalid");
        else{
            if (email.indexOf('.')==-1)System.out.println("The email address is invalid");
            else{
                if (email.length()<6) System.out.println("The email address is invalid");
                else{
                    if (Character.getNumericValue(email.charAt(0)) == Character.getNumericValue('@')) {
                        System.out.println("The email address is invalid");
                    }
                }

            }
        }
    }
}
//System.out.println("Email address is valid");