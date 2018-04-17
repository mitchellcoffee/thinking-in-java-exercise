package ch8.ex16;


class AlertStatus {
    void alert() {}
}

class WarningAlert extends AlertStatus {
    @Override
    void alert() {
        System.out.println("warning");
    }
}

class DebugAlert extends AlertStatus {
    @Override
    void alert() {
        System.out.println("debug");
    }
}

class ErrorAlert extends AlertStatus {
    @Override
    void alert() {
        System.out.println("error");
    }
}

public class Starship {

    private AlertStatus alert = new WarningAlert();
    public void changeWarning() {
        alert = new WarningAlert();
    }
    public void changeDebug() {
        alert = new DebugAlert();
    }
    public void changeError() {
        alert = new ErrorAlert();
    }
    public void alert() {
        alert.alert();
    }

    public static void main(String[] args) {
        Starship starship = new Starship();
        starship.changeError();
        starship.alert();
    }

}
