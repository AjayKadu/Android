package com.example.app1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.MyViewHolder> {

    Context context;
    List<Course> courseList;

    public CourseAdapter(Context context, List<Course> courseList) {
        this.context = context;
        this.courseList = courseList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.course_list,null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Course c = courseList.get(position);
          holder.courseImage.setImageResource(c.getImage());
          holder.courseId.setText("Id: "+ c.getId());
          holder.courseName.setText("Name: "+c.getName());
    }

    @Override
    public int getItemCount() {
        return courseList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView courseImage;

        TextView courseId,courseName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            courseImage=itemView.findViewById(R.id.courseImage);
            courseId=itemView.findViewById(R.id.courseId);
            courseName=itemView.findViewById(R.id.courseName);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, StudentDetails.class);
                    intent.putExtra("Course", courseList.get(getAdapterPosition()));
                    context.startActivity(intent);
                }
            });
        }
    }

}
