package com.example.colman_second_exercise_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.example.colman_second_exercise_android.model.Model;
import com.example.colman_second_exercise_android.model.Student;

public class AddStudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);

        EditText nameEt = findViewById(R.id.addstudent_name_et);
        EditText idEt = findViewById(R.id.addstudent_id_et);
        EditText phoneEt = findViewById(R.id.addStudent_phone_et);
        EditText addressEt = findViewById(R.id.addStudent_address_et);
        CheckBox checkedEt = findViewById(R.id.addStudent_checkBox_cb);
        Button saveBtn = findViewById(R.id.addstudent_save_btn);
        Button cancelBtn = findViewById(R.id.addstudent_cancell_btn);

        saveBtn.setOnClickListener(view -> {
            String name = nameEt.getText().toString();
            String id = idEt.getText().toString();
            String phone = phoneEt.getText().toString();
            String address = addressEt.getText().toString();
            boolean checked = checkedEt.isChecked();
            //to do add student

            Model.addStudent(new Student(name, id, phone, address,"avatar", checked));
            StudentRecyclerList.refresh();
            finish();
        });

        cancelBtn.setOnClickListener(view -> finish());
    }
}