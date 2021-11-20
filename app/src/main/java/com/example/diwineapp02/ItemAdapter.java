package com.example.diwineapp02;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    private ArrayList<itemModel> itemModelist;

    public ItemAdapter(ArrayList<itemModel> itemModelist) {
        this.itemModelist = itemModelist;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        ItemViewHolder holder = new ItemViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {

        itemModel itemModel = itemModelist.get(position);
        holder.title.setText(itemModel.getTitle());
        holder.description.setText(itemModel.getDescription());

    }

    @Override
    public int getItemCount() {
        return itemModelist.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {
        private TextView title, description;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            description = itemView.findViewById(R.id.description);

        }
    }
}
