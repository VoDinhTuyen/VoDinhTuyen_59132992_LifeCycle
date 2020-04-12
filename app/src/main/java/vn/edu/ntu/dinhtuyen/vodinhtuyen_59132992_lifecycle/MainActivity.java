package vn.edu.ntu.dinhtuyen.vodinhtuyen_59132992_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView txtTG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle", "onCreate call");
        Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle", "onStart call");
        txtTG = findViewById(R.id.txtTG);
        SimpleDateFormat spF = new SimpleDateFormat("HH:mm:ss");
        String date = spF.format(new Date());
        txtTG.setText(date);
        Toast.makeText(getApplicationContext(), "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle", "onRestart call");
        Toast.makeText(getApplicationContext(), "onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle", "onResume call");
        Toast.makeText(getApplicationContext(), "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle", "onPause call");
        Toast.makeText(getApplicationContext(), "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle", "onStop call");
        Toast.makeText(getApplicationContext(), "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle", "onDestroy call");
        Toast.makeText(getApplicationContext(), "onDestroy", Toast.LENGTH_SHORT).show();
    }

}
