//class Person(_firstName: String, _lastName: String){
/*class Person(val firstName: String, val lastName: String){

    //1st method to init
    *//*var firstName = _firstName
    var lastName = _lastName*//*

    //2nd method to init( init's are executed in the sequence of code)
    init {
       *//* firstName = _firstName
        lastName = _lastName*//*
        print("$firstName $lastName in init")
    }

    //secondary constructor
    constructor() : this("Haseeb","Riaz"){
        print("$firstName $lastName in secondary constructor")
    }
}*/
//default parameter values
class Person(val firstName: String = "Peter", val lastName: String = "John"){


    // to override getter and setter provided by koltin
    var nickName: String? = null
        private set
        /*set(value) {
            field = value
            print("the new nickname is $value \n")
        }*/
        get() {
            print("the returned value is :$field")
            return field
        }

    fun setValue(myVal:String){
        nickName = myVal
    }
    var mName: String? = null

    init{
           print("the new nickname is $nickName \n")
    }

    fun printInfo(){
        //val nicknametoprint = if(nickName != null) nickName else "somebody"
        //elvis operator
        val nicknametoprint = nickName ?: "somebody"
        print("$firstName $lastName $nicknametoprint")
    }

}