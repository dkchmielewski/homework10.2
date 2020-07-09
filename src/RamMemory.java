public class RamMemory extends Processor implements Scalable{
    private int memory = 4096;

    @Override
    public void setTacting(int tacting) {
        super.setTacting(1066);
    }

    public RamMemory(String model, String manufacturer, int serialNumber) {
        super(model, manufacturer, serialNumber);
    }

    @Override
    public void increase() {
        if (getTemp() + 15 > getMAX_TEMP()) {
            System.out.println("Nie mozna zwiekszyc taktowania");
        }
        else if (getTemp() + 15 <= getMAX_TEMP()) {
            setTemp(getTemp() + 15);
            setTacting(getTacting() + 100);
        }
    }

    @Override
    public String toString() {
        return "Pamiec RAM: " + memory + "MB, " + "temperatura: " + getTemp() + ", "
                + "MAX_TEMP = " + getMAX_TEMP() +
                ", model: " + getModel() + ", producent: " + getManufacturer() +
                ", numer seryjny: " + getSerialNumber();
    }
}
