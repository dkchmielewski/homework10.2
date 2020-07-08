public class HardDrive extends ComputerPart {
    ComputerPart computerPart;
    private int volume = 128;

    public HardDrive(String model, String manufacturer, int serialNumber) {
        super(model, manufacturer, serialNumber);
    }

    @Override
    public String toString() {
        return "Dysk twardy: " +
                "pojemnosc: " + volume + "GB"+
                ", model: " + getModel() + ", producent: " + getManufacturer() +
                ", numer seryjny: " + getSerialNumber();
    }
}
