package Electronics;

public class Computer extends Electronics {

    private String cpu;
    private String gpu;
    private int ramFrequency;

    public Computer(int id, String serialNumber, String manufacturer,
                    String cpu, String gpu, int ramFrequency) {
        super(id, serialNumber, manufacturer);
        this.cpu = cpu;
        this.gpu = gpu;
        this.ramFrequency = ramFrequency;
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

    @Override
    public String toString() {
        return ("""
                ID: %d
                NS: %s
                MANU:%s
                CPU:%s
                GPU:%s
                RAM%d
                """).formatted(id, serialNumber, manufacturer, cpu, gpu, ramFrequency);
    }
}
