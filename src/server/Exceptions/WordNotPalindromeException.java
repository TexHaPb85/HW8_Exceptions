package server.Exceptions;

public class WordNotPalindromeException extends Exception{
    public WordNotPalindromeException(String word) {
        super("word " + word+" is not a palindrome and cannot be processed");
    }
}
