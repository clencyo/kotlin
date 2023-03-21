fun main(args: Array<String>) {

    var point:Int = readLine()!!.toInt()

    when(point) {
        1->println("GO TO FIRST FLOOR")
        2->println("GO TO SECOND FLOOR")
        3->println("GO TO THIRD FLOOR")
        4->println("GO TO FOURTH FLOOR")

        else -> println("Not Available after fourth floor")
    }
}