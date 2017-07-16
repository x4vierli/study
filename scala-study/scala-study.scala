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

box("Hello")

val nums = new Array[Int](10)