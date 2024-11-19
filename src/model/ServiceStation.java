package model;

public class ServiceStation {
    public void check (Serviceable ... elements) {
        for (int i = 0; i < elements.length; i++) {
            elements[i].service();
        }
    }
}
