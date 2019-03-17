package si.dpint.ARSOWeatherParser.weatherstation.mannedweatherstation;

import si.dpint.ARSOWeatherParser.weatherstation.ApiEndpoint;
import si.dpint.ARSOWeatherParser.weatherstation.GeoPoint;
import si.dpint.ARSOWeatherParser.weatherstation.WeatherStation;

public class Vojsko extends WeatherStation {

    public Vojsko(ApiEndpoint apiEndpoint){
        super(apiEndpoint);
    }

    @Override
    protected String getResourcePath() {
        return "observation_VOJSKO_latest.xml";
    }

    @Override
    public GeoPoint getLatLng() {
        return new GeoPoint(46.0253, 13.9078);
    }
}
