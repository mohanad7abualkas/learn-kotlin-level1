fun main (args: Array<String>) {

    for (x: Int in 1..10){
        print(" أستغفر الله")
    }
    println()

    for (x: Char in 'a' .. 'z'){
        print("$x ")
    }
    println()

    for (x:Int in 20 downTo 0 step 2) {
        print("$x ")
    }
    println()

    // for loop متداخلة
    for (i: Int in 1..3){
        for (x: Int in 1..25){
            print("*")
        }
        println()
    }
}