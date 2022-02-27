package objectExpressions

import inheritance.Admin
import inheritance.Staff

class Playground {

}

fun main(){
    //creating instance of inter class using object expression
    var finance = object : Admin("adm"){
        override fun userData() {
            super.userData()
            super.id = "fnc"
            println("Admin in finance staff Id : ${id}_$adminId")
        }
    }
    finance.userData()
}