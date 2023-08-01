package com.example.xmlscreen.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.xmlscreen.Model.TrendingModel.TrendingData;
import com.example.xmlscreen.R;
import com.example.xmlscreen.Utils.DateTimeConverter;

import java.util.ArrayList;

public class RecyclerSecondAdapter extends RecyclerView.Adapter<RecyclerSecondAdapter.ViewHolder> {


    private ArrayList<TrendingData> dataList;

    public RecyclerSecondAdapter(ArrayList<TrendingData> dataList) {
        this.dataList = dataList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.trending, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        TrendingData item = dataList.get(position);
        if (item != null) {
            // Set category
            if (item.getCategoryModel() != null) {
                holder.category.setText(item.getCategoryModel().getName());
            } else {
                holder.category.setText("N/A");
            }

            // Set name
            if (item.getName() != null) {
                holder.name.setText(item.getName().getName());
            } else {
                holder.name.setText("N/A");
            }

            // Set exw
            if (item.getProductIncoterms() != null && item.getProductIncoterms().size() > 0) {
                if (item.getProductIncoterms().get(0).getIncoTerm() != null) {
                    holder.exw.setText(item.getProductIncoterms().get(0).getIncoTerm().getName());
                } else {
                    holder.exw.setText("N/A");
                }
            } else {
                holder.exw.setText("N/A");
            }

            // Set date
            if (item.getPriceValidity() != null) {
                holder.date.setText(DateTimeConverter.convertDateTimeToDDMMYYYY(item.getPriceValidity()));
            } else {
                holder.date.setText("N/A");
            }

            // Set volume
            if (item.getVolume() != null) {
                try {
                    String stringValue = item.getVolume();
                    double doubleValue = Double.parseDouble(stringValue);
                    int intValue = (int) doubleValue;
                    holder.volume.setText(String.valueOf(intValue));
                } catch (NumberFormatException e) {
                    holder.volume.setText("N/A");
                }
            } else {
                holder.volume.setText("N/A");
            }

            if (item.getProductIncoterms() != null && item.getProductIncoterms().size() > 0) {
                if (item.getProductIncoterms().get(0).getPrice() != null) {
                    try {
                        String stringValue = item.getProductIncoterms().get(0).getPrice();
                        double doubleValue = Double.parseDouble(stringValue);
                        int intValue = (int) doubleValue;
                        holder.price.setText("INR\n" + String.valueOf(intValue) + "\nTaxes & Duties");
                    } catch (NumberFormatException e) {
                        holder.price.setText("INR\nN/A\nTaxes & Duties");
                    }
                } else {
                    holder.price.setText("INR\nN/A\nTaxes & Duties");
                }
            } else {
                holder.price.setText("INR\nN/A\nTaxes & Duties");
            }

            holder.imageView.setImageResource(R.drawable.pic1);
        } else {
        }

    }


    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView category,name,exw,date, volume,price;
        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            category = itemView.findViewById(R.id.category);
            name = itemView.findViewById(R.id.nameProduct);
            exw = itemView.findViewById(R.id.exw);
            date = itemView.findViewById(R.id.validDate);
            volume = itemView.findViewById(R.id.volume);
            price = itemView.findViewById(R.id.priceDetails);
            imageView = itemView.findViewById(R.id.mainImg);
        }
    }
}
