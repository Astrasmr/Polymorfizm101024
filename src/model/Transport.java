package model;

import java.util.Objects;

public abstract class Transport implements Serviceable {
    protected final String modelName;
    protected  int wheelsCount;
    public Transport (String modelName,int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    protected void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    public String getModelName() {
        return modelName;
    }
    public String getName() {
        return getModelName();

    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return wheelsCount == transport.wheelsCount && Objects.equals(modelName, transport.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return "model.Transport{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }
    @Override
    public void service() {
        System.out.printf( "Облуживается %s%n",modelName);
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
}
