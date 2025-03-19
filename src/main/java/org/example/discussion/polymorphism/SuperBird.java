package org.example.discussion.polymorphism;

public abstract class SuperBird {
    abstract double getSpeed();
}

class European extends Bird {
    double getSpeed() {
        return getBaseSpeed();
    }
}
class African extends Bird {
    double getSpeed() {
        return getBaseSpeed() - getLoadFactor() * numberOfCoconuts();
    }
    public int numberOfCoconuts() {
        return 3;
    }

}
class NorwegianBlue extends Bird {
    double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }
}
