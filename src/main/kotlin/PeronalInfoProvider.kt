interface PeronalInfoProvider {

    val providerInfo : String

    fun printInfo(person: Person){
        print(providerInfo)
        print(person.printInfo())
    }
}

interface SessionInfoProvider{
    fun getSessionId(){
        print("The default session id")
    }
}

class BasicInfoProvider : PeronalInfoProvider{
    override val providerInfo: String
        get() = "this is the interface property"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        print("some additional text")
    }
}

fun main() {
    var info = BasicInfoProvider()
    info.printInfo(Person())
}

