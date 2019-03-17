package si.dpint.ARSOWeatherParser.weatherstation.mannedweatherstation;

import si.dpint.ARSOWeatherParser.weatherstation.ApiEndpoint;
import si.dpint.ARSOWeatherParser.weatherstation.GeoPoint;
import si.dpint.ARSOWeatherParser.weatherstation.WeatherStation;

public class Crnomelj extends WeatherStation {

    public Crnomelj(ApiEndpoint apiEndpoint){
        super(apiEndpoint);
    }

    @Override
    protected String getResourcePath() {
        return "observation_CRNOMELJ_latest.xml";
    }

    @Override
    public GeoPoint getLatLng() {
        return new GeoPoint(45.5603, 15.1508);
    }
}
