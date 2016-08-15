package jp.techacademy.yuichi.otsuka.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText form1;
    EditText form2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        form1 = (EditText) findViewById(R.id.form1);

        form2 = (EditText) findViewById(R.id.form2);

        Button buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(this);

        Button buttonSbt = (Button) findViewById(R.id.buttonSbt);
        buttonSbt.setOnClickListener(this);

        Button buttonMlp = (Button) findViewById(R.id.buttonMlp);
        buttonMlp.setOnClickListener(this);

        Button buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonDiv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ResultActivity.class);
        if (v.getId() == R.id.buttonAdd) {
            intent.putExtra("VALUE1", Double.valueOf(form1.getText().toString()) + Double.valueOf(form2.getText().toString()));
        } else if (v.getId() == R.id.buttonSbt) {
            intent.putExtra("VALUE1", Double.valueOf(form1.getText().toString()) - Double.valueOf(form2.getText().toString()));
        } else if (v.getId() == R.id.buttonMlp) {
            intent.putExtra("VALUE1", Double.valueOf(form1.getText().toString()) * Double.valueOf(form2.getText().toString()));
        } else if (v.getId() == R.id.buttonDiv) {
            intent.putExtra("VALUE1", Double.valueOf(form1.getText().toString()) / Double.valueOf(form2.getText().toString()));
        }
        startActivity(intent);
    }
}
