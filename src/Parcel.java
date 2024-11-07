import java.io.Serializable;

public class Parcel {
    protected String ID;

    private double length;
    private double width;
    private double height;
    private double weight;
    int daysInDepot;
    private boolean isCollected;

    public Parcel(String ID, double length, double width, double height, int daysInDepot, double weight) {
        this.ID = ID;
        this.length = length;
        this.width = width;
        this.height = height;
        this.daysInDepot = daysInDepot;
        this.weight = weight;
        this.isCollected = isCollected;
    }


    public String getID()
    {
        return ID;
    }



    public int getDaysInDepot() {
        return daysInDepot;
    }

    public double getWeight() {
        return weight;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }


    public void setID (String ID) {
        this.ID = ID;
    }

    public void setWeight (double weight) {
        this.weight = weight;
    }

    public void setDaysInDepot(int daysInDepot) {
        this.daysInDepot = daysInDepot;
    }

    public void setLength (double length) {
        this.length = length;
    }

    public void setWidth (double width) {
        this.width = width;
    }

    public void setHeight (double height) {
        this.height = height;
    }



    public double CalculateFee() {

        double fee =  daysInDepot * 1.5;
        return fee;
    }



    public double AddDaysInDepot() {
        return daysInDepot++;
    }


}
