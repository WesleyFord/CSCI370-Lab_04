package com.example.csci370_lab_04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.student);

        StudentAsyncTask studentAsyncTask = new StudentAsyncTask(list, this);

        studentAsyncTask.execute();
    }
}