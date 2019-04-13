package com.example.lee.googlemaps;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

public class UserViewHolder extends RecyclerView.ViewHolder {

    public TextView txtEmail;

    public UserViewHolder(View itemView) {
        super(itemView);
        txtEmail = itemView.findViewById(R.id.tv_email);

        //try fix
        /*itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create interface itemClickListener
            }
        });*/
    }
}
