# ARSOWeatherParser
Simple Java library that parses weather observations provided by ARSO.


## How do I use it
First create an instance of Weather class and set a listener.
```
Weather weather = new Weather();

weather.setListener(new ForecastListener() {
	@Override
	public void forecastReceived(List<Forecast> list) {
		// Do something.
	}

	@Override
	public void forecastError(String s) {
		// Handle error.
	}
});
```
### Examples
Get forecast from a manned station in Murska Sobota.
```
 weather.getForecast(new MurskaSobota(ApiEndpoint.getDefaultEndpoint()));
 ```
 Get forecast from all manned stations in Slovenia.
```
weather.getAllManedStationsForecast(ApiEndpoint.getDefaultEndpoint());
 ```
 #### Get forecast from a nearest weather station based on LatLng coordinates
Weather class instance must know between which weather stations to consider when trying to find the nearest one. You must add them manually! Let's look at some examples.

##### Example 1
Only consider between the weather stations in Ljubljana and Maribor.
 ```
weather.addWeatherStation(new LetEdvardaRusjanaMaribor(ApiEndpoint.getDefaultEndpoint()));
weather.addWeatherStation(new Ljubljana(ApiEndpoint.getDefaultEndpoint()));

weather.getForecast(46.6625, 16.16639);
  ```

##### Example 2
Consider between all manned weather stations. You can use utility class getAllManedStationsForecast to save some time.
 ```
 MannedStationsLoader mannedStationsLoader = new MannedStationsLoader(ApiEndpoint.getDefaultEndpoint());
 weather.addWeatherStations(mannedStationsLoader.getMannedStationsList());

weather.getForecast(46.6625, 16.16639);
  ```
  ## But, I have my own weather station
 You can easily create new weather station by extending WeatherStation class.
 ```
public class MarsWeatherStation extends WeatherStation {

    public MarsWeatherStation(ApiEndpoint apiEndpoint){
        super(apiEndpoint);
    }

    @Override
    protected String getResourcePath() {
        return "mars_weather_LATEST.xml";
    }

    @Override
    public GeoPoint getLatLng() {
        return new GeoPoint(40.730610, -73.935242);
    }
}
 ```
  ## API usage
  You can easily use API provided by ARSO by calling the **ApiEndpoint.getDefaultEndpoint()** static method to get an instance of ApiEndpoint class.

  If you anticipate a lot of calls to the API, you **should** cache the results on your own server and retrieve them from there. Take a look at ApiEndpoint.java file on how to create an instance of ApiEndpoint class that points to your own server.

  ## Attribution
You must attribute data that you retrieve with this library. More on attribution here: http://www.meteo.si/uploads/meteo/help/en/copyright.html

  ## Limits
Currently the library only includes manned weather stations by default, so any other weather station has to be added manually. Forecasts only include current temperature, cloudiness and weather phenomenom. It is possible to add other things, but I didn't have time to do it myself. Pull requests are welcomed.
