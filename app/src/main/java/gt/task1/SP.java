package gt.task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp);

     /*   Intent intent = new Intent(SP.this,MainActivity.class) ;
        startActivity(intent);
        finish();                        // bt2fl el Activity
*/
        Thread timerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1500);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(SP.this,MainActivity.class) ;
                    startActivity(intent);
                    finish();
                }
            }
        }) ;

        timerThread.start();



    }


}
