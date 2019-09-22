package com.garbo.marrion.lab2garbmarrion;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    EditText etCourse, etCourse1, etCourse2, etCourse3, etCourse4, etCourse5, etCourse6, etCourse7, etCourse8;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        etCourse = findViewById(R.id.Course1);
        etCourse = findViewById(R.id.Course2);
        etCourse = findViewById(R.id.Course3);
        etCourse = findViewById(R.id.Course4);
        etCourse = findViewById(R.id.Course5);
        etCourse = findViewById(R.id.Course6);
        etCourse = findViewById(R.id.Course7);
        etCourse = findViewById(R.id.Course8);
    }
    

    public void check(View v){
        sp = getSharedPreferences("data1", MODE_PRIVATE);
        String courseSP = sp.getString("course", null);
        String course1SP = sp.getString("course1", null);
        String course2SP = sp.getString("course2", null);
        String course3SP = sp.getString("course3", null);
        String course4SP = sp.getString("course4", null);
        String course5SP = sp.getString("course5", null);
        String course6SP = sp.getString("course6", null);
        String course7SP = sp.getString("course7", null);
        String course = etCourse.getText().toString();

        if(courseSP.equals(course) || course2SP.equals(course) || course3SP.equals(course) || course4SP.equals(course) ||
                course5SP.equals(course) || course6SP.equals(course) || course7SP.equals(course)) {
            Toast.makeText(this, "Course offered in UST!", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "Sorry, course not offered in UST.", Toast.LENGTH_LONG).show();
        }
    }

    public void previous(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
