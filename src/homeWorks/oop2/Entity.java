package homeWorks.oop2;

abstract public class Entity {
    private String name;
    private boolean pluggedIn; //включен ли к розетке
    private int electricalConsumption; //потребление энергии

    public Entity(String name, boolean pluggedIn, int electricalСonsumption) {
        this.name = name;
        this.pluggedIn = pluggedIn;
        this.electricalConsumption = electricalСonsumption;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", pluggedIn=" + pluggedIn +
                ", electricalConsumption=" + electricalConsumption +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPluggedIn() {
        return pluggedIn;
    }

    public void setPluggedIn(boolean pluggedIn) {
        this.pluggedIn = pluggedIn;
    }

    public int getElectricalConsumption() {
        return electricalConsumption;
    }

    public void setElectricalConsumption(int electricalConsumption) {
        this.electricalConsumption = electricalConsumption;
    }
}
