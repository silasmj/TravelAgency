public class Trip {
    String country;
    int duration;
    double price;
    int persons;

    public Trip(String country, int duration, double price, int persons) {
        this.country = country;
        this.duration = duration;
        this.price = price;
        this.persons = persons;
    }

    public String toString() {
        return "Trip{" +
                "country='" + country + '\'' +
                ", duration=" + duration +
                ", price=" + price +
                ", persons=" + persons +
                '}';
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }
}
