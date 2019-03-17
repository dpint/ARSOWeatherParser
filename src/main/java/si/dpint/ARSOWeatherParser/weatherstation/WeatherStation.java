package si.dpint.ARSOWeatherParser.weatherstation;

import com.sun.istack.internal.Nullable;

public abstract class WeatherStation implements CallableApiEndpoint {

    protected ApiEndpoint apiEndpoint;

    public WeatherStation(ApiEndpoint apiEndpoint){
        this.apiEndpoint = apiEndpoint;
    }

    protected abstract String getResourcePath();

    @Nullable
    public GeoPoint getLatLng(){
        return null;
    }

    public String getUrl(){
        return apiEndpoint.getUrl() + getResourcePath();
    }
}
