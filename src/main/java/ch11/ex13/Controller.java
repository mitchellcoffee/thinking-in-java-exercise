package ch11.ex13;

import ch10.ex24.Event;

import java.util.LinkedList;

public class Controller {

    private LinkedList<Event> eventList = new LinkedList<Event>();

    public void addEvent(Event c) {
        eventList.add(c);
    }

    public void run() {
        while (eventList.size() > 0) {
            for (Event e: new LinkedList<Event>(eventList)) {
                if (e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}
