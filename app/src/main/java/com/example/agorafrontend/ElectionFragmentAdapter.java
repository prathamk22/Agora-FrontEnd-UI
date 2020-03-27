package com.example.agorafrontend;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.agorafrontend.Activity.ElectionDetails;

public class ElectionFragmentAdapter extends RecyclerView.Adapter<ElectionFragmentAdapter.ViewHolder> {
    Context context;
    String state;

    public ElectionFragmentAdapter(Context context, String state) {
        this.context = context;
        this.state = state;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.home_page_item_holder, null, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        switch (state){
            case "ACTIVE" :
                holder.linearLayout.setBackground(context.getResources().getDrawable(R.drawable.active_state));
                break;
            case "TOTAL" :
                if (position%2==0){
                    holder.linearLayout.setBackground(context.getResources().getDrawable(R.drawable.active_state));
                }else if(position%3==0){
                    holder.linearLayout.setBackground(context.getResources().getDrawable(R.drawable.pending_state));
                }else{
                    holder.linearLayout.setBackground(context.getResources().getDrawable(R.drawable.finished_state));
                }
                break;
            case "PENDING" :
                holder.linearLayout.setBackground(context.getResources().getDrawable(R.drawable.pending_state));
                break;
            case "FINISHED" :
                holder.linearLayout.setBackground(context.getResources().getDrawable(R.drawable.finished_state));
                break;
        }
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout linearLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, ElectionDetails.class);
                    context.startActivity(intent);
                }
            });
            linearLayout = itemView.findViewById(R.id.linearLayout);
        }
    }
}
