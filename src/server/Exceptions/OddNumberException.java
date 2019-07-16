package server.Exceptions;

public class OddNumberException extends Exception {
    public OddNumberException(int number) {
        super("number " + number + " is odd and cannot be processed");
    }
}
