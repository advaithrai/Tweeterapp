package com.codepath.apps.restclienttemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.codepath.apps.restclienttemplate.models.Tweet;

import org.parceler.Parcels;

public class DetailActivity extends AppCompatActivity {

    Context context;
    ImageView ivProfileImage;
    TextView tvScreenName;
    TextView tvBody;
    TextView timeStamp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivProfileImage = findViewById(R.id.ivProfileImage);
        tvScreenName = findViewById(R.id.tvScreenName);
        tvBody = findViewById(R.id.tvBody);
        timeStamp = findViewById(R.id.timeStamp);

        Tweet tweet = Parcels.unwrap(getIntent().getParcelableExtra("tweet"));

        Glide.with(context).load(tweet.user.profileImageUrl).into(ivProfileImage);
        tvScreenName.setText(tweet.user.name);
        tvBody.setText(tweet.body);
        timeStamp.setText(tweet.getFormattedTimestamp());
    }
}
