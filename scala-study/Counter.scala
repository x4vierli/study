class Counter {
    private var value = 0
    def increment() { value += 1 }
    def current() = value

    def isLess(other: Counter) = value < other.value
}

val myCounter = new Counter 
myCounter.increment()
println(myCounter.current)

private[this] var value = 0