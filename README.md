# This is My Solution for the Java Plumbr Puzzle # 

The Puzzle info

[https://plumbr.eu/blog/java-puzzle](https://plumbr.eu/blog/java-puzzle)


The oficial solution: 

[https://plumbr.eu/blog/java-puzzle-solution](https://plumbr.eu/blog/java-puzzle-solution)

I solved before the time runs out :)

<blockquote class="twitter-tweet" lang="en"><p>I just solved a Java Performance Puzzle by <a href="https://twitter.com/JavaPlumbr">@javaplumbr</a>. Are you up for a challenge? <a href="https://t.co/UvRFu8wnpX">https://t.co/UvRFu8wnpX</a>&#10;<a href="https://twitter.com/hashtag/java?src=hash">#java</a> <a href="https://twitter.com/hashtag/puzzle?src=hash">#puzzle</a> <a href="https://twitter.com/hashtag/challenge?src=hash">#challenge</a></p>&mdash; Anderson Vaz (@aavaz) <a href="https://twitter.com/aavaz/status/547450178752372737">December 23, 2014</a></blockquote>
<script></script>

<script async src="//platform.twitter.com/widgets.js" charset="utf-8"></script>

# Official README #

This is a Java puzzle calculating a secret. As you might guess, your goal is to discover the secret. With the current version of the application it is going to take ages (we honestly do not know, but on a typical desktop we are speaking about years).

If you are up for the challenge then your goal is to decrease the running time of this application below 30 seconds and discover the secret along the way. If you are able to solve the secret, you will have eternal satisfaction, knowing that you were able to conquer the almighty Java Performance Beasts.

### Constraints ###

* You are not allowed to change anything in package ``internal''

### Notes ###
 * The puzzle requires internet connection to acquire input data for the calculations
 * The solution reveals a URL. In case you reveal a URL whose DNS record cannot be resolved, you still have some work to do
 

### How to run ###
Use either 
```
#!bash

run.sh
```
 script or 
```
#!java

./gradlew run
```
 command