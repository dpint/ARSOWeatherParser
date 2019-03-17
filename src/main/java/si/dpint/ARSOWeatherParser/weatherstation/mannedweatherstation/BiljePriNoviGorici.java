package si.dpint.ARSOWeatherParser.weatherstation.mannedweatherstation;

import si.dpint.ARSOWeatherParser.weatherstation.ApiEndpoint;
import si.dpint.ARSOWeatherParser.weatherstation.GeoPoint;
import si.dpint.ARSOWeatherParser.weatherstation.WeatherStation;

public class BiljePriNoviGorici extends WeatherStation {

    public BiljePriNoviGorici(ApiEndpoint apiEndpoint){
        super(apiEndpoint);
    }

    @Override
    protected String getResourcePath() {
        return "observation_NOVA-GOR_latest.xml";
    }

    @Override
    public GeoPoint getLatLng() {
        return new GeoPoint(45.8958, 13.6289);
    }
}
