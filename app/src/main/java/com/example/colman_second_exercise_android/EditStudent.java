package com.example.colman_second_exercise_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.example.colman_second_exercise_android.model.Model;
import com.example.colman_second_exercise_android.model.Student;

public class EditStudent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_student);

        Intent intent = getIntent();
        Integer value = 0;

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            value = extras.getInt("pos");
        }
        Student choosenStudent = Model.getStudent(value);

        EditText nameEditTxt = findViewById(R.id.editstudent_name_edittxt);
        EditText idEditTxt = findViewById(R.id.editstudent_id_edittxt);
        EditText phoneEditTxt = findViewById(R.id.editstudent_phone_edittxt);
        EditText addressEditTxt = findViewById(R.id.editstudent_address_edittxt);
        CheckBox checkedCheckBox = findViewById(R.id.editstudent_checked_checkbox);

        nameEditTxt.setText(choosenStudent.getName());
        idEditTxt.setText(choosenStudent.getId());
        phoneEditTxt.setText(choosenStudent.getPhoneNumber());
        addressEditTxt.setText(choosenStudent.getAddress());
        checkedCheckBox.setChecked(choosenStudent.getCb());


        Button saveBtn = findViewById(R.id.editstudent_save_btn);

        Integer finalValue = value;
        saveBtn.setOnClickListener(view -> {
            choosenStudent.setName(nameEditTxt.getText().toString());
            choosenStudent.setId(idEditTxt.getText().toString());
            choosenStudent.setPhoneNumber(phoneEditTxt.getText().toString());
            choosenStudent.setAddress(addressEditTxt.getText().toString());
            choosenStudent.setCb(checkedCheckBox.isChecked());
            finish();

            Intent editPage = new Intent(this, StudentDetails.class);
            editPage.putExtra("pos", finalValue);
            startActivity(editPage);
        });

        Button deleteBtn = findViewById(R.id.editstudent_delete_btn);

        Integer finalValue1 = value;
        deleteBtn.setOnClickListener(view -> {
            Model.deleteStudent(finalValue1);
            Intent studentListPage = new Intent(this, StudentRecyclerList.class);
            startActivity(studentListPage);
        });

        Button cancelBtn = findViewById(R.id.editstudent_cancel_btn);
        cancelBtn.setOnClickListener(view -> finish());
    }
}