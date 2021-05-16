package papaya.in.chaptersforupscwale;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    WebView webView;
    private static final String ENROLLMENT_URL = "file:///android_asset/dm.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        TextView textView = findViewById(R.id.tv);

//        InputStream inputStream = null;
//        try {
//            inputStream = getResources().getAssets().open("file:///android_asset/myFile.html");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        String html = IOUtils.toString(inputStream);
//
//        try{
//            InputStream inputStream = getResources().getAssets().open("file:///assets/dm.html");
//            // I also try "UTF-8" but none of them worked
//            BufferedReader r = new BufferedReader(new InputStreamReader(inputStream,"UTF8"));
//            StringBuilder total = new StringBuilder();
//            String html;
//            while ((html = r.readLine()) != null) {
//                total.append(html);
//            }
//            // total contains incorrect characters
//            textView.setText(Html.fromHtml(total.toString()));
//        }
//        catch (IOException exception)
//        {
//            textView.setText("Failed loading HTML."+exception.getMessage());
//        }

        webView = (WebView) findViewById(R.id.local_dialog_webview);
        webView.setWebViewClient(new WebViewClient());

        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);

        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);


        refreshWebView(webView);

    }

    public void refreshWebView(View view) {
        webView.loadUrl(ENROLLMENT_URL);
    }
}
