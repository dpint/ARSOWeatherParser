package si.dpint.ARSOWeatherParser.weatherstation.mannedweatherstation;

import si.dpint.ARSOWeatherParser.weatherstation.ApiEndpoint;
import si.dpint.ARSOWeatherParser.weatherstation.GeoPoint;
import si.dpint.ARSOWeatherParser.weatherstation.WeatherStation;

public class LetEdvardaRusjanaMaribor extends WeatherStation {

    public LetEdvardaRusjanaMaribor(ApiEndpoint apiEndpoint){
        super(apiEndpoint);
    }

    @Override
    protected String getResourcePath() {
        return "observation_MARIBOR_SLIVNICA_latest.xml";
    }

    @Override
    public GeoPoint getLatLng() {
        return new GeoPoint(46.48, 15.6869);
    }
}
