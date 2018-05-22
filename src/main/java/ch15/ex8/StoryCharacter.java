package ch15.ex8;

public class StoryCharacter {

    private static long counter = 0;

  	private final long id = counter++;

  	public String toString() {
        return getClass().getSimpleName() + " " + id;
  	}

}

class GoodGuy extends StoryCharacter {}
class LukeSkywalker extends GoodGuy {}
class Yoda extends GoodGuy {}
class BadGuy extends StoryCharacter {}
class DarthVader extends BadGuy {}
class JabbaTheHut extends BadGuy {}