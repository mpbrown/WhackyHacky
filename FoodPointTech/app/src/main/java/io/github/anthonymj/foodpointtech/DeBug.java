package io.github.anthonymj.foodpointtech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DeBug extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_de_bug);


        button = findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                MilkTask task = new MilkTask();
                task.execute();
                DatabaseHelper dbH = new DatabaseHelper();
                int respcode = dbH.get_myresponsecode();
                String rscStr = Integer.toString(respcode);
                String mytext = "nope";
                if (mytext.isEmpty()){
                    mytext = "yesss";
                }
                Toast.makeText(DeBug.this, mytext, Toast.LENGTH_LONG).show();
            }
        });
        button = findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Toast.makeText(DeBug.this, "works", Toast.LENGTH_LONG).show();
            }
        });
    }
}