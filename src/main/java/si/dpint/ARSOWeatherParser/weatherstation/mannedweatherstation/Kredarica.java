package si.dpint.ARSOWeatherParser.weatherstation.mannedweatherstation;

import si.dpint.ARSOWeatherParser.weatherstation.ApiEndpoint;
import si.dpint.ARSOWeatherParser.weatherstation.GeoPoint;
import si.dpint.ARSOWeatherParser.weatherstation.WeatherStation;

public class Kredarica extends WeatherStation {

    public Kredarica(ApiEndpoint apiEndpoint){
        super(apiEndpoint);
    }

    @Override
    protected String getResourcePath() {
        return "observation_KREDA-ICA_latest.xml";
    }

    @Override
    public GeoPoint getLatLng() {
        return new GeoPoint(46.3794, 13.8539);
    }
}
