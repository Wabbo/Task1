package gt.task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.Serializable;

public class Home extends AppCompatActivity {
 Intent intent  ;
    TextView id, name, age, college, speciality, password;
    TextView gander;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        intent =getIntent() ;
        Uesr uesr = (Uesr) intent.getSerializableExtra("uesrData");

        id = findViewById(R.id.ID0);
        name = findViewById(R.id.NAME0);
        age = findViewById(R.id.AGE0);
        college = findViewById(R.id.COLLEGE0);
        speciality = findViewById(R.id.SPECIALITY0);
        password = findViewById(R.id.PASSWORD0);
        gander = findViewById(R.id.GANDER0);

        id.setText(id.getText()+uesr.getId());
        name.setText(name.getText()+uesr.getName());
        age.setText(age.getText()+uesr.getAge());
        college.setText(college.getText()+uesr.getCollege());
        speciality.setText(speciality.getText()+uesr.getSpeciality());
        password.setText(password.getText()+uesr.getPassWard());
        gander.setText(gander.getText()+uesr.getGander());

        

    }
}
