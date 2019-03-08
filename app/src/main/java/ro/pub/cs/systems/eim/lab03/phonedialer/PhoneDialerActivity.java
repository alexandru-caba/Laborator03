package ro.pub.cs.systems.eim.lab03.phonedialer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class PhoneDialerActivity extends AppCompatActivity {

    public Button button;
    public ImageButton imagButtonCall;
    public ImageButton imagButtonEnd;
    public ImageButton imagButtonDel;
    public EditText editText;

    public class GenericListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Button button1 = (Button) v;
            editText = (EditText) findViewById(R.id.numbertext);
            String alo = String.valueOf(editText.getText().append(button1.getText()));
            editText.setText(alo);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_dialer);
        editText = (EditText) findViewById(R.id.numbertext);
        imagButtonCall = (ImageButton) findViewById(R.id.imageButton);
        imagButtonDel = (ImageButton) findViewById(R.id.imageButton3);
        imagButtonEnd = (ImageButton) findViewById(R.id.imageButton2);

        for()
    }
}
