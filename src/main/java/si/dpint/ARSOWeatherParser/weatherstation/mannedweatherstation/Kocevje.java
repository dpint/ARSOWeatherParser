package si.dpint.ARSOWeatherParser.weatherstation.mannedweatherstation;

import si.dpint.ARSOWeatherParser.weatherstation.ApiEndpoint;
import si.dpint.ARSOWeatherParser.weatherstation.GeoPoint;
import si.dpint.ARSOWeatherParser.weatherstation.WeatherStation;

public class Kocevje extends WeatherStation {

    public Kocevje(ApiEndpoint apiEndpoint){
        super(apiEndpoint);
    }

    @Override
    protected String getResourcePath() {
        return "observation_KOCEVJE_latest.xml";
    }

    @Override
    public GeoPoint getLatLng() {
        return new GeoPoint(45.6453, 14.8542);
    }
}
