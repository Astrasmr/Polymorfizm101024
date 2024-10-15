package model;

public class ServiceStation {
    public void check (Serviceable ... elements) {
        for (int i = 0; i < elements.length; i++) {
            System.out.printf( "Облуживается %s%n",elements[i].getName());
            elements[i].service();
        }
    }
}
