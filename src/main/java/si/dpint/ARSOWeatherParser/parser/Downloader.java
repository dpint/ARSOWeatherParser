package si.dpint.ARSOWeatherParser.parser;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

class Downloader {

    interface DownloaderCallback{
        void onDownloadDone(String downloadedText);
        void onDownloadError(String message);
    }

    private DownloaderCallback downloaderCallback;
    private String url;
    private OkHttpClient okHttpClient;

    Downloader(DownloaderCallback downloaderCallback, String url){
        this.downloaderCallback = downloaderCallback;
        this.url = url;
        this.okHttpClient = new OkHttpClient();
    }

    void download(){
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = okHttpClient.newCall(request).execute()) {
            downloaderCallback.onDownloadDone(response.body().string());
        } catch (IOException | NullPointerException e) {
            downloaderCallback.onDownloadError(e.getMessage());
        }
    }

}
