public class Processor extends PartInfo implements Scalable{
    private int tacting = 100;
    private int temp = 30;
    private final int MAX_TEMP = 40;

    public Processor(String model, String manufacturer, int serialNumber) {
        super(model, manufacturer, serialNumber);
    }

    public int getMAX_TEMP() {
        return MAX_TEMP;
    }

    public int getTacting() {
        return tacting;
    }

    public void setTacting(int tacting) {
        this.tacting = tacting;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    @Override
    public void increase() {
        setTemp(temp + 10);
        setTacting(tacting + 100);
        if (temp > MAX_TEMP) {
            System.out.println("Nie mozna przyspieszyc procesora");
        }
    }

    @Override
    public String toString() {
        return "Processor: " +
                "taktowanie = " + tacting + "MHz" +
                ", temperatura = " + temp +
                ", MAX_TEMP = " + MAX_TEMP +
                ", model: " + getModel() + ", producent: " + getManufacturer() +
                ", numer seryjny: " + getSerialNumber();
    }
}
