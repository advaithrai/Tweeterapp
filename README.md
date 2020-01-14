 *Twitter App*

**Tweeterapp** is an android app that allows a user to view his Twitter timeline and post a new tweet. The app utilizes [Twitter REST API](https://dev.twitter.com/rest/public). It also has the following functionalities:


  - [ x] User can **compose and post a new tweet**
  - [ x] User can click a “Compose” icon in the Action Bar on the top right
  - [ x] User can then enter a new tweet and post this to twitter
  - [ x] User is taken back to home timeline with **new tweet visible** in timeline
  - [ x] User can **see a counter with total number of characters left for tweet** on compose tweet page
  - [x ] Uses Parceler library to send object data between activities
  - [ x] User can **pull down to refresh tweets timeline**
  - [ x] Infinite pagination continues to add older tweets into the view as it is scrolled down
  - [ x] A clicked tweet sends user to a detail page for the specified tweet
  - [ x] Links posted in tweets are clickable and send user to another page
  - [ x] Image smoothly transitions between main activity and the detail page
  - [x ] User can open app offline and still see the last loaded tweets using persistance




## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='https://github.com/advaithrai/Tweetapp_2/blob/master/second%20tweet%20app%20thingamajig.gif?raw=true' title='Video Walkthrough' width='' alt='Video Walkthrough' />

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Open-source libraries used

- [Android Async HTTP](https://github.com/codepath/CPAsyncHttpClient) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Android

## License

    Copyright [yyyy] [name of copyright owner]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
