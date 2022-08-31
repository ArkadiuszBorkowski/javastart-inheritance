package wholesaler;

public class Tires extends Part {

    private int size;
    private int width;


    public Tires(int serialNumber,String producer, String model, String series,int size, int width) {
        this.size = size;
        this.width = width;
        setProducer(producer);
        setSerialNumber(serialNumber);
        setModel(model);
        setSeries(series);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    void printInfo() {
        System.out.println(getSerialNumber() + ", " + getProducer() + ", " + getModel() + ", " + getSeries()
                + ", " + size + ", " + width);
    }

}
