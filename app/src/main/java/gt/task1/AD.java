package gt.task1;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public class AD extends RecyclerView.Adapter < AD.Vholder > {

    List<NewM> newMList ;

    public AD(List<NewM> newMList) {
        this.newMList = newMList;
    }

    class Vholder extends RecyclerView.ViewHolder {

        TextView name , id ;

        public Vholder(View itemView) {

            super(itemView);
            name = itemView.findViewById(R.id.Name) ;
            id = itemView.findViewById(R.id.Id) ;
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

    @Override
    public void onBindViewHolder(@NonNull Vholder holder, int position) {
    NewM m = newMList.get(position);
    holder.id.setText(holder.id.getText().toString()+m.id);
    holder.name.setText(holder.name.getText().toString()+m.name);
    }

    @Override
    public int getItemCount() {
        return newMList.size();
    }


}
