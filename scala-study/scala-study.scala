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
println(b)
b += (1, 2, 3, 5)
println(b)
b ++= Array(8, 13, 21)
println(b)
b.trimEnd(5)
println(b)
b.insert(2, 6)
println(b)
b.insert(2, 7, 8, 9)
println(b)
b.remove(2)
println(b)
b.remove(2, 3)
println(b)

val aa = Array(2, 3, 5, 7, 11)
val aaResult = for (elem <- aa) yield 2 * elem
println(aaResult[1]) 