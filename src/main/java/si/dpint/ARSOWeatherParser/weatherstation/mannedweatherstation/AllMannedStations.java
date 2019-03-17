package si.dpint.ARSOWeatherParser.weatherstation.mannedweatherstation;

import si.dpint.ARSOWeatherParser.weatherstation.ApiEndpoint;
import si.dpint.ARSOWeatherParser.weatherstation.CallableApiEndpoint;

public class AllMannedStations implements CallableApiEndpoint {
    private ApiEndpoint apiEndpoint;

    public AllMannedStations(ApiEndpoint apiEndpoint){
        this.apiEndpoint = apiEndpoint;
    }

    public String getUrl(){
        return apiEndpoint.getUrl() + "observation_si_latest.xml";

    }
}
