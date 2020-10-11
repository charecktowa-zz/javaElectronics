package Electronics;

public abstract class Electronics {

    protected int id;
    protected String serialNumber;
    protected String manufacturer;

    public Electronics(int id, String serialNumber, String manufacturer) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
