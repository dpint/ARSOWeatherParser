package si.dpint.ARSOWeatherParser.weatherstation.mannedweatherstation;

import si.dpint.ARSOWeatherParser.weatherstation.ApiEndpoint;
import si.dpint.ARSOWeatherParser.weatherstation.GeoPoint;
import si.dpint.ARSOWeatherParser.weatherstation.WeatherStation;

public class MurskaSobota extends WeatherStation {

    public MurskaSobota(ApiEndpoint apiEndpoint){
        super(apiEndpoint);
    }

    @Override
    protected String getResourcePath() {
        return "observation_MURSK-SOB_latest.xml";
    }

    @Override
    public GeoPoint getLatLng() {
        return new GeoPoint(46.6525, 16.1961);
    }
}
