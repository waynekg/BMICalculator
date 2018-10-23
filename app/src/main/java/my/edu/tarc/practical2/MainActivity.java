package my.edu.tarc.practical2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String TAG_MESSAGE = "my.edu.tarc.practical2.MESSAGE";
    private EditText editWeight;
    private EditText editHeight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editWeight = findViewById(R.id.weight);
        editHeight = findViewById(R.id.height);

    }

    public void calculate(View view){
        String stringWeight;
        String stringHeight;
        if(TextUtils.isEmpty(editWeight.getText())){
            editWeight.setError("Please enter your Weight!");
            return;
        }else if(TextUtils.isEmpty(editHeight.getText())){
            editHeight.setError("Please enter your Height!");
            return;
        }

        stringWeight = editWeight.getText().toString();
        stringHeight = editHeight.getText().toString();

        Double weight = Double.parseDouble(stringWeight);
        Double height = Double.parseDouble(stringHeight)/100;

        Double bmi = weight/(height*height);

        Intent intent = new Intent(this, Second.class);
        intent.putExtra(TAG_MESSAGE, bmi);
        startActivity(intent);
    }
}
