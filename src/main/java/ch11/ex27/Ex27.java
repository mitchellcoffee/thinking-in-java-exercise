package ch11.ex27;

import java.util.LinkedList;
import java.util.Queue;

class Command {

    private String field;

    public Command(String field) {
        this.field = field;
    }

    public void operation() {
        System.out.println("command: " + field);
    }
}


class Builder {
    Queue<Command> makeQ() {
        Queue<Command> q = new LinkedList<Command>();
        for (int i = 0; i < 10; ++i) {
            q.offer(new Command(i + ""));
        }
        return q;
    }
}

public class Ex27 {

    public static void commandEnter(Queue<Command> qc) {
        while (qc.peek() != null) {
            Command c = qc.poll();
            c.operation();
        }
    }

    public static void main(String[] args) {
        Builder b = new Builder();
        commandEnter(b.makeQ());
    }
}
