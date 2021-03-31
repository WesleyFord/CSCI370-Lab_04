package com.example.csci370_lab_04;

import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class StudentAsyncTask extends AsyncTask<Void, Void, ArrayList<Student>> {

    private ListView viewToPopulate;
    private Context context;



    public StudentAsyncTask(ListView viewToPopulate, Context context) {
        this.viewToPopulate = viewToPopulate;
        this.context = context;
    }

    @Override
    protected ArrayList doInBackground(Void... voids) {
        StudentDao students = new StudentDao();

        return students.getAllStudents();
    }

    @Override
    protected void onPostExecute(ArrayList<Student> students) {
        super.onPostExecute(students);

        StudentAdapter adapter = new StudentAdapter(context, students);
        viewToPopulate.setAdapter(adapter);
    }
}
