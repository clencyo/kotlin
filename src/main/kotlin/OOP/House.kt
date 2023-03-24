package OOP

class House(owner:String, location:String, model:String, doors:Int, windows:Int, bedrooms:Int)
{
    init {
        println("Owned by $owner")
        println("Located in $location")
        println("Model is $model")
        println("Has $doors")
        println("Has $windows")
        println("Has $bedrooms")
    }
}

fun main(args: Array<String>) {
    var owner_one = House(owner = "Audia", location = "Nairobi", model = "Bungalow", doors = 5, windows = 12, bedrooms = 8)
}