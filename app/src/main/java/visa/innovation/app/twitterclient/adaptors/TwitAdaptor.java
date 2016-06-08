package visa.innovation.app.twitterclient.adaptors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

import visa.innovation.app.twitterclient.R;
import visa.innovation.app.twitterclient.activity.ListActivity;
import visa.innovation.app.twitterclient.model.Twit;

/**
 * Created by aliyanag on 6/8/2016.
 */
public class TwitAdaptor extends ArrayAdapter<Twit>  {


    public TwitAdaptor(Context context, int resource, int textViewResourceId, List<Twit> Twits) {
        super(context, resource, textViewResourceId, Twits);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position

        Twit twit = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view

        if (convertView == null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_twitter, parent, false);

        }

        // Lookup view for data population

        TextView tvName = (TextView) convertView.findViewById(R.id.twitText);

        TextView tvHome = (TextView) convertView.findViewById(R.id.twitSource);
        TextView tvDate = (TextView) convertView.findViewById(R.id.twitDate);

        // Populate the data into the template view using the data object

        tvName.setText(twit.getText());

        tvHome.setText(twit.getSource());

        tvDate.setText(twit.getDateCreated());

        // Return the completed view to render on screen

        return convertView;
    }

}
