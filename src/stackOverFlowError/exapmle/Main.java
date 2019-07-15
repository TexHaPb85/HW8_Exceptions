package stackOverFlowError.exapmle;

public class Main {
    public static void main(String[] args) {
        wrongRecursion(6);
    }

    private static int wrongRecursion(int n) {
        return wrongRecursion(n);
    }
}
