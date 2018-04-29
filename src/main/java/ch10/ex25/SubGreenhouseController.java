package ch10.ex25;

import ch10.ex24.Event;
import ch10.ex24.GreenhouseControls;

public class SubGreenhouseController {

    public static void main(String[] args) {
        SubGreenhouseControls gc = new SubGreenhouseControls();
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterMistOn(650),
                gc.new WaterMistOff(700),
                gc.new WaterOff(800),
                gc.new FanOff(1000),
                gc.new FanOn(1200),
                gc.new ThermostatDay(1400)
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        if (args.length == 1) {
            gc.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));
        }
        gc.run();
    }
}
