public class HelloWorld {
    public static void main(final String[] args) {
        Log.printMessage("Hello World!!");
    }
}

class Log {
    public static void printMessage(final String message) {
        System.out.printf("[%tF %<tT] %s%n", System.currentTimeMillis(), message);
    }
}
