package com.example.app03;

//https://developer.android.com/training/basics/firstapp/building-ui.html

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Объявление полей intent
    Intent intent;
    EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Метод вызываемый при нажатии на кнопку "Передать" (задается в xml)
    public void sendMessage(View view) {

        editText1 = findViewById(R.id.editText1);
        String m = editText1.getText().toString();

        //Создание объекта НАМЕРЕНИЕ. В параметрах класс второй активности
        intent = new Intent(this, DisplayTextActivtiy.class);

        //Параметры передаваемые в полях
        intent.putExtra("message1", m);
        intent.putExtra("message2", "My message2");

        //Запуск новой экземпляра второй активности
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        editText1.setText(data.getStringExtra("message1"));
    }
}
