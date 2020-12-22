package ir.programmerhive.app.smileratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.MessageFormat;

import ir.programmerhive.lib.SmileRatingBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtRatingBarState = findViewById(R.id.txtRatingBarState);
        SmileRatingBar smileRatingBar = findViewById(R.id.smileRatingBar);

        txtRatingBarState.setText(MessageFormat.format("Rating : {0}", smileRatingBar.getRating()));

        smileRatingBar.setOnRatingBarChangeListener((ratingBar, rate, b) -> {
            txtRatingBarState.setText(MessageFormat.format("Rating : {0}", rate));
        });

    }
}