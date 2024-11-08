package com.sunbeam.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sunbeam.R;
import com.sunbeam.entity.Employee;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewAdapter> {

    Context context;

    List<Employee> employeeList;

    public MyAdapter(Context context, List<Employee> employeeList) {
        this.context = context;
        this.employeeList = employeeList;
    }

    @NonNull
    @Override
    public ViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View view = LayoutInflater.from(context).inflate(R.layout.employee_list_holder,null);

        return new ViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewAdapter holder, int position) {

        holder.textId.setText("Id: "+ employeeList.get(position).getEmpid());
        holder.textName.setText("Name: "+ employeeList.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return employeeList.size();
    }

    class  ViewAdapter extends RecyclerView.ViewHolder {

        TextView textId,textName;

        public ViewAdapter(@NonNull View itemView) {
            super(itemView);

            textId=itemView.findViewById(R.id.textId);
            textName=itemView.findViewById(R.id.textName);
        }
    }
}
