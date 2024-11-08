package com.example.app2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.MyViewHolder> {

    Context context;

    List<Student> studentList;

    public StudentAdapter(Context context, List<Student> studentList) {
        this.context = context;
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.list_student,null);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Student st = studentList.get(position);
        holder.textName.setText("Name: "+st.getName());
        holder.textRollno.setText("RollNo: "+st.getRollNo());

    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView textRollno,textName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textName=itemView.findViewById(R.id.textName);
            textRollno=itemView.findViewById(R.id.textRollno);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, StudentDetails.class);
                    intent.putExtra("Student",studentList.get(getAdapterPosition()));
                    context.startActivity(intent);
                }
            });

            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {

                    PopupMenu popupMenu = new PopupMenu(context,v);
                    popupMenu.getMenu().add("Delete");
                    popupMenu.show();

                    popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                        @Override
                        public boolean onMenuItemClick(MenuItem item) {
                            studentList.remove(getAdapterPosition());
                            Toast.makeText(context, "Item Deleted", Toast.LENGTH_SHORT).show();
                            notifyDataSetChanged();
                            return false;
                        }
                    });

                    return false;
                }
            });
        }
    }
}
