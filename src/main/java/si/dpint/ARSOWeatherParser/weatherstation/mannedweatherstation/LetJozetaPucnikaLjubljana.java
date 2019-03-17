package si.dpint.ARSOWeatherParser.weatherstation.mannedweatherstation;

import si.dpint.ARSOWeatherParser.weatherstation.ApiEndpoint;
import si.dpint.ARSOWeatherParser.weatherstation.GeoPoint;
import si.dpint.ARSOWeatherParser.weatherstation.WeatherStation;

public class LetJozetaPucnikaLjubljana extends WeatherStation {

    public LetJozetaPucnikaLjubljana(ApiEndpoint apiEndpoint){
        super(apiEndpoint);
    }

    @Override
    protected String getResourcePath() {
        return "observation_LJUBL-ANA_BRNIK_latest.xml";
    }

    @Override
    public GeoPoint getLatLng() {
        return new GeoPoint(46.2178, 14.4775);
    }
}
