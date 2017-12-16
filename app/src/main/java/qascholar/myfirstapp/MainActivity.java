package qascholar.myfirstapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText input;
    EditText input2;
    Button plus;
    Button min;
    Button multi;
    Button div;
    TextView output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = (EditText) findViewById(R.id.input);
        input2 = (EditText) findViewById(R.id.input2);
        output = (TextView) findViewById(R.id.output);
        plus = findViewById(R.id.button1);
        min=findViewById(R.id.button2);
        multi = findViewById(R.id.button3);
        div=findViewById(R.id.button4);

        plus.setOnClickListener(this);
        min.setOnClickListener(this);
        multi.setOnClickListener(this);
        div.setOnClickListener(this);

    }
//    public void clickButton(View view){
//
//        String s = input.getText().toString();
//        String s2 = input2.getText().toString();
//        int x = Integer.parseInt(s);
//        int x2 = Integer.parseInt(s2);
//        output.setText(String.valueOf(x+x2));
////    }
//    public void clickButton1(View view){
//
//        button3.setTextColor(Color.RED);
//    }
    @Override
   public void onClick(View view) {
        String s = input.getText().toString();
        String s2 = input2.getText().toString();
        int x = Integer.parseInt(s);
        int x2 = Integer.parseInt(s2);

        switch (view.getId()){

            case R.id.button1:
                output.setText(String.valueOf(x+x2));
            break;
            case R.id.button2:
//
                output.setText(String.valueOf(x-x2));
                break;
            case R.id.button3:
                output.setText(String.valueOf(x*x2));
                break;
            case R.id.button4:
                output.setText(String.valueOf(x/x2));
                break;

            default:
                break;
        }
    }
}