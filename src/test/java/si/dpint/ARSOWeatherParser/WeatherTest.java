package si.dpint.ARSOWeatherParser;


import org.junit.jupiter.api.Test;
import si.dpint.ARSOWeatherParser.weatherstation.ApiEndpoint;
import si.dpint.ARSOWeatherParser.util.MannedStationsLoader;
import si.dpint.ARSOWeatherParser.weatherstation.mannedweatherstation.MurskaSobota;
import si.dpint.ARSOWeatherParser.weatherstation.WeatherStation;

import static org.junit.jupiter.api.Assertions.assertTrue;

class WeatherTest {

    @Test
    void getNearestWeatherStation() {
        Weather weather = new Weather();

        MannedStationsLoader mannedStationsLoader = new MannedStationsLoader(ApiEndpoint.getDefaultEndpoint());
        weather.addWeatherStations(mannedStationsLoader.getMannedStationsList());

        WeatherStation weatherStation = weather.getNearestWeatherStation(46.517990, 16.196470);

        assertTrue(weatherStation instanceof MurskaSobota);
    }
}