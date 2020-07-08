public class HardDrive extends PartInfo{
    PartInfo partInfo;
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
