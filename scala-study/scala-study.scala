import scala.collection.mutable.ArrayBuffer
import scala.collection.JavaConversions.bufferAsJavaList
import scala.collection.mutable.Map
import scala.collection.JavaConversions.mapAsScalaMap

def abs(x: Double) = if (x >= 0) x else -x

def decorate(str: String, left: String = "[", right: String = "]") = left + str + right

def sum(args: Int*) = {
    var result = 0
    for (arg <- args) result += arg
    result
}

var sumResult = sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

def box(s: String) {
    var border = "-" * s.length + "--\n"
    println(border + "|" + s + "|\n" + border)
}

val nums = new Array[Int](10)
val s = Array("Hello", "World")

val b = ArrayBuffer[Int]()
b += 1
b += (1, 2, 3, 5)
b ++= Array(8, 13, 21)
b.trimEnd(5)
b.insert(2, 6)
b.insert(2, 7, 8, 9)
b.remove(2)
b.remove(2, 3)

val aa = Array(2, 3, 5, 7, 11)
val aaResult = for (elem <- aa) yield 2 * elem
val testSum = Array(1, 7, 2, 9).sum

val bufferResult = ArrayBuffer("Mary", "had", "a", "little", "lamb").max
val bb = ArrayBuffer(1, 7, 2, 9)
val bbStr = bb.mkString("<", ",", ">")

val matrix = Array.ofDim[Double](3, 4)

val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

val muScores = ("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

val testHashMap = new scala.collection.mutable.HashMap[String, Int]

val bobScore = scores("Bob")

val bobScore1 = if (scores.contains("Bob")) scores("Bob") else 0

scores("Bob") = 10
val bobScore2 = scores.getOrElse("Bob", 0)

scores += ("aa" -> 100, "bb" -> 101)

scores -= "aa"
val testAA = scores.getOrElse("aa", 0)

val newScores = scores + ("Bob" -> 999, "Fred" -> 998)

scores.keySet
for (v <- scores.values) println(v)

val olalaScores: scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int]

val t = (1, 3.14, "Fred")
val second = t._2
println(second)

"New York".partition(_.isUpper)

val symbols = Array("<", "-", ">")
val counts = Array(2, 10, 2)
val pairs = symbols.zip(counts)
for ((s, n) <- pairs) Console.print(s * n)