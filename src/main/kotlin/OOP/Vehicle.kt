package OOP

class Vehicle (owner:String, color:String, wheels:Int, model:String)
{
    init {
        println("Owned by $owner")
        println("Color is $color")
        println("Has $wheels in total")
        println("MOdel is $model ")

    }

}

fun main(args: Array<String>) {
   var owner_one = Vehicle( owner="Sharon", color="Red", wheels=4, model="Toyota")
}