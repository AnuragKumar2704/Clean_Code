package org.example.discussion.polymorphism;

enum BIRDS{
    EUROPEAN,
    AFRICAN,
    NORWEGIAN_BLUE
}

class Bird {
    // ...
    double getSpeed(BIRDS type) {
        switch (type) {
            case EUROPEAN:
                return getBaseSpeed();
            case AFRICAN:
                return getBaseSpeed() - getLoadFactor() * numberOfCoconuts();
            case NORWEGIAN_BLUE:
                return (isNailed) ? 0 : getBaseSpeed(voltage);
        }
        throw new RuntimeException("Should be unreachable");
    }

    public int getBaseSpeed() {
        return 20;
    }

    public int getBaseSpeed(int voltage) {
        return (int) (voltage * getLoadFactor());
    }

    public int getLoadFactor() {
        return 2;
    }

    public int numberOfCoconuts() {
        return 3;
    }

    public int voltage = 10;

    boolean isNailed = false;

}