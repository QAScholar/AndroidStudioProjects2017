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
    Button btn;
    TextView output;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = (EditText) findViewById(R.id.input);
        input2 = (EditText) findViewById(R.id.input2);
        output = (TextView) findViewById(R.id.output);
        btn = (Button) findViewById(R.id.button);
        button3=findViewById(R.id.button3);
        btn.setOnClickListener(this);
        button3.setOnClickListener(this);
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
        switch (view.getId()){
            case R.id.button:
                String s = input.getText().toString();
                String s2 = input2.getText().toString();
                int x = Integer.parseInt(s);
                int x2 = Integer.parseInt(s2);
                output.setText(String.valueOf(x+x2));
            break;
            case R.id.button3:
                button3.setTextColor(Color.RED);
            default:
                break;
        }
    }
}