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
public class PicAdapter extends RecyclerView.Adapter<PicAdapter.ViewHolder>{
private List<MyData> imageList; //[Comment] Whats wrong with formatting?? Wrong name
private Context mContext; //[Comment] Use Alt + shift + L

public PicAdapter(Context context,List<MyData>imageList){
        this.imageList=imageList;
        mContext=context;
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
        ViewHolder myViewHolder = new ViewHolder(view); //[Comment] Your viewholder? Use correct names
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //holder.imageView.setImageResource(imageList.get(position).myPic); //[Comment] Commented code

        ImageView picList = holder.imageView;
        int src = imageList.get(position).getMyPic();
        //File imageFile = new File("assets/images/"+src+".jpg"); //[Comment] Commented code
        Picasso.with(mContext)
                .load(src).resize(340, 400).into(picList); //[Comment] Magic numbers
        //Glide.with(mContext).load(imageFile).into(picList); //[Comment] Commented code
    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }
}
