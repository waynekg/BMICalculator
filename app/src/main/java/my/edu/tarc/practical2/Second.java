package my.edu.tarc.practical2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ImageView imageView;
        imageView = findViewById(R.id.imageView2);

        Intent intent = getIntent();
        if (intent.hasExtra(MainActivity.TAG_MESSAGE)) {
            Double bmi = intent.getDoubleExtra(MainActivity.TAG_MESSAGE, 0);
            if(bmi <18.5){
                imageView.setImageResource(R.drawable.under);
            }else if (bmi <25){
                imageView.setImageResource(R.drawable.normal);
            }else
                imageView.setImageResource(R.drawable.over);

        }
    }
}
