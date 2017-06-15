package teamgeny.activityapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Toast.makeText(this, "text : " + getIntent().getExtras().getString("text"), Toast.LENGTH_SHORT).show();
    }
}
