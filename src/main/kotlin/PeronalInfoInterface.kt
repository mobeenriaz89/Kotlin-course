import inheritance.Admin

interface PeronalInfoInterface {

    val providerInfo : String

    fun printInfo(person: Person){
        print(providerInfo)
        print(person.printInfo())
    }
}

interface SessionInfoInterface{
    fun getSessionId(): String
}

open class BasicInfoProvider : PeronalInfoInterface, SessionInfoInterface{
    override val providerInfo: String
        get() = "this is the interface property"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        print("some additional text")
    }

    override fun getSessionId(): String {
        return "this is Session id"
    }
}

fun main() {
    /*val info = PeronalInfoInterface()
    info.printInfo(Person())*/
    //checkTypes(info)
}

fun checkTypes(infoProvider: PeronalInfoInterface){
    //type checking
    if(infoProvider !is SessionInfoInterface){
        print("isn't a session info provider")
    }else {
        println("is a session info provider")
        //type casting
        println((infoProvider as SessionInfoInterface).getSessionId())
        //smart casting
        println(infoProvider.getSessionId())
    }
}

