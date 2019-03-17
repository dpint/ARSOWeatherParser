package si.dpint.ARSOWeatherParser.weatherstation.mannedweatherstation;

import si.dpint.ARSOWeatherParser.weatherstation.ApiEndpoint;
import si.dpint.ARSOWeatherParser.weatherstation.GeoPoint;
import si.dpint.ARSOWeatherParser.weatherstation.WeatherStation;

public class Vogel extends WeatherStation {

    public Vogel(ApiEndpoint apiEndpoint){
        super(apiEndpoint);
    }

    @Override
    protected String getResourcePath() {
        return "observation_VOGEL_latest.xml";
    }

    @Override
    public GeoPoint getLatLng() {
        return new GeoPoint(46.2639, 13.8456);
    }
}
