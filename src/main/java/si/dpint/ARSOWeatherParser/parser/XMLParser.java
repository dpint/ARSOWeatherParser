package si.dpint.ARSOWeatherParser.parser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

class XMLParser {

    private Document document;

    XMLParser(String xml) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        ByteArrayInputStream input = new ByteArrayInputStream(
                xml.getBytes(StandardCharsets.UTF_8));
        document = dBuilder.parse(input);
    }

    List<Forecast> getForecasts(){
        List<Forecast> forecasts = new ArrayList<>();

        NodeList forecastElements = document.getElementsByTagName("metData");

        for(int i = 0; i < forecastElements.getLength(); i++){
            if(forecastElements.item(i).getNodeType() == Node.ELEMENT_NODE){
                Element element = (Element) forecastElements.item(i);

                Forecast forecast = new Forecast();

                forecast.cloudinessShortText = element.getElementsByTagName("nn_shortText").item(0).getTextContent();
                forecast.temperatureInC = element.getElementsByTagName("t_degreesC").item(0).getTextContent();
                forecast.weatherPhenomenomShortText = element.getElementsByTagName("wwsyn_shortText").item(0).getTextContent();

                forecasts.add(forecast);
            }
        }

        return forecasts;
    }
}
