package ro.pub.cs.systems.eim.practicaltest01var03;

import android.Manifest;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import ro.pub.cs.systems.eim.practicaltest01var03.R;

public class PracticalTest01Var03MainActivity extends AppCompatActivity {
    private EditText edit_text_1;
    private EditText edit_text_2;
    private Button button_plus, button_minus;
    private TextView result;
    private PlusButtonListener plus_button = new PlusButtonListener();
    private MinusButtonListener minus_button = new MinusButtonListener();


    private class PlusButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            String first_operand = edit_text_1.getText().toString();
            int first_op = Integer.parseInt(first_operand);
            String second_operand = edit_text_2.getText().toString();
            int second_op = Integer.parseInt(second_operand);
            int op = first_op + second_op;
            result.setText(op);
        }
    }

    private class MinusButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            String first_operand = edit_text_1.getText().toString();
            int first_op = Integer.parseInt(first_operand);
            String second_operand = edit_text_2.getText().toString();
            int second_op = Integer.parseInt(second_operand);
            int op = first_op - second_op;
            result.setText(op);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize UI elements
        Button plus_button = (Button)findViewById(R.id.btn_1);
        Button minus_button = (Button)findViewById(R.id.btn_2);


        // Set listeners for plus and minus buttons
        View.OnClickListener PlusButtonListener = null;
        View.OnClickListener MinusButtonListener = null;
        plus_button.setOnClickListener(PlusButtonListener);
        minus_button.setOnClickListener(MinusButtonListener);
    }
}
