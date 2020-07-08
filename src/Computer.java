public class Computer {
    private Processor processor;
    private RamMemory ramMemory;
    private HardDrive hardDrive;

    public Computer(Processor processor, RamMemory ramMemory, HardDrive hardDrive) {
        this.processor = processor;
        this.ramMemory = ramMemory;
        this.hardDrive = hardDrive;
    }

    @Override
    public String toString() {
        return "Computer" + "\n" + getProcessor() +
                "\n" + getRamMemory() +
                "\n" + getHardDrive();
    }

    public Processor getProcessor() {
        return processor;
    }

    public RamMemory getRamMemory() {
        return ramMemory;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }
}
