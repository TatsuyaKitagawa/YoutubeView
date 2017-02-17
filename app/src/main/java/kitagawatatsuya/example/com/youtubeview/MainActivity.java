package kitagawatatsuya.example.com.youtubeview;

import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.WindowDecorActionBar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import android.widget.VideoView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // String path= Environment.getExternalStorageDirectory().getPath();
        videoView=(VideoView)findViewById(R.id.video);
//        videoView.setVideoPath("PHONECARD/");
//        Toast.makeText(MainActivity.this,path+"/.mp4",Toast.LENGTH_SHORT).show();
       String path="android.resource://kitagawatatsuya.example.com.youtubeview/"+R.raw.sample;
        Uri uri=Uri.parse(path);
        videoView.setVideoURI(uri);
        videoView.start();
        videoView.setOnClickListener(videoClick);
    }

    public View.OnClickListener videoClick= new View.OnClickListener(){
       @Override
        public void onClick(View v){
                if(videoView.isPlaying()){
                    videoView.pause();
                }else{
                    videoView.start();
                }
        }
    };

}
