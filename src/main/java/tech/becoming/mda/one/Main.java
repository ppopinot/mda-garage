package tech.becoming.mda.one;

import tech.becoming.mda.one.model.actor.Owner;
import tech.becoming.mda.one.model.garage.DigitalKey;
import tech.becoming.mda.one.model.garage.DigitalLock;
import tech.becoming.mda.one.model.garage.Gate;
import tech.becoming.mda.one.model.garage.Motor;

public class Main {

    public static void main(String[] args) {
        Gate g = new Gate();
        Motor m = new Motor(g);
        DigitalLock dl = new DigitalLock(m);

        DigitalKey dk = new DigitalKey("1111");
        dk.setLock(dl);

        Owner o = new Owner(dk);
        o.open();
    }

}
