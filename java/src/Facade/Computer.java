package Facade;

public class Computer { // facade
    Cpu proc;
    Memory ram;

    Computer(){
        proc = new Cpu();
        ram = new Memory();
    }

    void start(){
        ram.load();
        proc.jump(42);
        proc.freeze();
    }
}
