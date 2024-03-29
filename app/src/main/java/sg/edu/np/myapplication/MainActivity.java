package sg.edu.np.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    public void followclick (View view) {
//        Button btn = (Button)view;
//        btn.setText("Unfollow");
//        Toast.makeText(getApplicationContext(), "Followed", Toast.LENGTH_SHORT).show();
//        btn.setOnClickListener(this::unfollowclick);
//    }
//
//    public void unfollowclick (View view) {
//        Button btn = (Button)view;
//        btn.setText("Follow");
//        Toast.makeText(getApplicationContext(), "Unfollowed", Toast.LENGTH_SHORT).show();
//
//        btn.setOnClickListener(this::followclick);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textview = (TextView) findViewById(R.id.random);
        Intent myintent = getIntent();
        textview.setText(String.format("MAD %s", myintent.getIntExtra("random", 0)));
        Button followbtn = (Button) findViewById(R.id.btn_follow);
        followbtn.setTag("follow");
        followbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button btn = (Button)v;
                if (btn.getTag() == "follow") {
                    btn.setText("Unfollow");
                    btn.setTag("unfollow");
                    Toast.makeText(getApplicationContext(), "Followed", Toast.LENGTH_SHORT).show();
                } else {
                    btn.setText("Follow");
                    btn.setTag("follow");
                    Toast.makeText(getApplicationContext(), "Unfollowed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}