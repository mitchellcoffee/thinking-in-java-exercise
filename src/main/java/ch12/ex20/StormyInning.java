package ch12.ex20;


class BaseballException extends Exception {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}
class UmpireArgument extends BaseballException {}
class ThrownFromGame extends UmpireArgument {}

abstract class Inning {
    public Inning() throws BaseballException {}
    public void event() throws BaseballException {}
    public abstract void atBat() throws Strike, Foul, UmpireArgument;
    public void questionableCall() throws UmpireArgument {}
    public void walk() {}
}

class StormException extends Exception {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}

interface Storm {
    void event() throws RainedOut;
    void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm {

    public StormyInning() throws RainedOut, BaseballException {}
    public StormyInning(String s) throws Foul, BaseballException {}

//    public void walk() throws PopFoul {}

//    public void event() throws RainedOut {}

    public void rainHard() throws RainedOut {}

    public void event() {}

    public void questionableCall() throws UmpireArgument {
        throw new UmpireArgument();
    }

    @Override
    public void atBat() throws PopFoul {}

    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        } catch (PopFoul e) {
            System.out.println("Pop foul");
        } catch (RainedOut rainedOut) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }

        try {
            Inning i =  new StormyInning();
            i.atBat();
        } catch (Strike e) {
            System.out.println("Strike");
        } catch (Foul e) {
            System.out.println("Foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }


    }
}
