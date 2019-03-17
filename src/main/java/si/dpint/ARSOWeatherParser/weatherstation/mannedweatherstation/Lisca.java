package si.dpint.ARSOWeatherParser.weatherstation.mannedweatherstation;

import si.dpint.ARSOWeatherParser.weatherstation.ApiEndpoint;
import si.dpint.ARSOWeatherParser.weatherstation.GeoPoint;
import si.dpint.ARSOWeatherParser.weatherstation.WeatherStation;

public class Lisca extends WeatherStation {

    public Lisca(ApiEndpoint apiEndpoint){
        super(apiEndpoint);
    }

    @Override
    protected String getResourcePath() {
        return "observation_LISCA_latest.xml";
    }

    @Override
    public GeoPoint getLatLng() {
        return new GeoPoint(46.0681, 15.2897);
    }
}
