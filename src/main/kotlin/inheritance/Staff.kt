package inheritance

open class Staff {
    protected open var id: String? = null
        set(value) {
            field = value
        }

    open fun userData(){
        println("Staff id: $id")
    }

}