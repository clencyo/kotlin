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
        print("B! Nice trial")
    }
    else if(score>=50){
        print("B-! You can do much better")
    }
    else if(score>=40){
        print("C+! You can do much better")
    }
    else if(score>=30){
        print("D! You can do much better")
    }
    else if(score>=20){
        print("D-! You can do much better")
    }
    else {
        print("Repeat The Exam")
    }
}