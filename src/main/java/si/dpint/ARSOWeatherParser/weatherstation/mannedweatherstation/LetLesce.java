package si.dpint.ARSOWeatherParser.weatherstation.mannedweatherstation;

import si.dpint.ARSOWeatherParser.weatherstation.ApiEndpoint;
import si.dpint.ARSOWeatherParser.weatherstation.GeoPoint;
import si.dpint.ARSOWeatherParser.weatherstation.WeatherStation;

public class LetLesce extends WeatherStation {

    public LetLesce(ApiEndpoint apiEndpoint){
        super(apiEndpoint);
    }

    @Override
    protected String getResourcePath() {
        return "observation_LESCE_latest.xml";
    }

    @Override
    public GeoPoint getLatLng() {
        return new GeoPoint(46.37, 14.18);
    }
}
