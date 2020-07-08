public class Computer {
    Processor processor;
    RamMemory ramMemory;
    HardDrive hardDrive;

    public Computer(Processor processor, RamMemory ramMemory, HardDrive hardDrive) {
        this.processor = processor;
        this.ramMemory = ramMemory;
        this.hardDrive = hardDrive;
    }

    @Override
    public String toString() {
        return "Computer" + "\n" + processor +
                "\n" + ramMemory +
                "\n" + hardDrive;
    }
}
