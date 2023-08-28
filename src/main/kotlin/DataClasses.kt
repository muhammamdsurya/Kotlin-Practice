// class User(val name : String, val age : Int) {
//     override fun toString(): String {
//         return "User(name=$name, age=$age)"
//     }
// }

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

    // Kita bisa membuat copy dari objek yang telah kita instansiasi
//    val dataUser = DataUser("nrohmen", 17)
//    val dataUser2 = DataUser("nrohmen", 17)
//    val dataUser3 = DataUser("dimas", 24)
//    val dataUser4 = dataUser.copy()
//
//    println(dataUser4)



    //    Destructing Declaration
//    val dataUser = DataUser("nrohmen", 17)
//
//    val name = dataUser.component1()
//    val age = dataUser.component2()
//
//    println("My name is $name, I am $age years old")

    // Mengakses list atau array
//    val numberList = listOf(1, 2, 3, 4, 5)
//    val charList = listOf('a', 'b', 'c')
//
//    println(numberList[3])
//    println(charList[2])

    // Untuk mengubah data list harus menggunakan mutabelListOf
//    val anyList = mutableListOf('a', "Kotlin", 3, true)
//    anyList.add('d') // menambah item di akhir list
//    anyList.add(1, "love") // menambah item pada indeks ke-1
//    anyList[3] = false // mengubah nilai item pada indeks ke-3
//    anyList.removeAt(0) // menghapus item pada indeks ke-0

    //Fungsi setOf Secara otomatis fungsi setOf akan membuang angka yang sama
//    val integerSet = setOf(1, 2, 4, 2, 1, 5)
//    println(integerSet)

    // menggunakan in untuk mengecek apakah ada value di dalam set atau array
//    print(5 in integerSet)

    // Gabungan dan irisan
//    val setA = setOf(1, 2, 4, 2, 1, 5)
//    val setC = setOf(1, 5, 7)
//    val union = setA.union(setC) //gabungan
//    val intersect = setA.intersect(setC) //irisan
//
//    println(union)
//    println(intersect)





}
