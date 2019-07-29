package com.example.homework_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.TextUtilsCompat;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.homework_2.R;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    EditText editText;
    Boolean isShow = true;
    String a;
    String b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text_view);
        button = findViewById(R.id.button);
        editText =  findViewById(R.id.edit_text);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            if (a == null) {
                 a = editText.getText().toString();
                textView.setText(a);

            }else if (b == null){
                b = editText.getText().toString();
                textView.setText(b);
            }else if (isShow) {
                    textView.setText(a);
                    isShow = false;
                } else {
                textView.setText(b);
                isShow = true;

            }

            }

        });
    }
}

