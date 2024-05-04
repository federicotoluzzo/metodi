package com.federicotoluzzo.classi.es2;

public class Computer {
    enum operatingSystem{
        ARCH,
        MACOSX,
        WINDOWS,
        FEDORA,
        UBUNTU,
        ZORIN,
        RASPBERRYPI
    }
    private operatingSystem os;
    private CPU cpu;
    private GPU gpu;
    private Storage storage;
    private RAM ram;
    private PSU psu;

    public Computer(CPU cpu, GPU gpu, Storage storage, RAM ram, PSU psu){
        this.cpu = cpu;
        this.gpu = gpu;
        this.storage = storage;
        this.ram = ram;
        this.psu = psu;
    }
    class CPU{
        float clock;
        int cores;
        int threads;
        int tdp;
        String model;

        public float getClock() {
            return clock;
        }

        public void setClock(float clock) {
            this.clock = clock;
        }

        public int getCores() {
            return cores;
        }

        public void setCores(int cores) {
            this.cores = cores;
        }

        public int getThreads() {
            return threads;
        }

        public void setThreads(int threads) {
            this.threads = threads;
        }

        public int getTdp() {
            return tdp;
        }

        public void setTdp(int tdp) {
            this.tdp = tdp;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }
    }
    class GPU{
        float clock;
        int cores;
        int dieSize;
        int tdp;
        long flops;
        String model;

        public float getClock() {
            return clock;
        }

        public void setClock(float clock) {
            this.clock = clock;
        }

        public int getCores() {
            return cores;
        }

        public void setCores(int cores) {
            this.cores = cores;
        }

        public int getDieSize() {
            return dieSize;
        }

        public void setDieSize(int dieSize) {
            this.dieSize = dieSize;
        }

        public int getTdp() {
            return tdp;
        }

        public void setTdp(int tdp) {
            this.tdp = tdp;
        }

        public long getFlops() {
            return flops;
        }

        public void setFlops(long flops) {
            this.flops = flops;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }
    }
    class Storage{
        enum technology{
            HDD,
            SSD
        }
        enum bus{
            SATA,
            PATA,
            SAS,
            Mdot2
        }
        Storage.technology technology;
        Storage.bus bus;
        long capacity;
        int writeSpeed;
        int readSpeed;
        String model;

        public Storage.technology getTechnology() {
            return technology;
        }

        public void setTechnology(Storage.technology technology) {
            this.technology = technology;
        }

        public Storage.bus getBus() {
            return bus;
        }

        public void setBus(Storage.bus bus) {
            this.bus = bus;
        }

        public long getCapacity() {
            return capacity;
        }

        public void setCapacity(long capacity) {
            this.capacity = capacity;
        }

        public int getWriteSpeed() {
            return writeSpeed;
        }

        public void setWriteSpeed(int writeSpeed) {
            this.writeSpeed = writeSpeed;
        }

        public int getReadSpeed() {
            return readSpeed;
        }

        public void setReadSpeed(int readSpeed) {
            this.readSpeed = readSpeed;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }
    }
    class RAM{
        enum generation{
            DDR,
            DDR2,
            DDR3,
            DDR4,
            DDR5
        }
        int frequency;
        long capacity;
        String model;

        public int getFrequency() {
            return frequency;
        }

        public void setFrequency(int frequency) {
            this.frequency = frequency;
        }

        public long getCapacity() {
            return capacity;
        }

        public void setCapacity(long capacity) {
            this.capacity = capacity;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }
    }
    class PSU{
        enum efficiency{
            PLUS,
            BRONZE,
            SILVER,
            GOLD,
            PLATINUM,
            TITANIUM
        }
        int wattage;
        String model;

        public int getWattage() {
            return wattage;
        }

        public void setWattage(int wattage) {
            this.wattage = wattage;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public GPU getGpu() {
        return gpu;
    }

    public void setGpu(GPU gpu) {
        this.gpu = gpu;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public PSU getPsu() {
        return psu;
    }

    public void setPsu(PSU psu) {
        this.psu = psu;
    }
}
