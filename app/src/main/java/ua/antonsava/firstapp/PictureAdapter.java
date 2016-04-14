package ua.antonsava.firstapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Apple on 01.04.2016.
 */
public class PictureAdapter extends RecyclerView.Adapter<PictureAdapter.ViewHolder> {
    private List<Integer> mPictureList;
    private Context mContext;

    public PictureAdapter(Context context, List<Integer> imageList) {
        this.mPictureList = imageList;
        mContext = context;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.image);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_image, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ImageView pictureList = holder.imageView;
        int src = mPictureList.get(position);
        Picasso.with(mContext).load(src).into(pictureList);
    }

    @Override
    public int getItemCount() {
        return mPictureList.size();
    }
}
