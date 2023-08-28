 class User(val name : String, val age : Int) {
     override fun toString(): String {
         return "User(name=$name, age=$age)"
     }
 }

  data class DataUser(val name : String, val age : Int)

fun main(){

    //unuk menampilkan informasi jelas pada class user harus menggunakan fungsi toString
//    val user = User("nrohmen", 17)
//    println(user)

    // kelebihan data class memiliki fungsi equals secara otomatis
//    val dataUser = DataUser("nrohmen", 17)
//    val dataUser2 = DataUser("nrohmen", 17)
//    val dataUser3 = DataUser("dimas", 24)
//
//    println(dataUser.equals(dataUser2))
//    println(dataUser.equals(dataUser3))

//    Destructing Declaration
//    val dataUser = DataUser("nrohmen", 17)
//
//    val name = dataUser.component1()
//    val age = dataUser.component2()
//
//    println("My name is $name, I am $age years old")
}
