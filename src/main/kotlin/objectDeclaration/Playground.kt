package objectDeclaration

object Play{
    fun letsPlay() = Playground("vbl","volley Ball")
}

class Playground(val id: String, val name: String) {
    override fun toString(): String {
        return "id: $id name: $name"
    }
}

fun main(){
    val doPlay = Play.letsPlay()
    println(doPlay)
}