import scala.collection.mutable.ArrayBuffer

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