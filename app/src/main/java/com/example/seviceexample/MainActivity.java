package com.example.seviceexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_start, btn_stop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_start =(Button) findViewById(R.id.btn_start);
        btn_stop = (Button) findViewById(R.id.btn_stop);


        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(new Intent(getApplicationContext(), MusicService.class));
                // getgetApplicationContext()은 리눅스의 root와 같이 최상위content으로 가져오겠다는것으로 그렇기
                // 때문에 해당 앱을 실행할 때 홈버튼으로 나가도 노래가 틀어진다.
            }
        });

        btn_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent(getApplicationContext(), MusicService.class));

            }
        });



    }
}