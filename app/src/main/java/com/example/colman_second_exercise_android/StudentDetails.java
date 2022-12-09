package com.example.colman_second_exercise_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.example.colman_second_exercise_android.model.Model;
import com.example.colman_second_exercise_android.model.Student;

public class StudentDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        Integer value = intent.getIntExtra("pos", 0);

        Student choosenStudent = Model.getStudent(value);

        TextView nameTxtView = findViewById(R.id.studentdetails_name_txtview);
        TextView idTxtView = findViewById(R.id.studentdetails_id_txtview);
        TextView phoneTxtView = findViewById(R.id.studentdetails_phone_txtview);
        TextView addressTxtView = findViewById(R.id.studentdetails_address_txtview);
        CheckBox checkedCheckBox = findViewById(R.id.studentdetails_checked_checkbox);

        nameTxtView.setText(choosenStudent.getName());
        idTxtView.setText(choosenStudent.getId());
        phoneTxtView.setText(choosenStudent.getPhoneNumber());
        addressTxtView.setText(choosenStudent.getAddress());
        checkedCheckBox.setChecked(choosenStudent.getCb());


        Button editBtn = findViewById(R.id.studentdetails_edit_btn);

        editBtn.setOnClickListener(view -> {
            Intent editPage = new Intent(this, EditStudent.class);
            editPage.putExtra("pos", value);
            startActivity(editPage);
        });
    }
}