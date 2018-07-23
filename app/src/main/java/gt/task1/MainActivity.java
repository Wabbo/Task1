package gt.task1;

import android.content.Intent;
import android.os.UserHandle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    CheckBox box ;
    String string ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        box =findViewById(R.id.SAVE) ;

    }


    public void LOGIN(View view) {
      //  Intent intent = new Intent(MainActivity.this,Home.class) ;
        //startActivity(intent);
    }

    public void REGISTER(View view) {
        Intent intent = new Intent(MainActivity.this,Register.class) ;
        startActivity(intent);
    }
    public void TEST(View view) {
        Intent intent = new Intent(MainActivity.this,RViow.class) ;
        startActivity(intent);
    }
}
