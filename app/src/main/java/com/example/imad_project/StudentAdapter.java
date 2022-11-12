package com.example.imad_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder>{

    ArrayList<String[]> list = new ArrayList<>();

    public StudentAdapter(ArrayList<String[]> list, Context context) {
        this.list = list;
        this.context = context;
    }

    Context context;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.single_item_show, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String[] student = list.get(position);
        holder.heading.setText(student[0]);
        holder.subheading.setText(student[1]);
        holder.approve.setText(student[2]);
        holder.status.setText(student[3]);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView heading, subheading, approve, status;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            heading = itemView.findViewById(R.id.mainHead);
            subheading = itemView.findViewById(R.id.mainSubHead);
            approve = itemView.findViewById(R.id.mainApprove);
            status = itemView.findViewById(R.id.mainStatus);
        }
    }
}
