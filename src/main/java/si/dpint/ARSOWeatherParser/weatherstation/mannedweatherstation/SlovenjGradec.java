package si.dpint.ARSOWeatherParser.weatherstation.mannedweatherstation;

import si.dpint.ARSOWeatherParser.weatherstation.ApiEndpoint;
import si.dpint.ARSOWeatherParser.weatherstation.GeoPoint;
import si.dpint.ARSOWeatherParser.weatherstation.WeatherStation;

public class SlovenjGradec extends WeatherStation {

    public SlovenjGradec(ApiEndpoint apiEndpoint){
        super(apiEndpoint);
    }

    @Override
    protected String getResourcePath() {
        return "observation_SLOVE-GRA_latest.xml";
    }

    @Override
    public GeoPoint getLatLng() {
        return new GeoPoint(46.49, 15.1161);
    }
}
