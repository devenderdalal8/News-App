# News App
Project as a part of Android Basics Nanodegree at Udacity

### Project Overview

The goal is to create a News Feed app which gives a user regularly-updated news from the internet 
related to a particular topic, person, or location. 
In this project, use [News API](https://newsapi.org). 
This is a well-maintained API which returns information in a JSON format.

### API Key Note
You need to insert your API key.
Go to a file named `Constants.java` and find the value of API_KEY.
Replace "test" with "YOUR-API-KEY".
```
public val MY_KEY = "YOUR-API-KEY";
```

### Features

* Navigation Drawer
* Fragments
* ViewPager plus TabLayout
* Loaders
* Intent
* JSON Parsing
* Glide
* CardView
* RecyclerView
* Navigation Graph


### Image resources
[Icon](https://www.iconfinder.com/icons/315754/ball_soccer_icon#size=256) by Yannick Lung<br/>
[Icon](https://www.iconfinder.com/icons/2124145/app_essential_science_ui_icon#size=256) by Just Icon

```
MIT License

Copyright (c) 2018 Soojeong Shin

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
# NewsFeed 

I would like to share with you my first app published on the Google Play Store.

[![google-play-badge](https://user-images.githubusercontent.com/33213229/55871467-a23b7000-5bc5-11e9-846e-93a2958f6253.png)](https://play.google.com/store/apps/details?id=com.soojeongshin.newsfeed.free)
[![ic_launcher](https://user-images.githubusercontent.com/33213229/55873557-eda44d00-5bca-11e9-8272-50b56d971696.png)](https://play.google.com/store/apps/details?id=com.soojeongshin.newsfeed.free)

I built the **Guardian NewsFeed** app from scratch. I made use of the design of my News app one of the Android Basics Nanodegree projects, which is on this GitHub, but the code is different from my News app. I added the podcast feature which allows you to stream the guardian podcasts for free.

The differences are as follows.
*	Use the Paging library to load news data gradually and gracefully, so that you do not need to adjust the Number of Items in the Settings
*	Search articles by keyword
*	Add Podcast section. You can listen to Guardian podcasts anywhere, anytime for free, add favorite episodes, download episodes for offline listening
*	Use Constraint layout which allows you to make complex layouts with a flat view hierarchy
*	Use Third-party libraries – Android Architecture Components, Android View Binding, Retrofit, Gson, OkHttp, Glide, Glide Transformations, Timber, Firebase Analytics, Crashlytics
*	Replace Toast message with SnackBar message
*	Minimum SDK is 23, Android 6 (Marshmallow)
*	Add the launcher icon that I created

I’m happy that I was able to build something useful, and I want to thank you for your support.
