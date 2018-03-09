package ro.pub.cs.systems.eim.lab03.phonedialer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class PhoneDialerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_dialer);

        final EditText number = (EditText) findViewById(R.id.phoneNumber);

        final Button star = (Button) findViewById(R.id.buttonStar);
        final Button hash = (Button) findViewById(R.id.buttonHash);
        final ImageButton backspace = (ImageButton) findViewById(R.id.backspace);

        Button[] numbersArray = new Button[10];

        for(int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] =
        }

        star.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String currentValue = number.getText().toString();
                number.setText(currentValue + "*");
            }
        });

        hash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = number.getText().toString();
                number.setText(currentValue + "#");
            }
        });

        backspace.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String currentValue = number.getText().toString();
                if(currentValue.length() != 0) {
                    number.setText(currentValue.substring(0, currentValue.length() - 1));}
            }
        });
    }
}
