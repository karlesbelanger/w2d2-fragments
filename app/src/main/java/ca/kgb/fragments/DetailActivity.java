package ca.kgb.fragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        //TextView detailActivity = (TextView) findViewById(R.id.textViewDetailActivity);
       //String detailAtivityLog = getIntent().getStringExtra("debugLog");
    }
    public void goToMain(View view) {

        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);
    }
}
