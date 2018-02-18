package com.example.android.rifqyirsyadputra_1202152176_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;

/**
 * Created by Rifqy on 18/02/2018.
 */

public class MenuAdapter extends
        RecyclerView.Adapter<MenuAdapter.MenuViewHolder>{

    private final LinkedList<String> mmakananList;
    private final LinkedList<Integer> mhargaList;
    private final LinkedList<Integer> mgambarList;
    private LayoutInflater mInflater;

    public MenuAdapter(Context context, LinkedList<String> makananList, LinkedList<Integer> hargaList, LinkedList<Integer> gambarList) {
        mInflater = LayoutInflater.from(context);
        this.mmakananList = makananList;
        this.mhargaList = hargaList;
        this.mgambarList = gambarList;
    }

    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.daftar_menu, parent, false);
        return new MenuViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(MenuViewHolder holder, int position) {
        String mCurrentmakanan = mmakananList.get(position);
        Integer mCurrentharga = mhargaList.get(position);
        Integer mCurrentgambar = mgambarList.get(position);

        holder.makananItemView.setText(mCurrentmakanan);
        holder.hargaItemView.setText("Rp."+mCurrentharga.toString());
        holder.gambarItemView.setImageResource(mCurrentgambar);

    }

    @Override
    public int getItemCount() {return mmakananList.size();}


    class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final TextView makananItemView;
        public final TextView hargaItemView;
        public final ImageView gambarItemView;

        final MenuAdapter mAdapter;
        public MenuViewHolder(final View itemView, MenuAdapter adapter) {
            super(itemView);
            makananItemView = (TextView)itemView.findViewById(R.id.tv_makanan);
            hargaItemView = (TextView)itemView.findViewById(R.id.tv_harga);
            gambarItemView = (ImageView)itemView.findViewById(R.id.iv_gambar);
            gambarItemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Get the position of the item that was clicked.
                    int mPosition = getLayoutPosition();
                    // Use that to access the affected item in mWordList.
                    String makanan = mmakananList.get(mPosition);
                    Integer harga = mhargaList.get(mPosition);
                    Integer gambar = mgambarList.get(mPosition);

                    Intent intent = new Intent(itemView.getContext(),ActivityDetailMenu.class);
                    intent.putExtra("makanan",makanan);
                    intent.putExtra("harga",harga);
                    intent.putExtra("gambar",gambar);
                    //intent.putExtra("deskripsi",deskripsi);

                    itemView.getContext().startActivity(intent);
                }
            });
            this.mAdapter = adapter;
        }

        @Override
        public void onClick(View view) {

        }
    }
}
