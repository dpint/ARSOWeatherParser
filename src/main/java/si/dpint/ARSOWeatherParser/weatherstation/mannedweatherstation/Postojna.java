package si.dpint.ARSOWeatherParser.weatherstation.mannedweatherstation;

import si.dpint.ARSOWeatherParser.weatherstation.ApiEndpoint;
import si.dpint.ARSOWeatherParser.weatherstation.GeoPoint;
import si.dpint.ARSOWeatherParser.weatherstation.WeatherStation;

public class Postojna extends WeatherStation {

    public Postojna(ApiEndpoint apiEndpoint){
        super(apiEndpoint);
    }

    @Override
    protected String getResourcePath() {
        return "observation_POSTOJNA_latest.xml";
    }

    @Override
    public GeoPoint getLatLng() {
        return new GeoPoint(45.7664, 14.1975);
    }
}
