import scala.beans.BeanProperty

class Person(val name: String, val age: Int) {
    println("Just constructed another person")
    def description = name + " is " + age + " years old" 
    // // @BeanProperty var name: String = _
    // private var name = ""
    // private var age = 0

    // def this(name: String) {
    //     this()
    //     this.name = name
    // }

    // def this(name: String, age: Int) {
    //     this(name)
    //     this.age = age
    // }
}

// val p1 = new Person
// val p2 = new Person("Fred")
val p3 = new Person("Fred", 42)