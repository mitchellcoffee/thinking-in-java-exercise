package ch10.ex25;

import ch10.ex24.Event;
import ch10.ex24.GreenhouseControls;

public class SubGreenhouseControls extends GreenhouseControls {

    private boolean waterMist = false;

    public class WaterMistOn extends Event {
        public WaterMistOn(long delayTime) {
            super(delayTime);
        }

        public void action() {
            waterMist = true;
        }

        @Override
        public String toString() {
            return "Water mist is on";
        }
    }

    public class WaterMistOff extends Event {
        public WaterMistOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            waterMist = false;
        }

        @Override
        public String toString() {
            return "Water mist is off";
        }

    }
}
