package com.dislacode.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView = (WebView) findViewById(R.id.myWebView);

        String myHtmlString = "<html><body>" +
                "<h2>This is a HTML Heading in Android WebView.</h2>\n" +
                "<p>This is a HTML paragraph in android WebView.</p>\n" +
                "\n" +
                "<h4>Following is HTML Table in WebView</h4>\n" +
                "<table border=\"1\" width=\"100%\">\n" +
                "  <tr>\n" +
                "    <td>Android</td>\n" +
                "    <td>WebView</td>\t\t\n" +
                "    <td>100</td>\n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "    <td>Android</td>\n" +
                "    <td>WebView</td>\t\t\n" +
                "    <td>200</td>\n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "    <td>Android</td>\n" +
                "    <td>WebView</td>\t\t\n" +
                "    <td>300</td>\n" +
                "  </tr>\n" +
                "</table>" +
                "</body></html>";
        mWebView.loadData(myHtmlString, "text/html", null);
    }
}
