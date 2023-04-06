fun main (args: Array <String>){

    var colors = ArrayList<String> ()

    // add values to Array List
    colors.add("mohanad")
    colors.add("Ahmad")
    colors.add("Ali")

    // How to print a value from Array List
    println( colors.get(0))
    // or
    println(colors[0])

    // How to remove a value from Array List
    colors.remove("mohanad")
    println(colors[0])

    //
    colors.set(1,"Wael")

    //
    for (count in colors){
        println(count)
    }

}