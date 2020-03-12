package com.example.earthquakereport;

public class Earthquake {
    private double Magnitude;
    private String Location;
    private long TimeInMillisecond;
    private String Url;
    /**
     *
     * @param Magnitude besarnya magnitude gempa
     * @param Location lokasi gempa terjadi
     * @param TimeInMillisecond waktu gempa terjadi dalam satuan milidetik
     * @param Url  URL dari website sumber gempa
     */
    public Earthquake(double Magnitude, String Location, long TimeInMillisecond, String Url) {
        this.Magnitude = Magnitude;
        this.Location = Location;
        this.TimeInMillisecond = TimeInMillisecond;
        this.Url = Url;
    }

    public double getMagnitude() {
        return Magnitude;
    }

    public String getLocation() {
        return Location;
    }

    public long getTimeInMillisecond() {
        return TimeInMillisecond;
    }

    public String getUrl() {
        return Url;
    }

    public void add(Earthquake earthquake) {
    }
}
