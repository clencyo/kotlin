fun main(args: Array<String>) {
    println("Enter Scores")
    var score:Int = readLine()!!.toInt()

    if(score >=80 ){
        print("A! Congratulations")
    }
    else if(score>=70){
        print("B+! Excellent")
    }
    else if(score>=60){
        print("c! You can do much better")
    }
    else {
        print("Repeat The Exam")
    }
}