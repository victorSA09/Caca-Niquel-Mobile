package com.mobile.cacaniquel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button voltar;


        voltar = findViewById(R.id.btnVoltar);

        voltar.setOnClickListener(
            new View.OnClickListener(){
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(
                            getApplicationContext(),
                            MainActivity.class
                    );

                    startActivity(intent);

                }
            });
    }


}