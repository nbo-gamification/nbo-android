package com.example.manuelc.nbo_mobile_android;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class OfficeActivity extends AppCompatActivity {

    List<String> offices = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.offices.add("Mendoza");
        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //set content view AFTER ABOVE sequence (to avoid crash)
        setContentView(R.layout.activity_office);

        CardView cardView = (CardView) findViewById(R.id.office_card_view);
        cardView.setMaxCardElevation(0);
        cardView.setRadius(5);
        cardView.setClickable(true);

        RelativeLayout officeLayout = (RelativeLayout) findViewById(R.id.office_layout);

        for(String office: this.offices) {
            OfficeView newOfficeCard = new OfficeView(this, office, "");
            officeLayout.addView(newOfficeCard);
        }
    }
}
