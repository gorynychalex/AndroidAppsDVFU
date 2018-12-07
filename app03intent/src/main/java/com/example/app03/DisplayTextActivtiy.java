package com.example.app03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayTextActivtiy extends AppCompatActivity {

    private static final String TAG = "DisplayTextActivtiy";
    //Объявление полей
    Intent intent;
    TextView textViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_text_activtiy);

        // Инициализация поля, в котором будет переданное сообщение
        textViewMessage = findViewById(R.id.message);

        //Получение переданного объекта НАМЕРЕНИЕ (из первой активности)
        intent = getIntent();

        // Получение строки из интента (message1)
        String inputMessage = intent.getStringExtra("message1");

        String inputMessage2 = intent.getStringExtra("message2");

        //Внесение переданных данных в текстовое поле
        textViewMessage.setText(inputMessage);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.putExtra("message1", textViewMessage.getText().toString());
                setResult(1,intent1);
                finish();
            }
        });

    }
}
