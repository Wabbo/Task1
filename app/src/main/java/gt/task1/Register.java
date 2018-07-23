package gt.task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

public class Register extends AppCompatActivity {
    EditText id, name, age, college, speciality, password;
    Spinner gander;

    Button reREGISTER;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        id = findViewById(R.id.ID);
        name = findViewById(R.id.NAME);
        age = findViewById(R.id.AGE);
        college = findViewById(R.id.COLLEGE);
        speciality = findViewById(R.id.SPECIALITY);
        password = findViewById(R.id.PASSWORD);
        gander = findViewById(R.id.GANDER);
    }

    public void reREGISTER(View view) {

        Uesr uesr = new Uesr();

        TextView Tview;
        Tview = (TextView) gander.getSelectedView();

        uesr.setAge(age.getText().toString());
        uesr.setCollege(college.getText().toString());
        uesr.setId(id.getText().toString());
        uesr.setName(name.getText().toString());
        uesr.setSpeciality(speciality.getText().toString());
        uesr.setPassWard(password.getText().toString());
        uesr.setGander(Tview.getText().toString());

        Intent intent = new Intent(Register.this, Home.class);
        intent.putExtra("uesrData",uesr) ;
        startActivity(intent);

        Toast.makeText(this, "Done", Toast.LENGTH_LONG).show();
    }
}
