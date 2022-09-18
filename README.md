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

I built the **NewsFeed** app from scratch. I made use of the design of my News app one of the Android Basics Nanodegree projects, which is on this GitHub, but the code is different from my News app. I added the podcast feature which allows you to stream the guardian podcasts for free.

The differences are as follows.
*	Use the Pagination to load news data gradually and gracefully, so that you do not need to adjust the Number of Items in the Settings
*	Use Constraint layout which allows you to make complex layouts with a flat view hierarchy
*	Use Third-party libraries – Android Architecture Components, Android View Binding, Retrofit, Gson, OkHttp, Glide, Glide Transformations, Timber, Firebase Analytics, Crashlytics
*	Replace Toast message with SnackBar message
*	Minimum SDK is 23, Android 6 (Marshmallow)
*	Add the launcher icon that I created
* You can save your news post

I’m happy that I was able to build something useful, and I want to thank you for your support.
