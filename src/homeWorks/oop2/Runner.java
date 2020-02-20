package homeWorks.oop2;

public class Runner {
    public static void main(String[] args) {
        Microwave microwave = new Microwave("microwave", true, 220);
        Fridge fridge = new Fridge("fridge", false, 420);

        ElectroDevice electroDevice = new ElectroDevice();

        electroDevice.getDevices().add(microwave);
        electroDevice.getDevices().add(fridge);

        //Вывод всей электротехники (отсортированы по потребляемости энергии)
        electroDevice.showDevices();

        //Вывод общего количества потребления энергии
        System.out.println("Total electricity consumption: " + electroDevice.getTotalElectricityConsumption());

        //Подключаем холодильник к розетке
        electroDevice.getDevices().get(1).setPluggedIn(true);

        //Вывод общего количества потребления энергии
        System.out.println("Total electricity consumption: " + electroDevice.getTotalElectricityConsumption());


        //Вывод техники, которые потребляют энергию в заданном интервале
        electroDevice.getDevicesWithinInterval(200, 250);
    }
}
