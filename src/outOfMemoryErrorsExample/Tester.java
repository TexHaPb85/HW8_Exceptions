package outOfMemoryErrorsExample;

/**
 * https://habr.com/ru/post/117274/
 */
public class Tester {
    public static void main(String[] args) {
        heapSpaceExample();
    }

    static void heapSpaceExample() {
        String[] str = new String[Integer.MAX_VALUE - 8];
        for (int i = 0; i < Integer.MAX_VALUE - 8; i++) {
            str[i] = "string" + i;
        }
    }
}
