fun main (args: Array<String>){


    // make user to enter a value
    print("Enter your name, please: ")
    var name: String = readln()
    println("Your name is: $name")

    // another example for readline()



    println("Enter number one: ")
    var n1: Int = readLine()!!.toInt()
    println("number tow: ")
    var n2: Int = readLine()!!.toInt()
    var sum = n1+n2
    println("sum = $sum")
}