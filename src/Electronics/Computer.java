package Electronics;

public class Computer extends Electronics {

    private String cpu;
    private String gpu;
    private int ramFrequency;
    private int driveCapacity;

    public Computer(int id, String serialNumber, String manufacturer,
                    String cpu, String gpu, int ramFrequency, int driveCapacity) {
        super(id, serialNumber, manufacturer);
        this.cpu = cpu;
        this.gpu = gpu;
        this.ramFrequency = ramFrequency;
        this.driveCapacity = driveCapacity;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        if (cpu != null)
            this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        if (gpu != null)
            this.gpu = gpu;
    }

    public int getRamFrequency() {
        return ramFrequency;
    }

    public void setRamFrequency(int ramFrequency) {
        this.ramFrequency = ramFrequency;
    }

    public int getDriveCapacity() {
        return driveCapacity;
    }

    public void setDriveCapacity(int driveCapacity) {
        this.driveCapacity = driveCapacity;
    }
}
