package inheritance

open class Admin(var adminId: String): Staff(){


    override fun userData() {
        super.userData()
        super.id = "stf"
        println("Admin staff Id : ${id}_$adminId")
    }
}