package ch10.ex14;


interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

class DragonZilla implements DangerousMonster {

    public void menace() {

    }

    public void destroy() {

    }
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

class VeryBadVampire implements Vampire {

    public void menace() {

    }

    public void destroy() {

    }

    public void kill() {

    }

    public void drinkBlood() {

    }
}

public class HorrorShow {

    static void u(Monster b) {
        b.menace();
    }

    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }

    static void w(Lethal l) {
        l.kill();
    }

    public DangerousMonster monsterMaker() {
        return new DangerousMonster() {
            public void destroy() {
                System.out.println("dm destroy");
            }

            public void menace() {
                System.out.println("dm menace");
            }
        };
    }

    public Vampire vampireMaker() {
        return new Vampire() {
            public void drinkBlood() {
                System.out.println("vampire drink blood");
            }

            public void destroy() {
                System.out.println("v destroy");
            }

            public void kill() {
                System.out.println("v kill");
            }

            public void menace() {
                System.out.println("v menace");
            }
        };
    }

    public static void main(String[] args) {
        HorrorShow hs = new HorrorShow();
        u(hs.monsterMaker());
        v(hs.monsterMaker());
        u(hs.vampireMaker());
        v(hs.vampireMaker());
        w(hs.vampireMaker());
    }

}
