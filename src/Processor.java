public class Processor extends ComputerPart implements Scalable{
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
        if (getTemp() + 10 > getMAX_TEMP()) {
            System.out.println("Nie mozna przyspieszyc procesora");
        } else if (getTemp() + 10 <= getMAX_TEMP()) {
            setTemp(getTemp() + 10);
            setTacting(getTacting() + 100);
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
