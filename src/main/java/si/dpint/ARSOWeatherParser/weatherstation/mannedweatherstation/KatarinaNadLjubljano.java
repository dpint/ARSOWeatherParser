package si.dpint.ARSOWeatherParser.weatherstation.mannedweatherstation;

import si.dpint.ARSOWeatherParser.weatherstation.ApiEndpoint;
import si.dpint.ARSOWeatherParser.weatherstation.GeoPoint;
import si.dpint.ARSOWeatherParser.weatherstation.WeatherStation;

public class KatarinaNadLjubljano extends WeatherStation {

    public KatarinaNadLjubljano(ApiEndpoint apiEndpoint){
        super(apiEndpoint);
    }

    @Override
    protected String getResourcePath() {
        return "observation_KATARINA_latest.xml";
    }

    @Override
    public GeoPoint getLatLng() {
        return new GeoPoint(46.0933, 14.3756);
    }
}
