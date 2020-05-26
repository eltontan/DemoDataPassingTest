package sg.edu.rp.c346.id18016094.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    //Step 1
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Step 2
       tvAnswer = findViewById(R.id.textView1);

        Intent intentReceived = getIntent();
        int val = intentReceived.getIntExtra("value", 0);
        tvAnswer.setText("Integer value received is: " + val);

    }
}
