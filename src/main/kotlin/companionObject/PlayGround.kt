package companionObject

class PlayGround private constructor(val id: String){

    companion object {
        fun createInst() = PlayGround("someId")
    }
}

fun main(){
    val inst = PlayGround.createInst()  //Java: val inst = PlayGround.Companion.createInst()
    
}