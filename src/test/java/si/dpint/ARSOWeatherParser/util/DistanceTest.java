package si.dpint.ARSOWeatherParser.util;


import org.junit.jupiter.api.Test;
import si.dpint.ARSOWeatherParser.weatherstation.GeoPoint;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DistanceTest {

    @Test
    void getDistance() {
        double actual = Distance.getDistanceInKm(new GeoPoint(46.554649, 15.645881),
                new GeoPoint(46.517990, 16.196470));
        double expected = 42;
        assertEquals(expected, actual, 0.5f);
    }
}