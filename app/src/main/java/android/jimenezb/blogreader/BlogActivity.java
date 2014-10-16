package android.jimenezb.blogreader;

import
        android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;


public class BlogActivity extends Activity {

    protected ProgressBar progressBar;
    protected ListView listview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);

        String [] arraystrings = new String[]{
               "Blog Post 1",
               "Blog Post 2",
               "Blog Post 3",
               "Blog Post 4",

        };

        progressBar = (ProgressBar)findViewById(R.id.progressBar);
        listview = (ListView)findViewById(R.id.listview);

        listview.setEmptyView(progressBar);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arraystrings);
        listview.setAdapter(adapter);

        new  BlogPostTask().execute();
    }

}
