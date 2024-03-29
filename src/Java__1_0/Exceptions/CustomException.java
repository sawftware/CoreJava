package Java__1_0.Exceptions;

import java.io.Serial;

public class CustomException extends Exception {

    @Serial
    private static final long serialVersionUID = 1L;

    public CustomException(final String errorMessage) {
        super(errorMessage);
    }

}
