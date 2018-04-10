package ch6.ex8;

public class Connection {

    private static int count = 0;

    private Connection() {
        System.out.println("private init connection");
    }

    public static Connection makeConnection() {
        count++;
        return new Connection();
    }

    public static int howMany() {
        return count;
    }

    @Override
    public String toString() {
        return "Connection{" + count + "}";
    }
}
