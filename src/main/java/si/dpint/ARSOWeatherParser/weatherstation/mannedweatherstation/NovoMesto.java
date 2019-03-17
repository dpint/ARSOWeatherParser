package si.dpint.ARSOWeatherParser.weatherstation.mannedweatherstation;

import si.dpint.ARSOWeatherParser.weatherstation.ApiEndpoint;
import si.dpint.ARSOWeatherParser.weatherstation.GeoPoint;
import si.dpint.ARSOWeatherParser.weatherstation.WeatherStation;

public class NovoMesto extends WeatherStation {

    public NovoMesto(ApiEndpoint apiEndpoint){
        super(apiEndpoint);
    }

    @Override
    protected String getResourcePath() {
        return "observation_NOVO-MES_latest.xml";
    }

    @Override
    public GeoPoint getLatLng() {
        return new GeoPoint(45.8019, 15.1822);
    }
}
