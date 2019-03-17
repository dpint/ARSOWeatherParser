package si.dpint.ARSOWeatherParser.weatherstation.mannedweatherstation;

import si.dpint.ARSOWeatherParser.weatherstation.ApiEndpoint;
import si.dpint.ARSOWeatherParser.weatherstation.GeoPoint;
import si.dpint.ARSOWeatherParser.weatherstation.WeatherStation;

public class LetPortoroz extends WeatherStation {

    public LetPortoroz(ApiEndpoint apiEndpoint){
        super(apiEndpoint);
    }

    @Override
    protected String getResourcePath() {
        return "observation_PORTOROZ_SECOVLJE_latest.xml";
    }

    @Override
    public GeoPoint getLatLng() {
        return new GeoPoint(45.4756, 13.6206);
    }
}
