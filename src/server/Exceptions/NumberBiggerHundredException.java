package server.Exceptions;

public class NumberBiggerHundredException extends Exception{
    public NumberBiggerHundredException(int number) {
        super("number "+number+" is bigger than 100 and cannot be processed");
    }
}
