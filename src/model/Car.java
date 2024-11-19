package model;

public class Car extends Transport {
    public Car (String modelName){
        super (modelName, 4);
    }
    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void service() {
        super.service();
        checkEngine();

    }

}
