package server;

import server.Exceptions.NumberBiggerHundredException;
import server.Exceptions.OddNumberException;
import server.Exceptions.WordNotPalindromeException;

public class Server {
    public void processData(String word, int number, Object object){
        try {
            processWord(word);
            processNumber(number);
            processObject(object);
        } catch (WordNotPalindromeException | OddNumberException | NumberBiggerHundredException | NullPointerException e) {
            e.printStackTrace();
        }
    }

    private void processWord(String word) throws WordNotPalindromeException {
        if(word.equals(new StringBuffer(word).reverse().toString())){
            System.out.println("the word "+word+" is palindrome and processed successfully");
        }else
            throw new WordNotPalindromeException(word);

    }

    private void processNumber(int num) throws OddNumberException, NumberBiggerHundredException {
        if(num>100){
            throw new NumberBiggerHundredException(num);
        }else if(num%2!=0){
            throw new OddNumberException(num);
        }else
            System.out.println("number "+num+" is even and les than 100, so it was processed successfully");

    }

    private void processObject(Object obj){
        if(obj==null){
            throw new NullPointerException("object "+" is null");
        }else
            System.out.println("object "+ obj + " isn`t null, and processed successfully");
    }
}
