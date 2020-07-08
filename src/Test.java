public class Test {
    public static void main(String[] args) {
        Processor processor = new Processor("a", "e", 1);
        RamMemory ramMemory = new RamMemory("r", "b", 2);
        HardDrive hardDrive = new HardDrive("p", "n", 3);

        Computer computer = new Computer(processor, ramMemory, hardDrive);
        System.out.println(computer.toString());

        processor.increase();
        System.out.println(computer.toString());
        processor.increase();
        ramMemory.increase();


    }
}
