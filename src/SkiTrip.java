public class SkiTrip extends Trip {
    private int liftcard;
    private int pairOfSkies;

    public SkiTrip(String country, int duration, double price, int persons, int liftcard, int pairOfSkies) {
        super(country, duration, price, persons);
        this.liftcard = liftcard;
        this.pairOfSkies = pairOfSkies;
    }

    public String toString() {
        return "SkiTrip{" +
                "liftcard=" + liftcard +
                ", pairOfSkies=" + pairOfSkies +
                ", country='" + country + '\'' +
                ", duration=" + duration +
                ", price=" + price +
                ", persons=" + persons +
                '}';
    }

    public int getLiftcard() {
        return liftcard;
    }

    public void setLiftcard(int liftcard) {
        this.liftcard = liftcard;
    }

    public int getPairOfSkies() {
        return pairOfSkies;
    }

    public void setPairOfSkies(int pairOfSkies) {
        this.pairOfSkies = pairOfSkies;
    }
}
