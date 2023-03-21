//Build a simple *544 app using when statement
fun main(args: Array<String>) {

    var num:Int = readLine()!!.toInt()

    when(num) {
        0->println("sh20=1GB for 1hr")
        1->println("Data Deals")
        2->println("Daily bundles")
        3->println("Weekly Bundles")
        4->println("GO MONTHLY")
        5->println("GNO Expiry")
        6->println("Video Bundles")
        7->println("Okoa Data")
        8->println("Lipa Mdogo")
        9->println("Data Plus New")
        10->println("Hot minutes")

        else -> println("MORE")
    }
}