package com.codepath.apps.restclienttemplate.models;

import androidx.room.Embedded;

import java.util.ArrayList;
import java.util.List;

public class TweetwithUser {

    @Embedded
    User user;

    @Embedded(prefix = "tweet_")
    Tweet tweet;

    public static List<Tweet> getTweetList(List<TweetwithUser> tweetwithUsers) {
        List<Tweet> tweets = new ArrayList<>();
        for (int i = 0; i < tweetwithUsers.size(); i++)
        {
            Tweet tweet = tweetwithUsers.get(i).tweet;
            tweet.user = tweetwithUsers.get(i).user;
            tweets.add(tweet);
        }
        return tweets;
    }
}
