package com.example.app01helloworld;

/**
 * Простой пример Андроид приложения
 */

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Объявление переменных для элементов активности
    TextView textView;
    Button button;
    private boolean p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Инициализация элементов активности
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button.setBackgroundColor(Color.LTGRAY);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                //Нажатие на кнопку меняет из первоначального текста в измененный
                if(p = !p) {
                    textView.setText("Привет мир!");
                    button.setText("Кнопка нажата");
                    button.setBackgroundColor(Color.CYAN);
                } else {
                    textView.setText("Hello World!");
                    button.setText("Кнопка");
                    button.setBackgroundColor(Color.LTGRAY);
                }
                break;
        }
    }



    public void onClickButton(View view) {

        if(p = !p) {
            textView.setText("Привет мир!");
            button.setText("Кнопка нажата");
            button.setBackgroundColor(Color.CYAN);
        } else {
            textView.setText("Hello World!");
            button.setText("Кнопка");
            button.setBackgroundColor(Color.LTGRAY);
        }

    }
}
