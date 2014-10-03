package android.jimenezb.blogreader;

import
        android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ProgressBar;


public class BlogActivity extends Activity {

    protected ProgressBar progressBar;
    protected ListView listview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);

        progressBar = (ProgressBar)findViewById(R.id.progressBar);
        listview = (ListView)findViewById(R.id.listview);

        listview.setEmptyView(progressBar);
    }

}
