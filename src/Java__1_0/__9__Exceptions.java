package Java__1_0;

import Java__1_0.Exceptions.CustomException;

public class __9__Exceptions {

    public static void main(final String[] args) {

        try {
            System.out.println("In the try block");
            throw new CustomException("Oops! A custom exception has occurred");
        }
        catch(final CustomException exception) {
            System.out.println("In the catch block");
            exception.printStackTrace();
        }
        finally {
            System.out.println("In the finally block");
        }
    }

}