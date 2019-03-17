package si.dpint.ARSOWeatherParser.weatherstation;

public class ApiEndpoint {
    public static final String DEFAULT_SCHEME = "http";
    public static final String DEFAULT_HOST = "meteo.arso.gov.si";
    public static final String DEFAULT_BASEPATH = "uploads/probase/www/observ/surface/text";
    public static final String DEFAULT_LANGUAGE = "en";

    private String scheme;
    private String host;
    private String basePath;
    private String language;

    public ApiEndpoint(String scheme, String host, String basePath, String language){
        this.scheme = scheme;
        this.host = host;
        this.basePath = basePath;
        this.language = language;
    }

    public String getUrl(){
        return scheme + "://" + host + "/" + basePath + "/" + language + "/";
    }

    public static ApiEndpoint getDefaultEndpoint(){
        return new ApiEndpoint(DEFAULT_SCHEME, DEFAULT_HOST, DEFAULT_BASEPATH, DEFAULT_LANGUAGE);
    }
}
