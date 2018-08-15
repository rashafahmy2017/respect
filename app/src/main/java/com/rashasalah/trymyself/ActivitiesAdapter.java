package com.rashasalah.trymyself;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivitiesAdapter extends BaseAdapter {
    private Context context;
    public static ArrayList<ActivitesData> data= new ArrayList<ActivitesData>();

    public ActivitiesAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public String getItem(int position) {
        return""+ position;
    }
    public static Object getData(int position) {
        return data.get(position);
    }
    public void adapter(ArrayList<ActivitesData> movie) {
        this.data= movie;
    }
    public ArrayList<ActivitesData> getmymovies(){
        return data;
    }
    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = new View(context);
        ImageView imageView;
        TextView title;

        row = LayoutInflater.from(context).inflate(R.layout.grid_item, null);
        imageView = (ImageView) row.findViewById(R.id.image);
        title = (TextView) row.findViewById(R.id.title);
        TextView desc = (TextView) row.findViewById(R.id.desc);
        title.setText(data.get(position).gettitle());
        desc.setText(data.get(position).get_title_data());
        TextView vote_number = (TextView) row.findViewById(R.id.vote_num);
        vote_number.setText(data.get(position).getNumStars());

        imageView.setImageDrawable(context.getResources().getDrawable( R.drawable.ic_launcher_background));
//        Picasso.with(context).load(movie.get(position).getUrl()).into(imageView);

        return row;
    }
}

