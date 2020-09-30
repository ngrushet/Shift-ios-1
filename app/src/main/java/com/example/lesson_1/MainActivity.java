package com.example.lesson_1;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    private TextView dateText;
    private EditText firstname, secondname, password, passwordcheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstname = (EditText)findViewById(R.id.firstname);
        secondname = (EditText)findViewById(R.id.secondname);
        password = (EditText)findViewById(R.id.password);
        passwordcheck = (EditText)findViewById(R.id.passwordcheck);
        dateText = findViewById(R.id.date_text);
        //если нажали на датапикер
        findViewById(R.id.datepicker_but).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }
        });
        //если нажали кнопку Регистрация
        findViewById(R.id.regbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                go dalshe
                Login();
            }
        });
    }

    public void Login(){
        if((nputing.checkPass(String.valueOf(password))) &&
                (nputing.isAlpha(String.valueOf(firstname))) &&
                (nputing.isAlpha(String.valueOf(secondname))) &&
                (nputing.proofPass((String.valueOf(password)), (String.valueOf(passwordcheck)))))
        {
            // Выполняем переход на другой экран:
            Intent intent = new Intent(MainActivity.this,second.class);
            startActivity(intent);
        }
    }

    public void showDatePickerDialog(){
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,
                this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        String date = dayOfMonth+ "." + (month+1) + "." + year;
        dateText.setText(date);
    }

}
