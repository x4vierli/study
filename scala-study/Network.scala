import scala.collection.mutable.ArrayBuffer

class Network {
    class Member(val name: String) {
        val contacts = new ArrayBuffer[Member]
    } 

    private val members = new ArrayBuffer[Member]

    def join(name: String) = {
        val m = new Member(name)
        members += m
        m
    }
}

val chatter = new Network
val myFace = new Network

val fred = chatter.join("Fred")
val wilma = chatter.join("Wilma")
fred.contacts += wilma
val barney = myFace.join("Barney")
// fred.contacts += barney

object Account {
    private var lastNumber = 0
    def newUniqueNumber() = { lastNumber += 1; lastNumber }
}