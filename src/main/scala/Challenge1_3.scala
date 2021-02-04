/*
We're going to create a map of movies and their ratings.
Once we create our map, next we'll use one of the movies as key to get the rating,
then we'll print out all the values in our list.
Finally we'll add a new movie to the list and then reprint the list.

Here's some sample movies that you can use or you can just make up your own.
Finding Nemo rated G,
Finding Dory rated PG,
Men in Black rated PG-13,
The Avengers rated PG-13,
and then add Harry Potter and the Sorcerer's Stone rated PG.
 */


object Challenge1_3 extends App {

  var movies = Map("Nemo" -> "G", "Finding Dory" -> "PG", "Men in Black" -> "PG-13", "The Avengers" -> "PG-13")

  val movie = "Finding Dory"
  println(s"Rating for $movie is " + movies(movie))

  for ((k, v) <- movies) println(s"Rating for $k is " + movies(k))

  movies += ("Harry Potter and the Sorcerer's Stone" -> "PG")

  for ((k, v) <- movies) println(s"Rating for $k is " + movies(k))
}
