package si.dpint.ARSOWeatherParser;

import si.dpint.ARSOWeatherParser.parser.Forecast;

import java.util.List;

public interface ForecastListener {
    void forecastReceived(List<Forecast> forecast);
    void forecastError(String errorMessage);
}
