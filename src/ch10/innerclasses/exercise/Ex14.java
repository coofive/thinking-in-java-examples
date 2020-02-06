package ch10.innerclasses.exercise;

/**
 * ****************** Exercise 14 ******************
 * Modify interfaces/HorrorShow.java to implement
 * DangerousMonster and Vampire using anonymous
 * classes.
 * **********************************************
 *
 * @author coofive
 */

public class Ex14 {
    public static void main(String[] args) {
        DangerousMonster barney = new DangerousMonster() {
            @Override
            public void destroy() {

            }

            @Override
            public void menace() {

            }
        };
        HorrorShow.u(barney);
        HorrorShow.v(barney);
        Vampire vlad = new Vampire() {
            @Override
            public void drinkBlood() {

            }

            @Override
            public void kill() {

            }

            @Override
            public void destroy() {

            }

            @Override
            public void menace() {

            }
        };
        HorrorShow.u(vlad);
        HorrorShow.v(vlad);
        HorrorShow.w(vlad);
    }
}


interface Monster {
    /**
     * menace
     */
    void menace();
}

interface DangerousMonster extends Monster {
    /**
     * destroy
     */
    void destroy();
}

interface Lethal {
    /**
     * kill
     */
    void kill();
}

class DragonZilla implements DangerousMonster {
    @Override
    public void menace() {
    }

    @Override
    public void destroy() {
    }
}

interface Vampire extends DangerousMonster, Lethal {
    /**
     * drinkBlood
     */
    void drinkBlood();
}

class VeryBadVampire implements Vampire {
    @Override
    public void menace() {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void kill() {
    }

    @Override
    public void drinkBlood() {
    }
}

class HorrorShow {
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

} ///:~