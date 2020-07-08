public class ComputerPart {
    private String model;
    private String manufacturer;
    private int serialNumber;

    public ComputerPart(String model, String manufacturer, int serialNumber) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Model = " + model + ", manufacturer = " + manufacturer +
                ", serialNumber = " + serialNumber;
    }
}
