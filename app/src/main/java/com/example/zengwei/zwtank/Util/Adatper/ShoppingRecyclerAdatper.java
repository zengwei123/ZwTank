package com.example.zengwei.zwtank.Util.Adatper;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.zengwei.zwtank.Model.Item.ShoppingItem;
import com.example.zengwei.zwtank.R;

import java.util.List;

/**
 * Created by zengwei on 2018/6/20.
 */

public class ShoppingRecyclerAdatper extends RecyclerView.Adapter<ShoppingRecyclerAdatper.ShoppingRecyclerHolder> {
    private Context context;
    private List<ShoppingItem> shoppingItems;
    public ShoppingRecyclerAdatper(Context context,List<ShoppingItem> shoppingItems){
        this.context=context;
        this.shoppingItems=shoppingItems;
    }

    @Override
    public ShoppingRecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.shoppint_fragment_item, parent,
                false);
        ShoppingRecyclerHolder holder = new ShoppingRecyclerHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(ShoppingRecyclerHolder holder, int position) {
        holder.ShoppingName.setText(shoppingItems.get(position).getShoppingName());
        holder.ShoppingGold.setText("$ "+shoppingItems.get(position).getShoppingGold());
        holder.ShoppingImage.setImageResource(shoppingItems.get(position).getShoppingImage());
    }

    @Override
    public int getItemCount() {
        return shoppingItems.size();
    }

    class ShoppingRecyclerHolder extends RecyclerView.ViewHolder{
        private TextView ShoppingName,ShoppingGold;
        private ImageView ShoppingImage;
        public ShoppingRecyclerHolder(View itemView) {
          super(itemView);
            ShoppingName=itemView.findViewById(R.id.ShoppingName);
            ShoppingGold=itemView.findViewById(R.id.ShoppingGold);
            ShoppingImage=itemView.findViewById(R.id.ShoppingImage);
        }
  }
}
