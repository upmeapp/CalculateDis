package assaf.zfani.calculatedis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TextView txt1 = (TextView) findViewById(R.id.textView);
        //TextView txt2 = (TextView) findViewById(R.id.textView2);
         ed1 = (EditText) findViewById(R.id.editText);
        //String editText1 = ed1.getText().toString();
         ed2 = (EditText)findViewById(R.id.editText2);
        //int a = Integer.parseInt(editText1);
        double itemcost;
        /*if(txt1 != null && txt2 != null){
            if (txt1.getText().toString()!=""||txt1.getText().toString()!=null&&txt2.getText().toString()!=""||txt2.getText().toString()!=null) {

                final double discount = Double.parseDouble(txt2.getText().toString());
            }
        }*/
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast tst = Toast.makeText(MainActivity.this,Double.parseDouble(ed1.getText().toString())-(Double.parseDouble(ed1.getText().toString())*(Double.parseDouble(ed2.getText().toString())/100)
                )+"",Toast.LENGTH_LONG);
                tst.show();

            }
        });
        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast tst2 = Toast.makeText(MainActivity.this,"The Discount is "+(Double.parseDouble(ed1.getText().toString())*(Double.parseDouble(ed2.getText().toString())/100)),Toast.LENGTH_LONG);
                tst2.show();
            }
        });




    }
}
