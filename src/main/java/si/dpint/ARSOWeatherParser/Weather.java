package si.dpint.ARSOWeatherParser;


import si.dpint.ARSOWeatherParser.weatherstation.ApiEndpoint;
import si.dpint.ARSOWeatherParser.parser.Parser;
import si.dpint.ARSOWeatherParser.util.Distance;
import si.dpint.ARSOWeatherParser.weatherstation.mannedweatherstation.AllMannedStations;
import si.dpint.ARSOWeatherParser.weatherstation.CallableApiEndpoint;
import si.dpint.ARSOWeatherParser.weatherstation.GeoPoint;
import si.dpint.ARSOWeatherParser.weatherstation.WeatherStation;

import java.util.ArrayList;
import java.util.List;

public class Weather {

    private ForecastListener forecastListener;
    private List<WeatherStation> weatherStations = new ArrayList<>();

    public Weather(){

    }

    public Weather(ForecastListener forecastListener){
        this.forecastListener = forecastListener;
    }

    public void setListener(ForecastListener arsoParserCallback){
        this.forecastListener = arsoParserCallback;
    }

    public void addWeatherStation(WeatherStation weatherStation){
        weatherStations.add(weatherStation);
    }

    public void removeWeatherStation(WeatherStation weatherStation){
        weatherStations.remove(weatherStation);
    }

    public void addWeatherStations(List<WeatherStation> weatherStations){
        this.weatherStations.addAll(weatherStations);
    }

    public void getAllManedStationsForecast(ApiEndpoint apiEndpoint){
        AllMannedStations allMannedStations = new AllMannedStations(apiEndpoint);
        doWeatherForecastParse(allMannedStations);
    }

    public void getForecast(double latitude, double longitude){
        doWeatherForecastParse(getNearestWeatherStation(latitude, longitude));
    }

    public void getForecast(WeatherStation weatherStation){
        doWeatherForecastParse(weatherStation);
    }

    private void doWeatherForecastParse(CallableApiEndpoint apiEndpoint){
        new Parser(forecastListener, apiEndpoint).parse();
    }

    public WeatherStation getNearestWeatherStation(double latitude, double longitude){

        if(weatherStations.size() == 0){
            return null;
        }

        GeoPoint currentLocation = new GeoPoint(latitude, longitude);

        WeatherStation nearestWeatherStation = weatherStations.get(0);
        double nearestDistance = Distance.getDistanceInKm(currentLocation, nearestWeatherStation.getLatLng());
        for (WeatherStation weatherStation :
                weatherStations) {
            double distance = Distance.getDistanceInKm(currentLocation, weatherStation.getLatLng());

            if(distance < nearestDistance){
                nearestDistance = distance;
                nearestWeatherStation = weatherStation;
            }
        }

        return nearestWeatherStation;
    }
}
