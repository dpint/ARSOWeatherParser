package si.dpint.ARSOWeatherParser.util;

import si.dpint.ARSOWeatherParser.weatherstation.ApiEndpoint;
import si.dpint.ARSOWeatherParser.weatherstation.mannedweatherstation.*;
import si.dpint.ARSOWeatherParser.weatherstation.WeatherStation;

import java.util.ArrayList;
import java.util.List;

public class MannedStationsLoader {

    ApiEndpoint apiEndpoint;

    public MannedStationsLoader(ApiEndpoint apiEndpoint){
        this.apiEndpoint = apiEndpoint;
    }

    public List<WeatherStation> getMannedStationsList(){
        List<WeatherStation> weatherStations = new ArrayList<>();
        
        weatherStations.add(new BiljePriNoviGorici(apiEndpoint));
        weatherStations.add(new Celje(apiEndpoint));
        weatherStations.add(new Crnomelj(apiEndpoint));
        weatherStations.add(new KatarinaNadLjubljano(apiEndpoint));
        weatherStations.add(new Kocevje(apiEndpoint));
        weatherStations.add(new Kredarica(apiEndpoint));
        weatherStations.add(new LetCerkljeObKrki(apiEndpoint));
        weatherStations.add(new LetEdvardaRusjanaMaribor(apiEndpoint));
        weatherStations.add(new LetJozetaPucnikaLjubljana(apiEndpoint));
        weatherStations.add(new LetLesce(apiEndpoint));
        weatherStations.add(new LetPortoroz(apiEndpoint));
        weatherStations.add(new Lisca(apiEndpoint));
        weatherStations.add(new Ljubljana(apiEndpoint));
        weatherStations.add(new MurskaSobota(apiEndpoint));
        weatherStations.add(new NovoMesto(apiEndpoint));
        weatherStations.add(new Postojna(apiEndpoint));
        weatherStations.add(new SlovenjGradec(apiEndpoint));
        weatherStations.add(new Vogel(apiEndpoint));
        weatherStations.add(new Vojsko(apiEndpoint));
        
        return weatherStations;
    }

}
