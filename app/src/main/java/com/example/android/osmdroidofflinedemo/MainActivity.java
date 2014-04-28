package com.example.android.osmdroidofflinedemo;

import android.app.Activity;
import android.os.Bundle;

import org.osmdroid.api.IMapController;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;

public class MainActivity extends Activity {

    public static final GeoPoint BERLIN = new GeoPoint(52.516667, 13.383333);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MapView mapView = (MapView) findViewById(R.id.mapview);
        mapView.setClickable(true);
        mapView.setBuiltInZoomControls(true);
        mapView.setMultiTouchControls(true);
        mapView.setUseDataConnection(true);
        mapView.setTileSource(TileSourceFactory.MAPQUESTOSM);

        IMapController mapViewController = mapView.getController();
        mapViewController.setZoom(15);
        mapViewController.setCenter(BERLIN);
    }

}
