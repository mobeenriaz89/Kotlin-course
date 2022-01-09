fun main() {
    //Variables
    var firstName: String? = "Mubeen"
    var lastName: String? = "Riaz"
    val age = 32

println("My name is:".plus(firstName).plus(" ").plus(lastName))
println("My age is:".plus(age))

    //when control flow statement
    when(lastName){
        null -> println("Khan")
        else -> println(lastName)
    }
//initializing vairables using control flow statements
    var myName:String? = if(firstName != null) firstName else "Haseeb"
    println(myName)
    myName = null
    var myNewName = when(myName){
        null -> "Mubeen Riaz :)"
        else -> myName
    }

    println(myNewName)
//Functions
    fun getMyName(): String?{
        return null
    }

    //single expression function
    fun myName() = "Mubeen Riaz"

    println(getMyName())

    //function parameters
    val msg = null
    fun printMyMsg(myMsg: String?){
        when(msg){
            null -> println("green world")
            else -> println(msg)
        }
    }

    printMyMsg(myMsg = msg)

    //String templates
    var theWorldColor = "blue"
    fun printMsg(theMsg: String, theColor: String) = "$theMsg $theColor here"
    println(printMsg("Your world is",theWorldColor))

    //collections and iterations
    //Arrays

    var movies = arrayOf("Terminator", "f9","Hoobs and shaw")
    println(movies.size)
    println(movies[0])
    println(movies[1])
    println(movies[2])

    //iterators

    //for loop
    for(movie in movies){
        println(movie)
    }

    movies.forEach { movie ->
        println("$movie is nice")
    }

    movies.forEachIndexed { index, movie ->
        println("$movie is on $index")
    }

    //Maps

    var maps = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    maps.forEach { (key, value) -> println("$key for $value ") }
    maps[4] = "d"
    //mutable collections
    var mutableList = mutableListOf("a","b","c")
    mutableList.forEach { item -> println(item) }
    mutableList.add("d")
    mutableList.forEach { item -> println(item) }

    fun printMyItems(msg: String, items:List<String>){
        items.forEach{ item ->
            println("$msg $item")
        }
    }

    printMyItems("this item is", mutableList)

    fun testFun() ="HelloBoy"

    fun mytestfun () = testFun()

    //Classes
    /*var person = Person("Mubeen","Riaz")
    person.firstName
    person.lastName*/
    var person = Person()
    person.setValue("mobiiiii")
    //person.nickName = "has"
    person.mName = "cool"
    print("MName: ${person.mName}")
    //person = Person()
    person.setTestVari("cool boy")
    person.testVar = "asdf"
    println("the recent name is:${person.nickName}")
    println("the recent name is:${person.testVar}")

    person.printInfo()
}