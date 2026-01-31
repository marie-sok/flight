package org.skypro.flight;

import java.util.List;

public class Flight {
    public static void main(String[] args) {
    }
    private final List<Segment> segments;

    public Flight(List<Segment> segments) {
        this.segments = segments;
    }

    public List<Segment> getSegments() {
        return segments;
    }

    @Override
    public String toString() {
        return "Flight{" + segments + "}";
    }
}