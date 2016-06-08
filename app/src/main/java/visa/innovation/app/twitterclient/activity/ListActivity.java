package visa.innovation.app.twitterclient.activity;

/**
 * Created by aliyanag on 6/6/2016.
 */

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;

import java.util.ArrayList;

import visa.innovation.app.twitterclient.R;
import visa.innovation.app.twitterclient.adaptors.TwitAdaptor;
import visa.innovation.app.twitterclient.model.Twit;
import visa.innovation.app.twitterclient.services.TwitReceiver;

public class ListActivity extends Activity {

    TwitAdaptor twitAdaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, TwitReceiver.class);
        this.startService(intent);

        ArrayList<Twit> arrayList = new ArrayList<Twit>();

        twitAdaptor = new TwitAdaptor(this,0, R.layout.activity_listview, arrayList);
//        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, mobileArray);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(twitAdaptor);
    }
}
