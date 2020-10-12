package Electronics;

public class Television extends Electronics {

    private int resolution; // 1080, 720, etc
    private int size; //inches
    private String type; // oled, gaming, smart, blahblah


    public Television(int id, String serialNumber, String manufacturer,
                      int resolution, int size, String type) {
        super(id, serialNumber, manufacturer);
        this.resolution = resolution;
        this.size = size;
        this.type = type;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        if (resolution > 0)
            this.resolution = resolution;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size > 0)
            this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return ("""
                ID: %d
                SN: %s
                Manu: %s
                Resol: %d
                Size: %d
                Type: %s
                """).formatted(id, serialNumber, manufacturer, resolution, size, type);
    }
}
