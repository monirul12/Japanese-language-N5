package com.example.mymusic;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class musicAdapter extends BaseAdapter {
private Context context;
private int layout;
private ArrayList<music> myArrayList;
private MediaPlayer mediaPlayer;
private boolean flag = true;

    public musicAdapter(Context context, int layout, ArrayList<music> myArrayList) {
        this.context = context;
        this.layout = layout;
        this.myArrayList = myArrayList;
    }

    @Override
    public int getCount() {
        return myArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return myArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    public class ViewHolder{
        TextView textView_songName,textView_artist;
        ImageView imageView_play,imageView_stop;
        private View convertView;
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        public ViewHolder(){
            convertView = layoutInflater.inflate(layout,null);
            textView_songName = convertView.findViewById(R.id.textView_music);
            textView_artist = convertView.findViewById(R.id.textView_musicArtist);
            imageView_play = convertView.findViewById(R.id.playMusic);
            imageView_stop = convertView.findViewById(R.id.stopMusic);

        }


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder = new ViewHolder();
        if (convertView == null){
            convertView = viewHolder.convertView;

        }else{


        }
        final music musics=myArrayList.get(position);
        viewHolder.textView_songName.setText(musics.getSongName());
        viewHolder.textView_artist.setText(musics.getArtist());
        viewHolder.imageView_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag){
                    mediaPlayer = MediaPlayer.create(context,musics.getSongs());
                    flag = false;
                }
                if (mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    viewHolder.imageView_play.setImageResource(R.drawable.play_icon);
                }else{
                    mediaPlayer.start();
                    viewHolder.imageView_play.setImageResource(R.drawable.pause_icon);
                }
                mediaPlayer.start();
            }
        });
viewHolder.imageView_stop.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if (!flag){
            mediaPlayer.stop();
            mediaPlayer.release();
            flag = true;
        }viewHolder.imageView_stop.setImageResource(R.drawable.stop_icon);
    }
});
        return convertView;
    }
}
