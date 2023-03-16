fun main(args: Array<String>) {
    println("Enter Your Weight")
    var weight:Int = readLine()!!.toInt()
    println("Enter Your Height")
    var height:Float = readLine()!!.toFloat()

    var bmi = weight / (height * height)
    if(bmi <= 18){
        println("Underwheight")
    }
    else if (bmi <=29){
        println("Normal weight")
    }
    else if (bmi <=34){
        println("Overweight")
    }
    else {
        println("Obese")
    }
}