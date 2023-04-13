package com.example.floating_action;
import static android.view.View.VISIBLE;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.floating_action.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
public class MainActivity extends AppCompatActivity {
    FloatingActionButton fab1, fab2, fab3, fab4;
    boolean flag = false;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fab1 = findViewById(R.id.add);
        fab2 = findViewById(R.id.clr);
        fab3 = findViewById(R.id.lock);
        fab4 = findViewById(R.id.spkr);
        fab2.setVisibility(View.INVISIBLE);
        fab3.setVisibility(View.INVISIBLE);
        fab4.setVisibility(View.INVISIBLE);
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "ADD", Toast.LENGTH_SHORT).show();
                if (flag == false) {
                    fab2.setVisibility(View.VISIBLE);
                    fab3.setVisibility(View.VISIBLE);
                    fab4.setVisibility(View.VISIBLE);
                    flag = true;
                } else {
                    fab2.setVisibility(View.INVISIBLE);
                    fab3.setVisibility(View.INVISIBLE);
                    fab4.setVisibility(View.INVISIBLE);
                    flag = false;
                }
            }
        });
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "CLEAR", Toast.LENGTH_SHORT).show();
            }
        });
        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "LOCK", Toast.LENGTH_SHORT).show();
            }
        });
        fab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "SPEAKER", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
