package gt.task1;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public class AD extends RecyclerView.Adapter < AD.Vholder > {

    List<Uesr> uesrList ;

    public AD(List<Uesr> uesrList) {
        this.uesrList = uesrList;
    }

    class Vholder extends RecyclerView.ViewHolder {

        TextView name , id ,AGE, GANDER,COLLEGE,SPECIALITY,PASSWORD;

        public Vholder(View itemView) {

            super(itemView);
            name = itemView.findViewById(R.id.NAME0) ;
            id = itemView.findViewById(R.id.ID0) ;
            AGE = itemView.findViewById(R.id.AGE0) ;
            GANDER = itemView.findViewById(R.id.GANDER0) ;
            COLLEGE = itemView.findViewById(R.id.COLLEGE0) ;
            SPECIALITY = itemView.findViewById(R.id.SPECIALITY0) ;
            PASSWORD = itemView.findViewById(R.id.PASSWORD0) ;
        }
    }

//**************************************************************************************************//

    @NonNull
    @Override
    public Vholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_temp,parent,false);
        Vholder holder = new Vholder(row) ;
        return holder ;
    }

    @Override ///// *********************************************   //////
    public void onBindViewHolder(@NonNull Vholder holder, int position) {
    Uesr m = uesrList.get(position);
    holder.id.setText(holder.id.getText().toString()+m.getId());
    holder.name.setText(holder.name.getText().toString()+m.getName());
    holder.AGE.setText(holder.AGE.getText().toString()+m.getAge());
    holder.GANDER.setText(holder.GANDER.getText().toString()+m.getGander());
    holder.COLLEGE.setText(holder.COLLEGE.getText().toString()+m.getCollege());
    holder.SPECIALITY.setText(holder.SPECIALITY.getText().toString()+m.getSpeciality());
    holder.PASSWORD.setText(holder.PASSWORD.getText().toString()+m.getPassWard());
    }

    @Override
    public int getItemCount() {
        return uesrList.size();
    }


}
