package si.dpint.ARSOWeatherParser.parser;

import org.xml.sax.SAXException;
import si.dpint.ARSOWeatherParser.ForecastListener;
import si.dpint.ARSOWeatherParser.weatherstation.CallableApiEndpoint;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

public class Parser implements Downloader.DownloaderCallback {

    private CallableApiEndpoint callableApiEndpoint;
    private ForecastListener forecastListener;

    public Parser(ForecastListener forecastListener, CallableApiEndpoint callableApiEndpoint){
        this.forecastListener = forecastListener;
        this.callableApiEndpoint = callableApiEndpoint;
    }

    public void parse(){
        new Downloader(this, callableApiEndpoint.getUrl()).download();
    }

    public void onDownloadDone(String downloadedText) {
        try {
            XMLParser xmlParser = new XMLParser(downloadedText);
            List<Forecast> forecast = xmlParser.getForecasts();
            forecastListener.forecastReceived(forecast);
        } catch (ParserConfigurationException | IOException | SAXException e) {
            forecastListener.forecastError(e.getMessage());
        }
    }

    public void onDownloadError(String message) {
        forecastListener.forecastError(message);
    }
}
