package si.dpint.ARSOWeatherParser.weatherstation.mannedweatherstation;

import si.dpint.ARSOWeatherParser.weatherstation.ApiEndpoint;
import si.dpint.ARSOWeatherParser.weatherstation.GeoPoint;
import si.dpint.ARSOWeatherParser.weatherstation.WeatherStation;

public class LetCerkljeObKrki extends WeatherStation {

    public LetCerkljeObKrki(ApiEndpoint apiEndpoint){
        super(apiEndpoint);
    }

    @Override
    protected String getResourcePath() {
        return "observation_CERKLJE_LETAL-SCE_latest.xml";
    }

    @Override
    public GeoPoint getLatLng() {
        return new GeoPoint(45.8936, 15.525);
    }
}
