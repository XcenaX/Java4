package homeWorks.oop2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ElectroDevice {
    private List<Entity> devices = new ArrayList<>();

    public List<Entity> getDevices() {
        return devices;
    }    

    public int getTotalElectricityConsumption(){
        int totalElectricityConsumption = 0;
        for (Entity device : this.devices){
            if(device.isPluggedIn()){
                totalElectricityConsumption += device.getElectricalConsumption();
            }
        }

        return totalElectricityConsumption;
    }

    public void getDevicesWithinInterval(int num1, int num2){
        for (Entity device : this.devices){
            if(device.getElectricalConsumption() > num1 && device.getElectricalConsumption() < num2){
                System.out.println(device);
            }
        }
    }

    public void showDevices(){
        devices.sort(Comparator.comparing(Entity::getElectricalConsumption));

        for (Entity device : this.devices){
            System.out.println(device);
        }
    }
}
