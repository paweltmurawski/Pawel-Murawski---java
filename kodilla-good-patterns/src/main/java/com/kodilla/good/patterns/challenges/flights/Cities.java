package com.kodilla.good.patterns.challenges.flights;

public class Cities {
    private String cityFrom;
    private String cityTo;

    public Cities(String cityFrom, String cityTo) {
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
    }

    public String getCityFrom() {
        return cityFrom;
    }


    public String getCityTo() {
        return cityTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cities cities = (Cities) o;

        if (!cityFrom.equals(cities.cityFrom)) return false;
        return cityTo.equals(cities.cityTo);
    }

    @Override
    public int hashCode() {
        int result = cityFrom.hashCode();
        result = 31 * result + cityTo.hashCode();
        return result;
    }
}


