package model;

import javax.sound.midi.Track;

public class Truck extends Transport {
public Truck (String modelName, int wheelsCount){
    super (modelName, wheelsCount);
}
public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void service() {
    super.service();
        checkEngine();
        checkTrailer();
    }
}