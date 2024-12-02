package com.example.vintageshop.adapters;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vintageshop.R;
import com.example.vintageshop.models.HomeCategory;
import com.example.vintageshop.models.MyCartModel;

import java.util.AbstractCollection;
import java.util.List;

public class MyCartAdapter extends RecyclerView.Adapter<MyCartAdapter.ViewHolder> {

    Context context;
    List<MyCartModel> cartModelList;
    int totalPrice = 0;

    public MyCartAdapter(Context context, List<MyCartModel> cartModeList) {
        this.context = context;
        this.cartModelList = cartModeList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.my_cart_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.name.setText(cartModelList.get(position).getProductName());
       ///holder.price.setText(String.valueOf(cartModelList.get(position).getProductPrice()));
        holder.date.setText(cartModelList.get(position).getCurrentDate());
        holder.time.setText(cartModelList.get(position).getCurrentTime());
        holder.quantity.setText(cartModelList.get(position).getTotalQuantity());
       /// holder.totalPrice.setText(String.valueOf(cartModelList.get(position).getTotalPrice()));
        ///holder.totalPrice.setText(String.format("%.2f", cartModelList.get(position).getTotalPrice()));
        ///holder.price.setText(String.format("%.2f", cartModelList.get(position).getProductPrice()));
       /// Log.d("ProductPrice", String.valueOf(cartModelList.get(position).getProductPrice()));

       double priceAsDouble = cartModelList.get(position).getProductPrice();

        holder.price.setText(String.format("%.2f", priceAsDouble));

        //double priceAsDoubleT = cartModelList.get(position).getTotalPrice();


 //pass total amount
        totalPrice = (int) (totalPrice + cartModelList.get(position).getTotalPrice());
        Intent intent = new Intent("MyTotalAmount");
        intent.putExtra("totalAmount", totalPrice);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    @Override
    public int getItemCount() {

        return cartModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name,price,date,time,quantity,totalPrice;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.product_name);
            price = itemView.findViewById(R.id.product_price);
            date = itemView.findViewById(R.id.pcurrent_date);
            time = itemView.findViewById(R.id.current_time);
            quantity = itemView.findViewById(R.id.total_quantity);
            price = itemView.findViewById(R.id.total_price);
        }
    }
}
