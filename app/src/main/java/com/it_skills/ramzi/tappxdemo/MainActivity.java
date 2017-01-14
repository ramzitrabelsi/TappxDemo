package com.it_skills.ramzi.tappxdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private final String TAPPX_KEY = "/120940746/Pub-14153-Android-4322";
    private com.google.android.gms.ads.doubleclick.PublisherAdView adBanner = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adBanner = com.tappx.TAPPXAdBanner.ConfigureAndShowAtBottom(this, adBanner, TAPPX_KEY);

    }
    @Override
    public void onPause() {

        com.tappx.TAPPXAdBanner.Pause(adBanner);

        super.onPause();
    }
    @Override
    public void onResume() {
        super.onResume();

        com.tappx.TAPPXAdBanner.Resume(adBanner);

    }
    @Override
    protected void onDestroy() {

        com.tappx.TAPPXAdBanner.Destroy(adBanner);

        super.onDestroy();
    }
}

