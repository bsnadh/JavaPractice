class InvalidAgeException extends Exception{
    public InvalidAgeException(String str) {
        super(str);
    }
}

public class CustomException {
    static void validate(int age) throws InvalidAgeException{
        if(age<18) {
            throw new InvalidAgeException("not allowed to vote");
        }
        else {
            System.out.println("welcome");
        }
    }

    public static void main(String[] args) {
        try {
            validate(13);
        } catch (InvalidAgeException e) {
            System.out.println("exception occured: "+e);
        }
    }
}
