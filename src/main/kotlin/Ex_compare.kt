fun main(args: Array<String>) {
    println("Enter Number")
    var number:Int = readLine()!!.toInt()

    if(number ==0) {
        print("Sh20=1GB for 1hr")
    }
    if(number ==1){
        print("Data Deals")
    }
    if(number ==2){
        print("Daily Bundles")
    }
    if(number ==3){
        print("Weekly Bundles")
    }
    if(number ==4){
        print("GO MONTHLY")
    }
    if(number ==5) {
        print ("No Expiry")
    }
}