package gt.task1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RViow extends AppCompatActivity {

    RecyclerView recyclerView ;

    List<NewM> newMList =new ArrayList<>() ;

    String id [] = {"10" ,"12" ,"30","40","50"} ;
    String name [] = {"asd","cxvd","fdh","yqwe","fcsa"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rviow);

        for (int i=0 ; i < name.length; i++ ){
            NewM nM =new NewM(name[i],id[i]) ;
            newMList.add(nM) ;
        }

        recyclerView = findViewById(R.id.listR) ;

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        AD adaptor =new AD(newMList) ;

        recyclerView.setAdapter(adaptor);


    }
}
