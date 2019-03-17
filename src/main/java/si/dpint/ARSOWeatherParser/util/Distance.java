package si.dpint.ARSOWeatherParser.util;

import si.dpint.ARSOWeatherParser.weatherstation.GeoPoint;

public class Distance {

    private static final int EARTH_RADIUS_IN_KM = 6371;

    // Based on haversine formula found at https://www.movable-type.co.uk/scripts/latlong.html.
    public static double getDistanceInKm(GeoPoint first, GeoPoint second){

        double firstLatitudeInRadians = Math.toRadians(first.getLatitude());
        double secondLatitudeInRadians = Math.toRadians(first.getLatitude());

        double latitudeDifference = Math.toRadians(second.getLatitude() - first.getLatitude());
        double longitudeDifference = Math.toRadians(second.getLongitude() - first.getLongitude());

        double a = Math.pow(Math.sin(latitudeDifference / 2), 2) + Math.cos(firstLatitudeInRadians)
                * Math.cos(secondLatitudeInRadians) * Math.pow(Math.sin(longitudeDifference / 2), 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return EARTH_RADIUS_IN_KM * c;
    }
}
