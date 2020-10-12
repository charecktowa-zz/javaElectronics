package Electronics;

public class MicroComponent extends Electronics {
    private String wireless;
    private int  wattage;
    private int channels;

    public MicroComponent(int id, String serialNumber, String manufacturer,
                          String wireless, int wattage, int channels) {

        super(id, serialNumber, manufacturer);
        this.wireless = wireless;
        this.wattage = wattage;
        this.channels = channels;
    }

    public String getWireless() {
        return wireless;
    }

    public void setWireless(String wireless) {
        this.wireless = wireless;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public int getChannels() {
        return channels;
    }

    public void setChannels(int channels) {
        this.channels = channels;
    }

    @Override
    public String toString() {
        return ("""
                ID: %d
                NS: %s
                MANU:%s
                Wir:%s
                Watt:%d
                CH%d
                """).formatted(id, serialNumber, manufacturer, wireless, wattage, channels);
    }

}

