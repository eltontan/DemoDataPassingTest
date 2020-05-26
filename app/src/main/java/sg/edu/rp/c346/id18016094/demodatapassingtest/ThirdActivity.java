package sg.edu.rp.c346.id18016094.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    TextView tvAnswer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        //Step 2
        tvAnswer2 = findViewById(R.id.textView2);

        Intent intentReceived = getIntent();
        char character = intentReceived.getCharExtra("character", 'b');
        tvAnswer2.setText("Character value received is: " + character);
    }
}
