package sg.edu.np.s10203441;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void pressedButton (View view) {
        Log.d("debug", "button 0");
        Button btn = (Button)view;
        btn.setText("Clicked");
    }

    public void pressedButton1 (View view) {
        Log.d("debug","button 1");
    }

    public void pressedButton2 (View view) {
        Log.d("debug", "button 2");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("debug", "Create");

        EditText txt = findViewById(R.id.input);
        txt.setText("Hello");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("debug", "Start");
        Log.d("status","Launched");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("debug", "Stop");
        Log.d("status","Closed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("debug", "Destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("debug", "Pause");
        Log.d("status","Switched");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("debug", "Resume");
        Log.d("status","Launched");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("debug", "Restart");
    }
}