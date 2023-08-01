package com.example.xmlscreen.Adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.xmlscreen.Model.AnalyticsModel.AnalyticsData;
import com.example.xmlscreen.R;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private AnalyticsData dataList;

    public RecyclerViewAdapter(AnalyticsData dataList) {
        this.dataList = dataList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if (dataList != null) {
            switch (position) {
                case 0:
                    holder.constraintLayout.setBackgroundResource(R.drawable.recycler1);
                    holder.textView1.setTextColor(Color.parseColor("#FFFFFF"));
                    holder.textView.setTextColor(Color.parseColor("#FFFFFF"));
                    holder.textView.setText((String.valueOf(dataList.getPending())));
                    holder.textView1.setText("PENDING");
                    holder.imageView.setImageResource(R.drawable.group1);
                    break;
                case 1:
                    holder.constraintLayout.setBackgroundResource(R.drawable.recycler2);
                    holder.textView1.setTextColor(Color.parseColor("#526660"));
                    holder.textView.setTextColor(Color.parseColor("#048F5D"));
                    holder.textView.setText(String.valueOf(dataList.getApproved()));
                    holder.textView1.setText("APPROVED");
                    holder.imageView.setImageResource(R.drawable.group2);
                    break;
                case 2:
                    holder.constraintLayout.setBackgroundResource(R.drawable.recycler2);
                    holder.textView1.setTextColor(Color.parseColor("#526660"));
                    holder.textView.setTextColor(Color.parseColor("#E84A4D"));
                    holder.textView.setText(String.valueOf(dataList.getClosed()));
                    holder.textView1.setText("CLOSED");
                    holder.imageView.setImageResource(R.drawable.group3);
                    break;
                case 3:
                    holder.constraintLayout.setBackgroundResource(R.drawable.recycler2);
                    holder.textView1.setTextColor(Color.parseColor("#526660"));
                    holder.textView.setTextColor(Color.parseColor("#FF6C2D"));
                    holder.textView.setText(String.valueOf(dataList.getCancelled()));
                    holder.textView1.setText("CANCELLED");
                    holder.imageView.setImageResource(R.drawable.group4);
                    break;
                case 4:
                    holder.constraintLayout.setBackgroundResource(R.drawable.recycler2);
                    holder.textView1.setTextColor(Color.parseColor("#526660"));
                    holder.textView.setTextColor(Color.parseColor("#FEA203"));
                    holder.textView.setText(String.valueOf(dataList.getDisputed()));
                    holder.textView1.setText("DISPUTE");
                    holder.imageView.setImageResource(R.drawable.group5);
                    break;
                case 5:
                    holder.constraintLayout.setBackgroundResource(R.drawable.recycler2);
                    holder.textView1.setTextColor(Color.parseColor("#526660"));
                    holder.textView.setTextColor(Color.parseColor("#FEA203"));
                    holder.textView.setText(String.valueOf(dataList.getTotal()));
                    holder.textView1.setText("TOTAL");
                    holder.imageView.setImageResource(R.drawable.group1);
                    break;
            }
        }
    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        TextView textView1;
        ImageView imageView;
        ConstraintLayout constraintLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.numStatus);
            textView1 = itemView.findViewById(R.id.status);
            imageView = itemView.findViewById(R.id.iconImg);
            constraintLayout = itemView.findViewById(R.id.row_const);
        }
    }
}
