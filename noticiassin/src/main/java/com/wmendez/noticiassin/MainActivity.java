package com.wmendez.noticiassin;

import android.content.Intent;
import android.os.Bundle;

import com.wmendez.newsreader.lib.ui.FeedListActivity;


public class MainActivity extends FeedListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            Intent intent = new Intent();
            intent.putExtra("title", "Noticias SIN");
            intent.putExtra("uri", "http://feeds.feedburner.com/noticiassin1?format=xml");
            intent.putExtra("resource", com.wmendez.newsreader.lib.R.drawable.ic_action_web_site);
            setIntent(intent);
        }
        super.onCreate(savedInstanceState);
    }

}
