public class BeachTrip extends Trip{
    private String poolView;
    private String area;

    public BeachTrip(String country, int duration, double price, int persons, String poolView, String area) {
        super(country, duration, price, persons);
        this.poolView = poolView;
        this.area = area;
    }


    public String toString() {
        return "BeachTrip{" +
                "poolView='" + poolView + '\'' +
                ", area='" + area + '\'' +
                ", country='" + country + '\'' +
                ", duration=" + duration +
                ", price=" + price +
                ", persons=" + persons +
                '}';
    }

    public String getPoolView() {
        return poolView;
    }

    public void setPoolView(String poolView) {
        this.poolView = poolView;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
