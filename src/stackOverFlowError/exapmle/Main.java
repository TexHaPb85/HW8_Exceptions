package stackOverFlowError.exapmle;

public class Main {

    static int wrongRecursion(int n){
        return wrongRecursion(n);
    }

    public static void main(String[] args) {
        wrongRecursion(6);
    }
}
