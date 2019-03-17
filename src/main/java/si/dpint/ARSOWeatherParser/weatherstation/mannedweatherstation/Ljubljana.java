package si.dpint.ARSOWeatherParser.weatherstation.mannedweatherstation;

import si.dpint.ARSOWeatherParser.weatherstation.ApiEndpoint;
import si.dpint.ARSOWeatherParser.weatherstation.GeoPoint;
import si.dpint.ARSOWeatherParser.weatherstation.WeatherStation;

public class Ljubljana extends WeatherStation {

    public Ljubljana(ApiEndpoint apiEndpoint){
        super(apiEndpoint);
    }

    @Override
    protected String getResourcePath() {
        return "observation_LJUBL-ANA_BEZIGRAD_latest.xml";
    }

    @Override
    public GeoPoint getLatLng() {
        return new GeoPoint(46.0658, 14.5172);
    }
}
